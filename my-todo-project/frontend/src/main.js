import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import './assets/main.css'

// 1. JWT 토큰 자동 헤더 추가
axios.interceptors.request.use(config => {
    const token = localStorage.getItem('token')
    if (token) {
        config.headers.Authorization = `Bearer ${token}`
    }
    return config
})

// 2. 앱 시작 시 userNo, isLoggedIn 복원
const userNo = localStorage.getItem('userNo')
const token = localStorage.getItem('token')
if (userNo) {
    store.commit('setUserNo', userNo)
}
if (token) {
    store.commit('setLoggedIn', true)
}

// 3. 앱 마운트
createApp(App)
    .use(router)
    .use(store)
    .mount('#app')
