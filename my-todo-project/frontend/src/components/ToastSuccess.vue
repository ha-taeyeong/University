<!-- @/components/ToastSuccess.vue -->
<template>
  <div
      v-if="show"
      class="fixed top-8 left-1/2 -translate-x-1/2 z-50 w-full max-w-xs bg-green-500 text-white px-4 py-3 rounded shadow-lg flex items-center"
      role="alert"
  >
    <svg class="w-5 h-5 mr-2" fill="none" stroke="currentColor" stroke-width="2" viewBox="0 0 24 24">
      <path stroke-linecap="round" stroke-linejoin="round" d="M5 13l4 4L19 7"/>
    </svg>
    {{ message }}
    <button @click="close" class="ml-auto pl-3 text-white/70 hover:text-white">
      <span class="sr-only">닫기</span>
      <svg class="w-4 h-4" fill="none" viewBox="0 0 24 24" stroke="currentColor">
        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M6 18L18 6M6 6l12 12"/>
      </svg>
    </button>
  </div>
</template>

<script setup>
import { watch } from 'vue'

const props = defineProps({
  show: Boolean,
  message: String,
  duration: { type: Number, default: 2000 }
})
const emit = defineEmits(['update:show'])

function close() {
  emit('update:show', false)
}

watch(() => props.show, (val) => {
  if (val && props.duration > 0) {
    setTimeout(close, props.duration)
  }
})
</script>
