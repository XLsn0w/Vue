<template>
   <div class="wrapper">
      <div class="title">
          <label class="back" @click="back">&lt;</label>
          <span class="title">登录</span>
      </div>


      <div class="login">
          <!-- <div class="username">
              <label>账号:</label>
              <input type="text" v-model="username" placeholder="测试账号admin">
          </div>
          <div class="password">
              <label>密码:</label>
              <input type="password" v-model="password" placeholder="测试密码123456">
          </div> -->


          <mt-field label="用户名" placeholder="请输入用户名" v-model="username"></mt-field>
          <mt-field label="密码" placeholder="请输入密码" type="password" v-model="password"></mt-field>

          <!-- <button @click="login">登录</button> -->

         
         
          <!-- <mt-button @click="loginAction">登录App</mt-button> -->
          <mt-button @click.native="loginAction">登录App</mt-button>


          
      </div>

      <div>
  
  
   
    
  </div>


   </div>
</template>

<script>
import { requestLogin } from "../api/api";
import { mapActions } from "vuex";
import { Toast } from 'mint-ui';
export default {
  data() {
    return {
      username: "",
      password: ""
    };
  },
  methods: {
    back() {
      this.$router.go("-1");
    },

    ...mapActions(
      [
        'setUserData','setUserInfo'
      ]
    ),
    loginAction() {
      this.login()
    },
    handleClick: function () {
          this.$toast('Hello world!')
          //alert("Hello world")
},
    login() {                  //登录操作
      if (!this.username || !this.password) {
        Toast({
                message: '请填写完整',
                iconClass: 'icon icon-error',
                position: 'top',
        });
        return;
      }

      let data = {
        username: this.username,
        password: this.password
      };

      this.$store.dispatch("setLoadingState", true); //设置loading状态

      requestLogin(data).then(res => {
        if(res == "notFound"){
            Toast({
                message: '登陆失败',
                iconClass: 'icon icon-error'
                });
            this.$store.dispatch("setLoadingState", false);    
        }else{
            this.setUserInfo(data);
            this.setUserData(res);
            this.$router.replace("/home");
        }
      });
    }
  }
};
</script>

<style lang="stylus" scoped>
.wrapper {
    background-color: white;

    .title {
        height: 1.2rem;
        background-color: #f7f9fc;
        line-height: 1.2rem;
        

        .back {
            font-size: 0.8rem;
            margin-left: 0.3rem;
        }

        .title {
            font-size: 0.6rem;
            position: absolute;
            left: 45%;
        }
    }

    .login {
        width: 8rem;
        margin: 0 auto;
        margin-top: 100px;

        .username, .password {
            margin: 0.3rem;
            border-bottom: 1px solid #e6eaf2;
            height: 1.6667rem;
            line-height: 1.6667rem;
            color: #99a4bf;
            &>label {
                font-size: 0.45rem;
            }

            &>input {
                border: 0;
                background-color: white;
                width: 5.5rem;
                height: 0.7rem;
                outline: none;
                font-size: 0.40rem;
            }
        }

        // input
        // background-color white


        button {
            width: 7.4rem;
            height: 1rem;
            margin: 0.3rem;
            border-radius: 0.2rem;
            background-color: #2ab868;
            border: 0;
            outline: none;
            font-size: 0.45rem;
            color: white;
        }
    }
   
   
  .mint-button--normal {
    margin-left: 5px;
    margin-top: 10px;
    background-color : #2ab868
    width : 7rem
    // text-align :center
    display:block;
    // margin:10 auto


margin-left:auto; 
margin-right:auto;
  }

}
</style>


/* CSS中基础的居中方式
块中文字水平居中
text-align 用于块级元素，作用在使用它的块元素中的文字或者图片上，使得它们在水平方向上居中。

块元素自身水平居中(确定设置了宽度的块)
一般情况下，可以设置margin:0 auto;，这会使这个块级元素在它的父级元素中居中，上下左右都会居中。 
如果只要水平居中的话，就设置margin-left:auto; margin-right:auto;

块元素自身水平居中(不确定宽度的块)
如果块元素的子元素也为块元素，就对子元素使用margin auto一类的方式就好啦，也可以用display设置为inline然后再用text-align；
如果块级元素的子元素为行内元素，就用我们一开始介绍的text-align也就可以解决。
vertical-align用于行内元素中的垂直居中
vertical-align这个属性用于: 
1. 内联元素(以及被转化为内联元素的块元素) 
2. display设置为table-cell的元素 
3. 这样的元素
注意：设置块级元素的 display 值为 table-cell，来激活 vertical-align 属性

块级元素中的文字图片垂直居中
设置height的高度与line-height的高度相同!

<div style="line-height:500px;height:500;"></div>
1
块级元素自身的垂直居中
设置块级元素自身在父元素中的垂直居中，可以参照块级元素的水平居中的方法(上面说过)，设置外边距即可。如果不想设置水平居中，只要设置上下外边距为auto就好。

也可以采用vertical-align:middle;的方式，但是前提是把display设置为table-cell。

*/