<template>
  <div v-if="list" class="max-w-md mx-auto mt-12 bg-white rounded-lg shadow p-8">
    <h3 class="text-2xl font-bold mb-6 text-indigo-600">리스트 상세</h3>
    <div class="space-y-4 text-gray-800">
      <p>
        <span class="font-semibold text-gray-700">리스트명:</span>
        {{ list.listName }}
      </p>
      <p>
        <span class="font-semibold text-gray-700">리스트 날짜:</span>
        {{ formatDate(list.listDate) }}
      </p>
      <p>
        <span class="font-semibold text-gray-700">완료여부:</span>
        <span :class="list.completedYn === 'Y' ? 'text-green-600' : 'text-gray-500'">
          {{ list.completedYn === 'Y' ? '완료' : '미완료' }}
        </span>
      </p>
      <p>
        <span class="font-semibold text-gray-700">등록일:</span>
        {{ formatDate(list.regDt) }}
      </p>
      <!-- 기타 정보 표시 -->
    </div>
    <button
        @click="$router.back()"
        class="mt-8 w-full bg-indigo-600 text-white font-semibold py-2 rounded hover:bg-indigo-700 transition"
    >
      목록으로
    </button>
  </div>
</template>

<script>
import axios from 'axios';
import dayjs from 'dayjs';
import utc from 'dayjs/plugin/utc';
import timezone from 'dayjs/plugin/timezone';
dayjs.extend(utc);
dayjs.extend(timezone);

export default {
  data() {
    return { list: null };
  },
  mounted() {
    const listNo = this.$route.params.listNo;
    axios.get(`/api/list/${listNo}`).then(res => {
      this.list = res.data;
      console.log('API 응답:', res.data);
    }).catch(err => {
      console.error('API 에러:', err);
    });
  },
  methods: {
    formatDate(date) {
      return date ? dayjs.utc(date).tz('Asia/Seoul').format('YYYY-MM-DD') : '';
    }
  }
};
</script>
