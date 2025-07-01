import { createRouter, createWebHistory } from 'vue-router'
import SignupPage from '@/views/SignupPage.vue'
import LoginPage from '@/views/LoginPage.vue'
import MyPage from '@/views/MyPage.vue'
import ListView from '@/views/ListView.vue';
import ListDetail from '@/views/ListDetail.vue';
import NotFound from '@/views/NotFound.vue';
import store from '@/store';
import Contact from '@/views/Contact.vue'

const routes = [
    { path: '/', redirect: '/login' },
    { path: '/signup', component: SignupPage },
    { path: '/login', component: LoginPage },
    { path: '/me', component: MyPage, meta: { requiresAuth: true } },
    { path: '/list', component: ListView, meta: { requiresAuth: true } },
    { path: '/list/:listNo', component: ListDetail, meta: { requiresAuth: true } },
    { path: '/:pathMatch(.*)*', name: 'NotFound', component: NotFound },
    { path: '/contact', name: 'Contact', component: Contact }
];

const router = createRouter({
    history: createWebHistory(),
    routes
})

router.beforeEach((to, from, next) => {
    const isLoggedIn = store.state.isLoggedIn;
    if (to.meta.requiresAuth && !isLoggedIn) {
        next('/login');
    } else {
        next();
    }
});
export default router
