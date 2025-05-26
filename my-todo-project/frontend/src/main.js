import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'

// JWT 토큰 자동 헤더 추가
axios.interceptors.request.use(config => {
    const token = localStorage.getItem('token')
    if (token) {
        config.headers.Authorization = `Bearer ${token}`
    }
    return config
})

// === [여기 추가!] 앱 시작 시 userNo 복원 ===
const userNo = localStorage.getItem('userNo')
if (userNo) {
    store.commit('setUserNo', userNo)
}

createApp(App)
    .use(router)
    .use(store)
    .mount('#app')
