import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '../page/HomePage.vue'
import LoginPage from '../page/LoginPage.vue'
import RegisterPage from '../page/RegisterPage.vue'
import NotFoundPage from '../page/NotFoundPage.vue'
const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/login',
    name: 'Login',
    component: LoginPage
  },
  {
    path: '/register',
    name: 'Register',
    component: RegisterPage
  },
  {
    path: '/:catchAll(.*)',
    name: 'NotFound',
    component: NotFoundPage
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
