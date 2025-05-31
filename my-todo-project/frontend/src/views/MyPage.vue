<template>
  <div class="min-h-screen bg-gray-50 flex items-center justify-center">
    <div class="w-full max-w-[95vw] sm:max-w-[400px] mx-auto py-10 px-4 sm:px-8 bg-white rounded-2xl shadow-xl">
      <h2 class="text-2xl font-bold mb-8 text-center">내 정보</h2>
      <form @submit.prevent="updateUser" class="space-y-5">
        <div>
          <label class="block mb-1 font-semibold text-gray-700">아이디</label>
          <input
              type="text"
              v-model="user.userId"
              disabled
              class="w-full border rounded px-3 py-2 bg-gray-100 text-gray-500 cursor-not-allowed"
          />
        </div>
        <div>
          <label class="block mb-1 font-semibold text-gray-700">이름</label>
          <input
              type="text"
              v-model="user.userName"
              class="w-full border rounded px-3 py-2 focus:ring-2 focus:ring-indigo-500"
          />
        </div>
        <div>
          <label class="block mb-1 font-semibold text-gray-700">생년월일</label>
          <input
              type="date"
              v-model="user.userBirth"
              class="w-full border rounded px-3 py-2 focus:ring-2 focus:ring-indigo-500"
          />
        </div>
        <div>
          <label class="block mb-1 font-semibold text-gray-700">성별</label>
          <select
              v-model="user.userGender"
              class="w-full border rounded px-3 py-2 focus:ring-2 focus:ring-indigo-500"
          >
            <option value="M">남자</option>
            <option value="F">여자</option>
          </select>
        </div>
        <button
            type="submit"
            class="w-full bg-indigo-600 text-white font-semibold py-3 rounded-lg hover:bg-indigo-700 transition text-lg"
        >
          수정하기
        </button>
      </form>
      <button
          @click="logout"
          class="w-full mt-8 bg-gray-200 text-gray-700 font-semibold py-2 rounded-lg hover:bg-gray-300 transition"
      >
        로그아웃
      </button>
      <!-- 성공 알림 -->
      <AlertSuccess v-model:show="showSuccess" :message="successMsg" />
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref, onMounted } from 'vue'
import { useRouter } from 'vue-router'
import AlertSuccess from '@/components/AlertSuccess.vue'

const showSuccess = ref(false)
const successMsg = ref('')

const user = ref({
  userId: '',
  userName: '',
  userBirth: '',
  userGender: '',
  userNo: null
})
const message = ref('')
const router = useRouter()

const fetchUser = async () => {
  try {
    const response = await axios.get('/api/user/me')
    user.value = response.data
    console.log('user:', user.value)
  } catch (error) {
    user.value = null
    message.value = '정보를 불러오지 못했습니다.'
  }
}

const updateUser = async () => {
  try {
    const userNo = user.value.userNo
    const payload = {
      userName: user.value.userName,
      userBirth: user.value.userBirth,
      userGender: user.value.userGender
    }
    await axios.put(`/api/user/${userNo}`, payload)
    message.value = '수정이 완료되었습니다.'
    // 성공 토스트 알림 띄우기
    successMsg.value = '정보가 성공적으로 수정되었습니다.'
    showSuccess.value = true
    fetchUser()
  } catch (error) {
    message.value = '수정 실패: ' + (error.response?.data?.message || error.message)
  }
}


const logout = () => {
  localStorage.removeItem('token')
  router.push('/login')
}

onMounted(fetchUser)
</script>