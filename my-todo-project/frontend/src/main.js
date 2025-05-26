import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store' // store import 추가
import axios from 'axios'

axios.interceptors.request.use(config => {
    const token = localStorage.getItem('token')
    if (token) {
        config.headers.Authorization = `Bearer ${token}`
    }
    return config
})

createApp(App)
    .use(router)
    .use(store) // store 등록!
    .mount('#app')
