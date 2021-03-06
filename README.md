# Vue.js 个人学习

Vue的八个生命周期的钩子函数

beforeCreate(实例创建前)

实例组件刚开始创建，元素dom和数据都还没有初始化
应用场景：可以在这加个loading事件

created(实例创建后)

数据data已经初始化完成，方法也已经可以调用，但是dom为渲染，在这个周期里面如果进行请求是可以改变数据并渲染，由于dom未挂载，请求过多或者占用时间过长会导致页面线上空白应用场景：在这结束loading，还做一些初始化，实现函数自执行
beforeMoute(元素挂载前)

dom未完成挂载，数据初始化完成，但是数据的双向绑定还是{{}}，这是因为vue采用了虚拟dom技术
mouted(元素挂载后)

数据和dom都完成挂载，在上一个周期占位的数据把值渲染进去，一般请求会放在这个地方，因为这边请求改变数据之后刚好能渲染
beforeUpdate(实例更新前)

只要是页面数据改变了都会触发，数据更新之前，页面数据还是原来的数据，当你请求赋值一个数据的时候就会执行这个周期，如果没有数据改变不执行
updated(实例更新后)

只要是页面数据改变了都会触发，数据更新完毕，页面的数据是更新完成的

beforeUpdated和updated要谨慎使用，因为页面更新数据的时候都会触发，在这里操作数据很影响性能和死循环

beforeDestory(实例销毁前)

实例销毁之前调用，在这一步，实例仍然完全可用
destory(实例销毁后)

Vue实例销毁后调用，调用后，Vue实例指示的所有内容都会解除绑定，所有的事件监听器都会被移除，所有的子实例也会被销毁
讲一下开发者经常会犯的错误，就是关于Vue的钩子函数中使用箭头函数的问题。这个问题觉得有必要提出来，毕竟自己在开发过程中，经常会踩这些坑。

生命周期钩子的 this 上下文指向调用它的 Vue 实例

不要在选项 property 或回调上使用箭头函数，比如

created()=>console.log('a')或者vm.$watch('a',newValue=>this.myMethod())，因为箭头函数并没有this，this会作为变量一直向上级词法作用域查找，直至找到为止。

经常出现如下错误

Uncaught TypeError: Cannot read property of undefined
Uncaught TypeError: this.myMethod is not a function
这一点需要非常注意。

********************************************************************************************************

安装完Vue cli3 之后，还想用vue-cli2.x 版本

Vue CLI 3 和旧版使用了相同的vue命令，所以 Vue CLI 2 (vue-cli) 被覆盖了。如果你仍然需要使用旧版本的vue init功能，你可以全局安装一个桥接工具：

## npm install -g @vue/cli-init                 //安装完后 就还可以使用 vue init 命令

## 调试运行命令:  3.0启动        npm run serve

## vue init webpack vue-cli-2-demo   

## 调试运行命令:  2.0启动         npm run dev

```
Vue执行流程分析

// 单文件组件中常见代码
export default {
  data () {
    return {
      msg: 'click me'
    }
  },
  methods: {
    say () {
      this.msg = 'well done'
    }
  }
}

// 入口文件中的常见代码
new Vue({
  el: '#app',
  router: router,
  render: h => h(App)
})

一切都显得那么自然。不过在百忙之中是否有小伙伴想过，一个小小的Vue实例怎么有这么大的能量，竟然可以构建出如此复杂的前端项目。那么Vue内部是如何运转的呢，做了哪些事情呢，从今天开始跟着我一探究竟。

vue是可以运行在多平台上的如浏览器，weex等，本文只分析vue在浏览器环境下的主线执行流程。

初始化
我们先看一下Vue的构造函数：

// Vue构造函数
function Vue (options) {
  if (process.env.NODE_ENV !== 'production' &&
    !(this instanceof Vue)
  ) {
    warn('Vue is a constructor and should be called with the `new` keyword')
  }
  // 执行初始化逻辑
  this._init(options)
}

从Vue的构造函数中可以看到，当我们执行new Vue()的时候，只执行了一个_init方法。_init会根据传入的选项对vue进行初始化。 props、data、生命周期，事件机制的初始化都是在此过程中完成的。

以data的初始化为例，vue会通过 Object.defineProperty 的方式将data的属性定义到vue实例上。这也就解释了为什么我们可以在vue中通过对 this.msg 进行赋值，可以修改data中属性的值了。

以上对data的处理只是刚刚开始。为了能实现所谓的响应式或者数据驱动更新，vue又做了进一步的处理，具体做法是，创建一个observer对象，该对象与data绑定，通过 Object.defineProperty 将data中的所有的属性转换成getter/setter。当data中的属性在vue实例中被访问（会触发getter），observer 对象就会把该属性收集为watcher实例的依赖，之后当data中的属性在vue实例中被改变（会触发setter）， observer 会通知依赖该属性的 watcher 实例重新渲染页面。

注：每个watcher都对应一个vue实例

以上处理流程串在一起，vue就实现了通过修改 this.msg 从而触发页面的自动更新。

最后借用vue官网上的一张示意图帮助大家再理解下这个处理过程： 

模板解析
通过上面的分析，我们已经知道当数据发生变化时，会触页面的重新渲染。接下来我们分析下vue是如何进行渲染的。

首先，vue会把将我们编写的HTML模板解析成一个AST描述对象，该对象是通过children和parent链接而成的树形结构，完整地描述了HTML标签的所有信息。

例如有如下HTML模板:

<div id="app">
    <p>{{msg}}</p>
</div>

最终会解析成如下形式的AST对象：

{
   attrs: [{name: "id", value: ""app"", dynamic: undefined, start: 5, end: 13}],
   attrsList: [{name: "id", value: "app", start: 5, end: 13}],
   attrsMap: {id: "app"},
   children: [{
        attrsList: [],
        attrsMap: {},
        children: [],
        end: 33,
        parent: {type: 1, tag: "div", ...},
        plain: true,
        pre: undefined,
        rawAttrsMap:{},
        start: 19
        tag: "p",
        type: 1
   }],
   end: 263,
   parent: undefined,
   plain: false,
   rawAttrsMap:{id: {name: "id", value: "app", start: 5, end: 13}},
   start: 0
   tag: "div",
   type: 1
}

然后 vue 根据AST对象生成 render 函数，该函数的函数体大致如下：

with(this){
    return _c('div', {attrs:{"id":"app"}}, [_c('p', [_v(_s(msg))])])
}

也就是说，我们的模板最终在vue内部都是会以一个render函数的形式存在。

vue官网上对此也有提及，一般推荐大家使用template，el等方式来指定模板，此外还可以通过使用render来自定义个性化的编译函数，不过vue内部最终都会解析成render函数。

先虚后实
我们得到render函数之后，vue并未直接渲染成DOM树，而是先通过render函数得到一个vnode。实际上这一步是非常有必要的，我们都知道频繁大量地操作DOM节点是极耗性能的。vue在渲染之前通过对vnode的比较，可以大大规避非必要的DOM操作。下面是一个vnode大致结构：

{
    tag: "div",
    children: [{tag: "p", ...}],
    data: {attrs: {id: "app"}}
    elm: DOM节点（div#app）,
    parent: undefined,
    context: Vue实例,
    ...
}

最后，vue根据diff之后的结果，执行真正的dom节点的插入更新删除等操作，同时触发vue实例的生命周期钩子函数。之后，vue要做的就是观察数据的变化，进而决定是否重新渲染页面了。

大体总结起来就是先对选项对象初始化，通过Object.defineProperty建立一套响应式系统，然后将模板解析成render函数，
然后使用render函数生成vnode，在渲染前，对vnode进行diff操作，最后进行必要的渲染。
```
