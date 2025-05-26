<template>
  <div v-if="list">
    <h3>리스트 상세</h3>
    <p>리스트명: {{ list.listName }}</p>
    <p>완료여부: {{ list.completedYn }}</p>
    <p>등록일: {{ list.regDt }}</p>
    <!-- 기타 정보 표시 -->
    <button @click="$router.back()">목록으로</button>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return { list: null };
  },
  mounted() {
    const listNo = this.$route.params.listNo;
    axios.get(`/api/list/${listNo}`).then(res => {
      this.list = res.data;
    });
  }
};
</script>
