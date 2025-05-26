<template>
  <div>
    <h2>나의 리스트</h2>
    <button @click="openAddForm">리스트 추가</button>
    <table>
      <thead>
      <tr>
        <th>완료</th>
        <th>리스트명</th>
        <th>수정</th>
        <th>삭제</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="list in lists" :key="list.listNo" @click="goToDetail(list.listNo)" style="cursor:pointer;">
        <td>
          <input type="checkbox" :checked="list.completedYn === 'Y'" @change.stop="toggleComplete(list)" />
        </td>
        <td>{{ list.listName }}</td>
        <td><button @click.stop="openEditForm(list)">수정</button></td>
        <td><button @click.stop="deleteList(list.listNo)">삭제</button></td>
      </tr>
      </tbody>
    </table>
    <ListForm v-if="showForm" :editItem="editItem" @close="closeForm" @saved="fetchLists"/>
  </div>
</template>

<script>
import axios from 'axios';
import ListForm from './ListForm.vue';
import { useRouter } from 'vue-router';

export default {
  components: { ListForm },
  data() {
    return {
      lists: [],
      showForm: false,
      editItem: null,
    };
  },
  mounted() {
    this.fetchLists();
  },
  methods: {
    fetchLists() {
      axios.get('/api/list').then(res => {
        this.lists = res.data;
      });
    },
    openAddForm() {
      this.editItem = null;
      this.showForm = true;
    },
    openEditForm(list) {
      this.editItem = { ...list };
      this.showForm = true;
    },
    closeForm() {
      this.showForm = false;
      this.editItem = null;
    },
    deleteList(listNo) {
      axios.delete(`/api/list/${listNo}`).then(() => this.fetchLists());
    },
    toggleComplete(list) {
      const updated = { ...list, completedYn: list.completedYn === 'Y' ? 'N' : 'Y' };
      axios.put(`/api/list/${list.listNo}`, updated).then(() => this.fetchLists());
    },
    goToDetail(listNo) {
      this.$router.push(`/list/${listNo}`);
    }
  }
};
</script>
