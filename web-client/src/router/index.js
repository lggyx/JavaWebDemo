import {createRouter, createWebHistory} from 'vue-router'
import DemoPage from "@/page/DemoPage.vue";
import LoginPage from "@/page/LoginPage.vue";
import RegisterDemo from "@/page/RegisterDemo.vue";
import NotFoundPage from "@/page/NotFoundPage.vue";
import HomePage from "@/page/HomePage.vue";

const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomePage
    },
    {
        path: '/demo',
        name: 'DemoPage',
        component: DemoPage
    },
    {
        path: '/login',
        name: 'LoginPage',
        component: LoginPage
    },
    {
        path: '/register',
        name: 'RegisterPage',
        component: RegisterDemo
    },
    {
        path: '/:pathMatch(.*)*',
        name: 'NotFound',
        component: NotFoundPage
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router
