<template>
  <form @submit.prevent="save">
    <input v-model="form.listName" name="listName" placeholder="리스트명" />
    <button type="submit">저장</button>
    <button type="button" @click="$emit('close')">취소</button>
  </form>
</template>

<script>
import axios from 'axios';
export default {
  props: { editItem: Object },
  data() {
    return {
      form: this.editItem ? { ...this.editItem } : { listName: '' }
    };
  },
  methods: {
    save() {
      console.log(this.form.listName);
      if (!this.form.listName) {
        alert('리스트명을 입력하세요.');
        return;
      }

      // 저장할 데이터 준비
      const payload = {
        ...this.form,
        userNo: this.$store.state.userNo // userNo가 필요하다면
      };

      console.log(this.editItem)
      // 수정 모드인지, 신규 생성인지 분기
      if (this.editItem) {
        // 수정(put)
        axios.put(`/api/list/${this.form.listNo}`, payload)
            .then(() => {
              this.$emit('saved');
              this.$emit('close');
            })
            .catch(err => {
              alert('리스트 수정에 실패했습니다.');
            });
      } else {
        // 신규 생성(post)
        axios.post('/api/list', payload)
            .then(() => {
              this.$emit('saved');
              this.$emit('close');
            })
            .catch(err => {
              alert('리스트 저장에 실패했습니다.');
            });
      }
    }
  }
};
</script>
