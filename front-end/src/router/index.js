import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginPage from '@/views/LoginPage.vue'
import RegisterPage from '@/views/RegisterPage.vue'

Vue.use(VueRouter)

const routes = [{
  path: '/login',
  name: 'LoginPage',
  component: LoginPage
}, {
  path: '/registrations',
  name: 'RegisterPage',
  component: RegisterPage
}]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
