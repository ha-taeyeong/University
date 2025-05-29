<template>
  <div id="app">
    <header>
      <!-- 로그인 상태에 따라 todo-list 동작 분기 -->
      <span class="title-link" @click="goTodoList">todo-list</span>
    </header>
    <nav>
      <template v-if="!isLoggedIn">
        <router-link to="/signup">회원가입</router-link>
        <router-link to="/login">로그인</router-link>
      </template>
      <template v-else>
        <router-link to="/me">마이페이지</router-link>
        <a href="#" @click.prevent="logout">로그아웃</a>
      </template>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  computed: {
    isLoggedIn() {
      return this.$store.state.isLoggedIn
    }
  },
  methods: {
    goTodoList() {
      if (!this.isLoggedIn) {
        alert('로그인이 필요합니다.');
        this.$router.push('/login');
      } else {
        this.$router.push('/list');
      }
    },
    logout() {
      localStorage.removeItem('token');
      localStorage.removeItem('userNo');
      this.$store.commit('setLoggedIn', false);
      this.$router.push('/login');
    }
  }
}
</script>

<style>
.title-link {
  display: inline-block;
  font-size: 2rem;
  font-weight: bold;
  color: #333;
  text-decoration: none;
  margin: 20px 0 10px 10px;
  cursor: pointer;
}
.title-link:hover {
  color: #007bff;
}
nav {
  margin-bottom: 20px;
}
</style>
