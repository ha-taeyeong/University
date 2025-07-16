<template>
  <form class="bg-white p-6 rounded-lg shadow w-full max-w-sm mx-auto" @submit.prevent="save">
    <div>
      <label class="block mb-1 font-semibold text-gray-700">리스트명</label>
      <input v-model="form.listName" name="listName" placeholder="리스트명"
             class="border rounded px-3 py-2 w-full mb-3" />
    </div>
    <div>
      <label class="block mb-1 font-semibold text-gray-700">리스트 날짜</label>
      <input type="date" v-model="form.listDate"
             class="w-full border rounded px-3 py-2 mb-3 focus:ring-2 focus:ring-indigo-500" />
    </div>
    <div v-if="errorMsg" class="flex items-center p-3 mb-3 text-sm text-red-800 rounded-lg bg-red-50" role="alert">
      <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20">
        <path d="M18 10A8 8 0 11 2 10a8 8 0 0116 0zM8.257 3.099c..."/>
      </svg>
      <span class="font-medium">{{ errorMsg }}</span>
    </div>
    <button type="submit"
            :disabled="loading || !form.listName.trim()"
            class="bg-indigo-600 text-white px-4 py-2 rounded hover:bg-indigo-700 transition
         disabled:bg-gray-300 disabled:text-gray-400 disabled:cursor-not-allowed">
      저장
    </button>
    <button type="button"
            class="ml-2 px-4 py-2 border rounded hover:bg-gray-200 transition"
            @click="$emit('close')">취소</button>
    <AlertSuccess :show="showAlert" message="저장되었습니다." @update:show="showAlert = $event" />
  </form>
</template>

<script setup>
import { ref, watch } from 'vue'
import { useStore } from 'vuex'
import { useRouter } from 'vue-router'
import axios from 'axios'
import AlertSuccess from '@/components/AlertSuccess.vue'

const props = defineProps({ editItem: Object })
const emit = defineEmits(['saved', 'close'])
const store = useStore()
const router = useRouter()
const form = ref(props.editItem ? { ...props.editItem } : { listName: '' , listDate: '' })
const errorMsg = ref('')
const loading = ref(false)
const showAlert = ref(false)

watch(() => props.editItem, (newVal) => {
  form.value = newVal ? { ...newVal } : { listName: '', listDate: '' }
}, { immediate: true })

async function save() {
  if (!form.value.listName.trim()) {
    errorMsg.value = '리스트명을 입력하세요.'
    return
  }
  if (!form.value.listDate) {
    errorMsg.value = '리스트 날짜를 선택하세요.'
    return
  }
  errorMsg.value = ''
  loading.value = true
  const payload = {
    ...form.value,
    userNo: store.state.userNo
  }
  try {
    if (props.editItem) {
      await axios.put(`/api/list/${form.value.listNo}`, payload)
    } else {
      await axios.post('/api/list', payload)
    }
    showAlert.value = true
    setTimeout(async () => {
      emit('saved')
      emit('close')
      if (!more) {
        router.push('/list')
      } else {
        form.value = { listName: '' }
      }
    }, 2000) // 알림이 2초간 뜬 뒤 다음 로직 실행
  } catch (err) {
    errorMsg.value = props.editItem
        ? '리스트 수정에 실패했습니다.'
        : '리스트 저장에 실패했습니다.'
  } finally {
    loading.value = false
  }
}
</script>


