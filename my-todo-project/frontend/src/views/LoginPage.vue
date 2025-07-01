<template>
  <div class="flex min-h-screen items-center justify-center bg-gray-100">
    <div class="w-full max-w-xl bg-white rounded-2xl shadow-xl p-12">
      <div class="flex flex-col items-center mb-2">
        <img :src="logo" alt="To Do List Logo" class="h-24 w-24" @click="reloadPage" style="cursor:pointer;" />
        <h2 class="text-4xl font-extrabold text-gray-900 mt-2" @click="reloadPage" style="cursor:pointer;">
          To Do List
        </h2>
      </div>
      <form class="space-y-8" @submit.prevent="login">
        <!-- 아이디 입력 -->
        <div>
          <label class="block mb-2 text-lg font-medium text-gray-700">아이디</label>
          <input
              type="text"
              v-model="credentials.userId"
              class="w-full px-6 py-4 border rounded-lg text-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"
              placeholder="아이디"
          />
          <!-- 아이디 알림창 -->
          <div v-if="userIdError" class="flex items-center p-4 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userIdError }}</span>
          </div>
        </div>
        <!-- 비밀번호 입력 -->
        <div>
          <label class="block mb-2 text-lg font-medium text-gray-700">비밀번호</label>
          <input
              type="password"
              v-model="credentials.userPw"
              class="w-full px-6 py-4 border rounded-lg text-lg focus:outline-none focus:ring-2 focus:ring-indigo-500"
              placeholder="비밀번호"
          />
          <!-- 비밀번호 알림창 -->
          <div v-if="userPwError" class="flex items-center p-4 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
            <svg class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 20 20">
              <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM9 9V5a1 1 0 112 0v4a1 1 0 01-2 0zm0 4a1 1 0 112 0 1 1 0 01-2 0z"/>
            </svg>
            <span class="font-medium">{{ userPwError }}</span>
          </div>
        </div>
        <!-- 로그인 버튼 -->
        <button
            type="submit"
            class="w-full py-4 bg-indigo-600 text-white rounded-lg text-lg font-semibold hover:bg-indigo-700 transition"
        >
          로그인
        </button>
        <!-- 로그인 실패(서버 에러) 알림창 -->
        <div v-if="loginError" class="flex items-center p-4 mt-4 text-sm text-red-800 rounded-lg bg-red-50" role="alert">
          <svg class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 20 20">
            <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM8.257 3.099c.366-.446.957-.533 1.403-.167.446.366.533.957.167 1.403l-.167.167-3.293 3.293 3.293 3.293c.366.446.279 1.037-.167 1.403-.446.366-1.037.279-1.403-.167l-.167-.167-3.293-3.293-3.293 3.293c-.366.446-.957.533-1.403.167-.446-.366-.533-.957-.167-1.403l.167-.167 3.293-3.293-3.293-3.293c-.366-.446-.279-1.037.167-1.403.446-.366 1.037-.279 1.403.167l.167.167 3.293 3.293 3.293-3.293z"/>
          </svg>
          <span class="font-medium">{{ loginError }}</span>
        </div>
      </form>
      <p class="mt-8 text-center text-base text-gray-600">
        계정이 없으신가요?
        <router-link to="/signup" class="text-indigo-600 hover:underline">회원가입</router-link>
      </p>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { reactive, ref } from 'vue'
import { useRouter } from 'vue-router'
import { useStore } from 'vuex'
import logo from '@/assets/logo.png'

const reloadPage = () => {
  window.location.reload()
}

const store = useStore()
const credentials = reactive({
  userId: '',
  userPw: ''
})

const userIdError = ref('')
const userPwError = ref('')
const loginError = ref('')
const router = useRouter()

const login = async () => {
  // 에러 초기화
  userIdError.value = ''
  userPwError.value = ''
  loginError.value = ''

  let hasError = false

  if (!credentials.userId) {
    userIdError.value = '아이디를 입력해주세요.'
    hasError = true
  }
  if (!credentials.userPw) {
    userPwError.value = '비밀번호를 입력해주세요.'
    hasError = true
  }
  if (hasError) return

  try {
    const response = await axios.post('/api/auth/login', credentials)
    localStorage.setItem('token', response.data.token)

    if (response.data.userNo) {
      localStorage.setItem('userNo', response.data.userNo)
      store.commit('setUserNo', response.data.userNo)
    }

    store.commit('setLoggedIn', true)
    await router.push('/list')
  } catch (error) {
    loginError.value = '로그인 실패하였습니다.'
  }
}
</script>
