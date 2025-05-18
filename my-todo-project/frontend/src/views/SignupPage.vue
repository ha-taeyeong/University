<template>
  <div class="signup-container">
    <h2>회원가입</h2>
    <form @submit.prevent="signup">
      <input type="text" placeholder="아이디" v-model="username" required />
      <input type="password" placeholder="비밀번호" v-model="password" required />
      <button type="submit">회원가입</button>
    </form>
    <div v-if="message" class="message">{{ message }}</div>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import axios from 'axios'

const username = ref('')
const password = ref('')
const message = ref('')

const signup = async () => {
  try {
    await axios.post('/api/auth/signup', { username: username.value, password: password.value })
    message.value = '회원가입 성공! 로그인 해주세요.'
    username.value = ''
    password.value = ''
  } catch (error: any) {
    message.value = error.response?.data?.message || '회원가입 실패'
  }
}
</script>

<style scoped>
.signup-container {
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 8px;
}
.message {
  margin-top: 10px;
  color: green;
  font-weight: bold;
}
</style>
