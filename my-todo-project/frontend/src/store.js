import { createStore } from 'vuex'

export default createStore({
    state: {
        userNo: null
    },
    mutations: {
        setUserNo(state, payload) {
            state.userNo = payload
        }
    },
    actions: {},
    modules: {}
})
