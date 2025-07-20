<template>
  <header class="bg-white shadow">
    <nav class="mx-auto flex max-w-7xl items-center justify-between p-6 lg:px-8" aria-label="Global">
      <!-- 로고/서비스명 -->
      <div class="flex lg:flex-1">
        <router-link to="/" class="-m-1.5 p-1.5 flex items-center">
          <img class="h-8 w-auto" src="../assets/logo.png" alt="로고" />
          <span class="ml-2 font-bold text-lg text-gray-900">To Do List</span>
        </router-link>
      </div>
      <!-- 모바일 메뉴 버튼 -->
      <div class="flex lg:hidden">
        <button @click="open = !open" type="button" class="-m-2.5 inline-flex items-center justify-center rounded-md p-2.5 text-gray-700">
          <span class="sr-only">Open main menu</span>
          <svg class="size-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor">
            <path stroke-linecap="round" stroke-linejoin="round" d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5" />
          </svg>
        </button>
      </div>
      <!-- 데스크탑 메뉴 -->
      <div v-if="isLoggedIn" class="hidden lg:flex lg:gap-x-12">
        <router-link to="/list" class="text-sm font-semibold text-gray-900 hover:text-indigo-600">리스트</router-link>
        <router-link to="/me" class="text-sm font-semibold text-gray-900 hover:text-indigo-600">프로필</router-link>
        <button @click="logout" class="text-sm font-semibold text-gray-900 hover:text-indigo-600">로그아웃</button>
      </div>
      <!-- 회원가입(비로그인 시에만) -->
      <div v-else class="hidden lg:flex lg:flex-1 lg:justify-end">
        <router-link to="/signup" class="text-sm font-semibold text-gray-900 hover:text-indigo-600">회원가입 &rarr;</router-link>
      </div>
    </nav>
    <!-- 모바일 메뉴 -->
    <div v-if="open" class="lg:hidden">
      <div class="px-6 pb-6">
        <router-link v-if="isLoggedIn" to="/list" class="block py-2 text-base font-semibold text-gray-900 hover:text-indigo-600">리스트</router-link>
        <router-link v-if="isLoggedIn" to="/me" class="block py-2 text-base font-semibold text-gray-900 hover:text-indigo-600">프로필</router-link>
        <button v-if="isLoggedIn" @click="logout" class="block py-2 text-base font-semibold text-gray-900 hover:text-indigo-600 w-full text-left">로그아웃</button>
        <router-link v-else to="/signup" class="block py-2 text-base font-semibold text-gray-900 hover:text-indigo-600">회원가입 &rarr;</router-link>
      </div>
    </div>
  </header>
</template>

<script setup>
import { ref, computed } from 'vue'
import { useRouter } from 'vue-router'
import { useStore } from 'vuex'

const open = ref(false)
const router = useRouter()
const store = useStore()

const isLoggedIn = computed(() =>
    store.state.loggedIn || !!localStorage.getItem('token')
)

const logout = () => {
  localStorage.removeItem('token')
  localStorage.removeItem('userNo')
  store.commit('setLoggedIn', false)
  router.push('/login')
  open.value = false
}
</script>
