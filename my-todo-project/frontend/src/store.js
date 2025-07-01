import { createStore } from 'vuex'

export default createStore({
    state: {
        userNo: null,
        isLoggedIn: !!localStorage.getItem('token') // 앱 시작 시 토큰 여부로 초기화
    },
    mutations: {
        setUserNo(state, payload) {
            state.userNo = payload
        },
        setLoggedIn(state, status) {
            state.isLoggedIn = status
        }
    },
    actions: {},
    modules: {}
})
