import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import Vuelidate from 'vuelidate'
Vue.use(Vuelidate)

// axios 설정
axios.defaults.baseURL = '/api'
axios.defaults.headers.common.Accept = 'application/json'
axios.interceptors.response.use(
  response => response,
  (error) => {
    return Promise.reject(error)
  }
)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: function (h) { return h(App) }
}).$mount('#app')
