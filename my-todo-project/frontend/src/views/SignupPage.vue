<template>
  <div class="flex min-h-screen items-center justify-center bg-gray-100">
    <div class="w-full max-w-xl bg-white rounded-2xl shadow-xl p-12">
      <div class="flex flex-col items-center mb-6">
        <img :src="logo" alt="To Do List Logo" class="h-24 w-24" @click="reloadPage" style="cursor:pointer;" />
        <h2 class="text-4xl font-extrabold text-gray-900 mt-2" @click="reloadPage" style="cursor:pointer;">
          To Do List
        </h2>
      </div>
      <form class="space-y-5" @submit.prevent="signup">
        <div>
          <input
              type="text"
              placeholder="아이디"
              v-model="user.userId"
              class="w-full px-4 py-3 border rounded-lg text-base focus:outline-none focus:ring-2 focus:ring-indigo-500"
          />
          <div v-if="userIdError" class="flex items-center p-3 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userIdError }}</span>
          </div>
        </div>
        <div>
          <input
              type="password"
              placeholder="비밀번호"
              v-model="user.userPw"
              class="w-full px-4 py-3 border rounded-lg text-base focus:outline-none focus:ring-2 focus:ring-indigo-500"
          />
          <div v-if="userPwError" class="flex items-center p-3 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userPwError }}</span>
          </div>
        </div>
        <div>
          <input
              type="text"
              placeholder="이름"
              v-model="user.userName"
              class="w-full px-4 py-3 border rounded-lg text-base focus:outline-none focus:ring-2 focus:ring-indigo-500"
          />
          <div v-if="userNameError" class="flex items-center p-3 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userNameError }}</span>
          </div>
        </div>
        <div>
          <input
              type="date"
              placeholder="생년월일"
              v-model="user.userBirth"
              class="w-full px-4 py-3 border rounded-lg text-base focus:outline-none focus:ring-2 focus:ring-indigo-500"
          />
          <div v-if="userBirthError" class="flex items-center p-3 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userBirthError }}</span>
          </div>
        </div>
        <div>
          <select
              v-model="user.userGender"
              class="w-full px-4 py-3 border rounded-lg text-base focus:outline-none focus:ring-2 focus:ring-indigo-500"
          >
            <option value="" disabled>성별 선택</option>
            <option value="M">남자</option>
            <option value="F">여자</option>
          </select>
          <div v-if="userGenderError" class="flex items-center p-3 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userGenderError }}</span>
          </div>
        </div>
        <button
            type="submit"
            class="w-full py-3 bg-indigo-600 text-white rounded-lg text-lg font-semibold hover:bg-indigo-700 transition"
        >
          회원가입
        </button>
        <!-- 회원가입 실패(서버 에러) 알림창 -->
        <div v-if="signupError" class="flex items-center p-4 mt-4 text-sm text-red-800 rounded-lg bg-red-50" role="alert">
          <svg class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 20 20">
            <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM8.257 3.099c.366-.446.957-.533 1.403-.167.446.366.533.957.167 1.403l-.167.167-3.293 3.293 3.293 3.293c.366.446.279 1.037-.167 1.403-.446.366-1.037.279-1.403-.167l-.167-.167-3.293-3.293-3.293 3.293c-.366.446-.957.533-1.403.167-.446-.366-.533-.957-.167-1.403l.167-.167 3.293-3.293-3.293-3.293c-.366-.446-.279-1.037.167-1.403.446-.366 1.037-.279 1.403.167l.167.167 3.293 3.293 3.293-3.293z"/>
          </svg>
          <span class="font-medium">{{ signupError }}</span>
        </div>
        <!-- 회원가입 성공 알림창 -->
        <div v-if="signupSuccess" class="flex items-center p-4 mt-4 text-sm text-green-800 rounded-lg bg-green-50" role="alert">
          <svg class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 20 20">
            <path d="M16.707 7.293a1 1 0 00-1.414 0L9 13.586l-2.293-2.293a1 1 0 00-1.414 1.414l3 3a1 1 0 001.414 0l7-7a1 1 0 000-1.414z"/>
          </svg>
          <span class="font-medium">{{ signupSuccess }}</span>
        </div>
      </form>
      <p class="mt-8 text-center text-base text-gray-600">
        계정이 있으신가요?
        <router-link to="/login" class="text-indigo-600 hover:underline">로그인</router-link>
      </p>
    </div>
  </div>
</template>
<script setup>
import axios from 'axios'
import { reactive, ref } from 'vue'
import logo from "@/assets/logo.png";

const reloadPage = () => {
  window.location.reload()
}

const user = reactive({
  userId: '',
  userPw: '',
  userName: '',
  userBirth: '',
  userGender: ''
})

const userIdError = ref('')
const userPwError = ref('')
const userNameError = ref('')
const userBirthError = ref('')
const userGenderError = ref('')
const signupError = ref('')
const signupSuccess = ref('')

const signup = async () => {
  // 에러 초기화
  userIdError.value = ''
  userPwError.value = ''
  userNameError.value = ''
  userBirthError.value = ''
  userGenderError.value = ''
  signupError.value = ''
  signupSuccess.value = ''

  let hasError = false
  if (!user.userId) { userIdError.value = '아이디를 입력해주세요.'; hasError = true }
  if (!user.userPw) { userPwError.value = '비밀번호를 입력해주세요.'; hasError = true }
  if (!user.userName) { userNameError.value = '이름을 입력해주세요.'; hasError = true }
  if (!user.userBirth) { userBirthError.value = '생년월일을 입력해주세요.'; hasError = true }
  if (!user.userGender) { userGenderError.value = '성별을 선택해주세요.'; hasError = true }
  if (hasError) return

  try {
    await axios.post('/api/user', user)
    signupSuccess.value = '회원가입 성공!'
  } catch (error) {
    const msg = error.response?.data?.message || error.message
    if (msg.includes('Duplicate entry') && msg.includes('user_id')) {
      signupError.value = '아이디가 이미 존재합니다. 다른 아이디를 사용해 주세요.'
    } else {
      signupError.value = '회원가입 실패: ' + msg
    }
  }
}
</script>
