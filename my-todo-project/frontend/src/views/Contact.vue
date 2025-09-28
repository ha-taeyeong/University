<template>
  <div class="max-w-lg mx-auto py-12">
    <h2 class="text-2xl font-bold mb-6">문의하기</h2>
    <form @submit.prevent="submitForm" class="space-y-4">
      <div>
        <label class="block mb-1 font-medium">이름</label>
        <input
            v-model="name"
            @input="nameError = ''"
            class="w-full border rounded px-3 py-2"
        />
      </div>
      <div v-if="nameError" class="flex items-center p-4 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
        <!-- ...SVG... -->
        <span class="font-medium">{{ nameError }}</span>
      </div>
      <div>
        <label class="block mb-1 font-medium">이메일</label>
        <input
            v-model="email"
            @input="emailError = ''"
            class="w-full border rounded px-3 py-2"
        />
      </div>
      <div v-if="emailError" class="flex items-center p-4 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
        <!-- ...SVG... -->
        <span class="font-medium">{{ emailError }}</span>
      </div>
      <div>
        <label class="block mb-1 font-medium">문의 내용</label>
        <textarea
            v-model="message"
            @input="messageError = ''"
            rows="5"
            class="w-full border rounded px-3 py-2"
        ></textarea>
      </div>
      <div v-if="messageError" class="flex items-center p-4 mt-2 text-sm text-yellow-800 rounded-lg bg-yellow-50" role="alert">
        <!-- ...SVG... -->
        <span class="font-medium">{{ messageError }}</span>
      </div>
      <div class="flex justify-end">
        <button type="submit" class="bg-indigo-600 text-white px-4 py-2 rounded hover:bg-indigo-700">보내기</button>
      </div>
    </form>
    <!-- 경고 알림창 -->
    <div
        v-if="error"
        class="flex items-center p-3 mt-4 text-sm text-yellow-800 rounded-lg bg-yellow-50"
        role="alert"
    >
      <!-- ...SVG... -->
      <span class="font-medium">{{ error }}</span>
    </div>
    <ToastSuccess v-model:show="showToast" :message="toastMsg" />
  </div>
</template>


<script setup>
import { ref } from 'vue'
import ToastSuccess from '@/components/ToastSuccess.vue'
import axios from 'axios'

const name = ref('')
const email = ref('')
const message = ref('')

const nameError = ref('')
const emailError = ref('')
const messageError = ref('')
const error = ref('')
const success = ref(false)

const showToast = ref(false)
const toastMsg = ref('')

async function submitForm() {
  // 에러 초기화
  nameError.value = ''
  emailError.value = ''
  messageError.value = ''
  error.value = ''
  success.value = false

  let hasError = false

  if (!name.value.trim()) {
    nameError.value = '이름을 입력해 주세요.'
    hasError = true
  }
  if (!email.value.trim()) {
    emailError.value = '이메일을 입력해 주세요.'
    hasError = true
  } else if (!/^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/.test(email.value)) {
    emailError.value = '올바른 이메일 형식이 아닙니다.'
    hasError = true
  }
  if (!message.value.trim()) {
    messageError.value = '문의 내용을 입력해 주세요.'
    hasError = true
  }
  if (hasError) return

  try {
    await axios.post('/api/contact', {
      name: name.value,
      email: email.value,
      message: message.value,
    })
    success.value = true
    name.value = ''
    email.value = ''
    message.value = ''
    // 토스트 알림 띄우기
    toastMsg.value = '문의가 정상적으로 접수되었습니다.'
    showToast.value = true
  } catch (e) {
    error.value = '문의 접수에 실패했습니다. 다시 시도해 주세요.'
    success.value = false
  }
}
</script>

