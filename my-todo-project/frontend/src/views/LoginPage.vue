<template>
  <div class="login-container">
    <h2>로그인</h2>
    <form @submit.prevent="login">
      <input type="text" placeholder="아이디" v-model="credentials.userId" required />
      <input type="password" placeholder="비밀번호" v-model="credentials.userPw" required />
      <button type="submit">로그인</button>
    </form>
    <div v-if="message" class="message">{{ message }}</div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { reactive, ref } from 'vue'
import { useRouter } from 'vue-router'
import { useStore } from 'vuex'

const store = useStore()
const credentials = reactive({
  userId: '',
  userPw: ''
})
const message = ref('')
const router = useRouter()

const login = async () => {
  try {
    const response = await axios.post('/api/auth/login', credentials)
    localStorage.setItem('token', response.data.token)

    // userNo 저장
    if (response.data.userNo) {
      localStorage.setItem('userNo', response.data.userNo)
      store.commit('setUserNo', response.data.userNo)
    }

    store.commit('setLoggedIn', true)

    // JWT 토큰 저장 등 추가 로직
    message.value = '로그인 성공!'
    router.push('/list') // <-- 여기만 /list로 변경!
  } catch (error) {
    message.value = '로그인 실패: ' + (error.response?.data?.message || error.message)
  }
}
</script>

<style scoped>
/* ...생략... */
</style>
