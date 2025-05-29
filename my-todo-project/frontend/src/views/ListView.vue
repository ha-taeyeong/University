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
      <tr v-for="(list, idx) in lists" :key="list.listNo">
        <!-- 완료 여부: 인라인 수정 모드에서는 select, 아니면 텍스트 -->
        <td v-if="editIndex !== idx">
          <span>{{ list.completedYn === 'Y' ? '완료' : '미완료' }}</span>
        </td>
        <td v-else>
          <select v-model="editCompletedYn">
            <option value="Y">완료</option>
            <option value="N">미완료</option>
          </select>
        </td>
        <!-- 리스트명: 인라인 수정 모드에서는 input, 아니면 텍스트 -->
        <td v-if="editIndex !== idx" @click="goToDetail(list.listNo)" style="cursor:pointer;">
          {{ list.listName }}
        </td>
        <td v-else>
          <input v-model="editName" @keyup.enter="saveEdit(idx, list)" />
        </td>
        <!-- 수정/저장/취소 버튼 -->
        <td>
          <button v-if="editIndex !== idx" @click="startEdit(idx, list)">수정</button>
          <span v-else>
              <button @click="saveEdit(idx, list)">저장</button>
              <button @click="cancelEdit">취소</button>
            </span>
        </td>
        <!-- 삭제 버튼 -->
        <td>
          <button type="button" @click="deleteList(list.listNo)">삭제</button>
        </td>
      </tr>
      </tbody>
    </table>
    <ListForm v-if="showForm" :editItem="editItem" @close="closeForm" @saved="fetchLists"/>
  </div>
</template>

<script>
import axios from 'axios';
import ListForm from './ListForm.vue';

export default {
  components: { ListForm },
  data() {
    return {
      lists: [],
      showForm: false,
      editItem: null,
      editIndex: null,        // 수정 중인 행의 인덱스
      editName: '',           // 수정 중인 리스트명
      editCompletedYn: 'N',   // 수정 중인 완료여부
    };
  },
  mounted() {
    this.fetchLists();
  },
  methods: {
    fetchLists() {
      axios.get('/api/list').then(res => {
        this.lists = res.data.filter(item => item.delYn === "N");
      });
    },
    openAddForm() {
      this.editItem = null;
      this.showForm = true;
    },
    closeForm() {
      this.showForm = false;
      this.editItem = null;
    },
    // 인라인 수정 시작
    startEdit(idx, list) {
      this.editIndex = idx;
      this.editName = list.listName;
      this.editCompletedYn = list.completedYn;
    },
    // 인라인 수정 저장
    async saveEdit(idx, list) {
      if (!this.editName.trim()) {
        alert('리스트명을 입력하세요.');
        return;
      }
      const updated = {
        ...list,
        listName: this.editName,
        completedYn: this.editCompletedYn
      };
      await axios.put(`/api/list/${list.listNo}`, updated);
      this.editIndex = null;
      this.editName = '';
      this.editCompletedYn = 'N';
      this.fetchLists();
    },
    // 인라인 수정 취소
    cancelEdit() {
      this.editIndex = null;
      this.editName = '';
      this.editCompletedYn = 'N';
    },
    // 삭제
    deleteList(listNo) {
      if (!confirm('정말 삭제하시겠습니까?')) return;
      axios.delete(`/api/list/${listNo}`)
          .then(() => this.fetchLists())
          .catch(error => {
            alert('삭제 중 오류가 발생했습니다.');
            console.error('삭제 실패:', error);
          });
    },
    // 상세 화면 이동
    goToDetail(listNo) {
      this.$router.push(`/list/${listNo}`);
    }
  }
};
</script>
