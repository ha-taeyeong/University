<template>
  <transition name="fade">
    <div v-if="show" class="fixed inset-0 z-50 flex items-center justify-center bg-black bg-opacity-30">
      <div class="bg-white rounded-lg shadow-lg w-80 p-6 relative">
        <h3 class="text-lg font-bold mb-4 text-center">{{ title }}</h3>
        <p class="mb-6 text-center">{{ message }}</p>
        <div class="flex justify-center gap-4">
          <button
              class="bg-gray-300 hover:bg-gray-400 text-gray-800 font-semibold py-2 px-4 rounded"
              @click="onCancel"
          >취소</button>
          <button
              class="bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-4 rounded"
              @click="onConfirm"
          >확인</button>
        </div>
      </div>
    </div>
  </transition>
</template>

<script setup>
const props = defineProps({
  show: Boolean,
  title: { type: String, default: '확인' },
  message: { type: String, default: '' }
})
const emit = defineEmits(['confirm', 'cancel'])

function onConfirm() {
  emit('confirm')
}
function onCancel() {
  emit('cancel')
}
</script>

<style scoped>
.fade-enter-active, .fade-leave-active {
  transition: opacity 0.2s;
}
.fade-enter-from, .fade-leave-to {
  opacity: 0;
}
.fade-enter-to, .fade-leave-from {
  opacity: 1;
}
</style>
