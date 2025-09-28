<template>
  <div>
    <div class="max-w-3xl mx-auto py-10">
      <h2 class="text-2xl font-bold mb-6 text-center">나의 리스트</h2>
      <div class="flex justify-between items-center mb-4 gap-2">
        <!-- 날짜 필터 그룹 -->
        <div class="flex items-center gap-2">
          <input
              type="date"
              v-model="selectedDate"
              class="border rounded px-3 py-2 focus:ring-2 focus:ring-indigo-500"
          />
          <button
              @click="fetchLists"
              class="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
          >
            날짜별 조회
          </button>
        </div>
        <!-- 리스트 추가 버튼 -->
        <button
            @click="openAddForm"
            class="bg-indigo-600 text-white px-5 py-2 rounded-lg font-bold shadow-md
      hover:bg-indigo-700 hover:scale-105 active:scale-95 transition
      focus:outline-none focus:ring-2 focus:ring-indigo-400"
        >
          리스트 추가
        </button>
      <transition name="fade">
          <div v-if="showModal" class="fixed inset-0  z-50 flex items-center justify-center">
            <!-- 반투명 오버레이 -->
            <div class="fixed inset-0 bg-black bg-opacity-30" @click="closeModal"></div>
            <!-- 모달 내용 -->
            <div class="bg-white rounded-lg shadow-lg w-96 p-8 relative z-10">
              <button @click="closeModal" class="absolute top-4 right-4 text-gray-400 hover:text-gray-600">
                <span class="sr-only">닫기</span>
                <svg class="w-6 h-6" fill="none" stroke="currentColor" stroke-width="2" viewBox="0 0 24 24">
                  <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12"/>
                </svg>
              </button>
              <h3 class="text-xl font-bold mb-6 text-center">리스트 추가</h3>
              <ListForm :key="showModal" @close="closeModal" @saved="onSaved" />
            </div>
          </div>
        </transition>
      </div>
      <div class="overflow-x-auto rounded-lg shadow">
        <table class="min-w-full bg-white text-gray-900 border border-gray-200">
          <thead class="bg-gray-100">
          <tr>
            <th class="py-3 px-4 border-b text-center">완료</th>
            <th class="py-3 px-4 border-b text-center">리스트명</th>
            <th class="py-3 px-4 border-b text-center">수정</th>
            <th class="py-3 px-4 border-b text-center">삭제</th>
          </tr>
          </thead>
          <tbody>
          <tr
              v-for="(list, idx) in lists"
              :key="list.listNo"
              class="hover:bg-indigo-50 transition"
          >
            <!-- 완료 여부 -->
            <td class="py-2 px-4 border-b text-center">
              <template v-if="editIndex !== idx">
                  <span
                      :class="list.completedYn === 'Y' ? 'text-green-600 font-semibold' : 'text-gray-500'"
                  >
                    {{ list.completedYn === 'Y' ? '완료' : '미완료' }}
                  </span>
              </template>
              <template v-else>
                <select
                    v-model="editCompletedYn"
                    class="border rounded px-2 py-1 focus:ring-2 focus:ring-indigo-500"
                >
                  <option value="Y">완료</option>
                  <option value="N">미완료</option>
                </select>
              </template>
            </td>
            <!-- 리스트명 -->
            <td
                class="py-2 px-4 border-b cursor-pointer text-center"
                @click="editIndex !== idx && goToDetail(list.listNo)"
            >
              <template v-if="editIndex !== idx">
                <span class="hover:underline">{{ list.listName }}</span>
              </template>
              <template v-else>
                <input
                    v-model="editName"
                    @keyup.enter="saveEdit(idx, list)"
                    class="border rounded px-2 py-1 w-full focus:ring-2 focus:ring-indigo-500"
                />
                <input
                    type="date"
                    v-model="editDate"
                    class="border rounded px-2 py-1 w-full mt-2 focus:ring-2 focus:ring-indigo-500"
                />
              </template>
            </td>
            <!-- 수정/저장/취소 버튼 -->
            <td class="py-2 px-4 border-b text-center">
              <template v-if="editIndex !== idx">
                <button
                    @click="startEdit(idx, list)"
                    class="bg-yellow-400 text-white px-3 py-1 rounded hover:bg-yellow-500 transition"
                >
                  수정
                </button>
              </template>
              <template v-else>
                <button
                    @click="saveEdit(idx, list)"
                    class="bg-green-500 text-white px-3 py-1 rounded hover:bg-green-600 transition mr-2"
                >
                  저장
                </button>
                <button
                    @click="cancelEdit"
                    class="bg-gray-400 text-white px-3 py-1 rounded hover:bg-gray-500 transition"
                >
                  취소
                </button>
              </template>
            </td>
            <!-- 삭제 버튼 -->
            <td class="py-2 px-4 border-b text-center">
              <button
                  type="button"
                  @click="deleteList(list.listNo)"
                  class="bg-red-500 text-white px-3 py-1 rounded hover:bg-red-600 transition"
              >
                삭제
              </button>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <ConfirmDialog
      :show="showConfirm"
      title="리스트 삭제"
      message="정말 삭제하시겠습니까?"
      @confirm="onConfirmDelete"
      @cancel="onCancelDelete"
  />
</template>

<script setup>
import { ref, onMounted, onUnmounted, watch } from 'vue'
import { useRouter } from 'vue-router' // [1] 라우터 임포트
import axios from 'axios'
import ListForm from "@/views/ListForm.vue";
import ConfirmDialog from '@/components/ConfirmDialog.vue'


const router = useRouter() // [1] 라우터 인스턴스

const lists = ref([])
const showModal = ref(false)
const editName = ref('')
const editDate = ref('')
const editIndex = ref(null)
const editCompletedYn = ref('N')
const showConfirm = ref(false)
const targetListNo = ref(null)
const selectedDate = ref(getLocalToday());

function getLocalToday() {
  const now = new Date();
  const yyyy = now.getFullYear();
  const mm = String(now.getMonth() + 1).padStart(2, '0');
  const dd = String(now.getDate()).padStart(2, '0');
  return `${yyyy}-${mm}-${dd}`;
}

// [상세 페이지 이동]
function goToDetail(listNo) {
  router.push(`/list/${listNo}`)
  // alert('상세로 이동: ' + listNo) // 실제 서비스에서는 제거
}

// [리스트 추가 모달 열기]
function openAddForm() {
  showModal.value = true
  // console.log('showModal:', showModal.value)
}

// [리스트 추가 모달 닫기]
function closeModal() {
  showModal.value = false
}

// [리스트 추가/수정 후 리스트 갱신]
function onSaved() {
  closeModal()
  fetchLists()
}

// [리스트 데이터 조회]
const fetchLists = async () => {
  try {
    if (!selectedDate.value) {
      // 날짜가 없을 경우 전체 조회 (또는 에러처리 원하는 대로)
      lists.value = []
      return
    }
    const token = localStorage.getItem('token') // 토큰을 저장해둔 곳에서 가져옵니다.
    const res = await axios.get('/api/list', {
      headers: {
        Authorization: `Bearer ${token}` // JWT 토큰 앞에 'Bearer '를 붙입니다.
      },
      params: {
        date: selectedDate.value // 필요한 쿼리 파라미터
      }
    })
    lists.value = res.data.filter(item => item.delYn === "N")
  } catch (e) {
    console.error('리스트 불러오기 실패:', e)
  }
}

// [수정모드 진입]
function startEdit(idx, list) {
  editIndex.value = idx
  editName.value = list.listName
  editCompletedYn.value = list.completedYn
  editDate.value = list.listDate ? list.listDate.slice(0, 10) : ''
}

// [수정 저장]
async function saveEdit(idx, list) {
  try {
    await axios.put(`/api/list/${list.listNo}`, {
      ...list,
      listName: editName.value,
      completedYn: editCompletedYn.value,
      listDate: editDate.value
    })
    await fetchLists()
    editIndex.value = null
  } catch (e) {
    alert('수정에 실패했습니다.')
  }
}

// [수정 취소]
function cancelEdit() {
  editIndex.value = null
}

// [삭제 다이얼로그 열기]
function deleteList(listNo) {
  showConfirm.value = true
  targetListNo.value = listNo
}

// [삭제 확인]
async function onConfirmDelete() {
  showConfirm.value = false
  try {
    await axios.delete(`/api/list/${targetListNo.value}`)
    await fetchLists()
  } catch (e) {
    alert('삭제에 실패했습니다.')
  }
}

// [삭제 취소]
function onCancelDelete() {
  showConfirm.value = false
}

// [ESC 키로 모달 닫기]
function escClose(e) {
  if (e.key === 'Escape') closeModal()
}

// [마운트 시 데이터 조회, ESC 이벤트 등록]
onMounted(() => {
  fetchLists()
  window.addEventListener('keydown', escClose)
})

watch(selectedDate, fetchLists)

// [언마운트 시 ESC 이벤트 해제]
onUnmounted(() => {
  window.removeEventListener('keydown', escClose)
})
</script>

