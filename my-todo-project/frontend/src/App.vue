<template>
  <div>
    <NavBar v-if="showNavBar" />
    <router-view />
  </div>
</template>

<script setup>
import NavBar from '@/components/NavBar.vue'
import { computed } from 'vue'
import { useRoute, useRouter } from 'vue-router'
import { useStore } from 'vuex'

const route = useRoute()
const router = useRouter()
const store = useStore()

// 로그인 페이지에서만 NavBar 숨기기
const showNavBar = computed(() => route.path !== '/login')

// 로그인 여부
const isLoggedIn = computed(() => store.state.isLoggedIn)

// 네비게이션 이동/로그아웃 함수 (필요하다면)
function goTodoList() {
  if (!isLoggedIn.value) {
    alert('로그인이 필요합니다.')
    router.push('/login')
  } else {
    router.push('/list')
  }
}
function logout() {
  localStorage.removeItem('token')
  localStorage.removeItem('userNo')
  store.commit('setLoggedIn', false)
  router.push('/login')
}
</script>
