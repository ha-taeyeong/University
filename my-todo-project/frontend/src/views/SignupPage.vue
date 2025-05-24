<template>
  <div class="signup-container">
    <h2>회원가입</h2>
    <form @submit.prevent="signup">
      <input type="text" placeholder="아이디" v-model="user.userId" required />
      <input type="password" placeholder="비밀번호" v-model="user.userPw" required />
      <input type="text" placeholder="이름" v-model="user.userName" required />
      <input type="date" placeholder="생년월일" v-model="user.userBirth" required />
      <select v-model="user.userGender" required>
        <option value="" disabled>성별 선택</option>
        <option value="M">남자</option>
        <option value="F">여자</option>
      </select>
      <button type="submit">회원가입</button>
    </form>
    <div v-if="message" class="message">{{ message }}</div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { reactive, ref } from 'vue'

const user = reactive({
  userId: '',
  userPw: '',
  userName: '',
  userBirth: '',
  userGender: ''
})
const message = ref('')

const signup = async () => {
  try {
    await axios.post('/api/user', user)
    message.value = '회원가입 성공!'
  } catch (error) {
    message.value = '회원가입 실패: ' + (error.response?.data?.message || error.message)
  }
}
</script>

<style scoped>
/* ...생략... */
</style>
