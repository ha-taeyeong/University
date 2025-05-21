import SignupPage from '@/views/SignupPage.vue'
import LoginPage from '@/views/LoginPage.vue'
import { createRouter, createWebHistory } from 'vue-router'
const routes = [
    { path: '/signup', component: SignupPage },
    { path: '/login', component: LoginPage },
    // 다른 라우트들...
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router