import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/home'
    },
    {
      path: '/home',
      name: 'Home',
      component: resolve => require(['@/views/Home/Home'], resolve),
      // children:[
      //   {
      //     path: '',
      //     redirect: 'recommend'
      //   },
      //   { path: 'recommend', component: recommend, name: 'recommend' },
      //   { path: 'classic', component: classic, name: 'classic' },
      //   { path: 'major', component: major, name: 'major' },
      //   { path: 'expert', component: expert, name: 'expert' },
      // ]
    },
    {
      path: '/account',
      name: 'Account',
      component: resolve => require(['@/views/Account/Account'], resolve),
    },  
    {
      path: '/mystudy',
      name: 'Mystudy',
      component: resolve => require(['@/views/Mystudy'], resolve),
    },
    {
      path: '/classify',
      name: 'Classify',
      component: resolve => require(['@/views/Classify'], resolve),
    },
    {
      path: '/home/coursedetails',
      name: 'Coursedetails',
      component: resolve => require(['@/views/Coursedetails/Coursedetails'], resolve),
      // children:[
      //   {
      //     path: '',
      //     redirect: 'introduce'
      //   },
      //   { path: 'introduce', component: introduce, name: 'introduce' },
      //   { path: 'catalog', component: catalog, name: 'catalog' },
      //   { path: 'comment', component:comment, name: 'comment' },
      // ]
    },
    {
      path: '/classifydetails',
      name: 'Classifydetails',
      component: resolve => require(['@/views/Classifydetails'], resolve),
      children:[
      ]
    },
    {
      path: '/home/search',
      name: 'search',
      component: resolve => require(['@/components/search'], resolve),
      
    },
    {
      path: '/account/login',
      name: 'login',
      component: resolve => require(['@/views/Login'], resolve),
    },
    {
      path:'/account/setting',
      component: resolve => require(['@/views/Account/setting'], resolve),
    },
    {
      path: '*',
      name: 'notfound',
      component: resolve => require(['@/components/NotFound'], resolve),
    },

  ]
})
