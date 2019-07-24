// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './vuex/store'
import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'
import '@/common/stylus/index.styl'
import '@/common/font/iconfont.css'
import 'lib-flexible'
import axios from '../node_modules/axios' ///导入 axios 

Vue.use(MintUI)
Vue.config.productionTip = false

let xlsn0w = 'xlsn0w'

/* eslint-disable no-new */
router.beforeEach((to, from, next) => {
  // NProgress.start();
  if (to.path == '/login') {
    sessionStorage.removeItem('userInfo');
  }
  
  let userInfo = JSON.parse(sessionStorage.getItem('userInfo'));
  // if (!userInfo && to.path != '/account/login') {
  //   next({ path: '/account/login' })
  // } else {
  //   next()
  // }                                   //默认可选择暂时不登录
  next()
  console.log(this.xlsn0w)
})

Vue.prototype.$axios = axios; ///new Vue()中配置

new Vue({
  el: '#app',
  router,
  store,
  axios,
  components: { App },
  template: '<App/>'
})