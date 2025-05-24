<template>
  <div class="mypage-container">
    <h2>내 정보</h2>
    <form @submit.prevent="updateUser">
      <div>
        <label>아이디: </label>
        <input type="text" v-model="user.userId" disabled />
      </div>
      <div>
        <label>이름: </label>
        <input type="text" v-model="user.userName" />
      </div>
      <div>
        <label>생년월일: </label>
        <input type="date" v-model="user.userBirth" />
      </div>
      <div>
        <label>성별: </label>
        <select v-model="user.userGender">
          <option value="M">남자</option>
          <option value="F">여자</option>
        </select>
      </div>
      <button type="submit">수정하기</button>
    </form>
    <div v-if="message" class="message">{{ message }}</div>
    <button @click="logout">로그아웃</button>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref, onMounted } from 'vue'
import { useRouter } from 'vue-router'

const user = ref({
  userId: '',
  userName: '',
  userBirth: '',
  userGender: '',
  userNo: null // 기본값 추가
})
const message = ref('')
const router = useRouter()

const fetchUser = async () => {
  try {
    const response = await axios.get('/api/user/me')
    user.value = response.data
    console.log('user:', user.value) // userNo가 있는지 콘솔로 확인
  } catch (error) {
    user.value = null
    message.value = '정보를 불러오지 못했습니다.'
  }
}

// 내 정보 수정 함수
const updateUser = async () => {
  try {
    // user.value.userNo가 필요하다면 백엔드에서 반환해줘야 함
    const userNo = user.value.userNo
    const payload = {
      userName: user.value.userName,
      userBirth: user.value.userBirth,
      userGender: user.value.userGender
      // 비밀번호 등 추가 필드가 있으면 여기에 포함
    }
    await axios.put(`/api/user/${userNo}`, payload)
    message.value = '수정이 완료되었습니다.'
    fetchUser() // 수정 후 최신 정보 다시 불러오기
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

<style scoped>
/* 스타일 생략 */
</style>
