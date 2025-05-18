<template>
  <div class="login-container">
    <h2>로그인</h2>
    <form @submit.prevent="login">
      <input type="text" placeholder="아이디" v-model="username" required />
      <input type="password" placeholder="비밀번호" v-model="password" required />
      <button type="submit">로그인</button>
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

const login = async () => {
  try {
    const response = await axios.post('/api/auth/login', { username: username.value, password: password.value })
    message.value = '로그인 성공!'
    localStorage.setItem('token', response.data.token)
    username.value = ''
    password.value = ''
  } catch (error: any) {
    message.value = error.response?.data?.message || '로그인 실패'
  }
}
</script>

<style scoped>
.login-container {
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
