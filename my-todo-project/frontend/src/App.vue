<template>
  <div id="app">
    <nav>
      <router-link to="/signup">회원가입</router-link>
      <router-link to="/login">로그인</router-link>
      <router-link to="/me">마이페이지</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  data() {
    return {
      newTask: '',
      tasks: []
    }
  },
  methods: {
    addTask() {
      if (this.newTask.trim() !== '') {
        this.tasks.push({ text: this.newTask, completed: false });
        this.newTask = '';
      }
    },
    removeTask(index) {
      this.tasks.splice(index, 1);
    }
  }
}
</script>

<style>
.completed {
  text-decoration: line-through;
  color: #aaa;
}
</style>
