#include <stdio.h>

void delete_and_shift(int arr[], int *used_size, int delete_index){
    // 1. 삭제할 인덱스 뒤의 원소들을 앞으로 한 칸씩 당김
    for(int i = delete_index; i < (*used_size) - 1; i++) {
        arr[i] = arr[i+1]; // arr[i+1]의 값을 arr[i]로 복사
    }

    // 2. 사용 크기 1 감소
    (*used_size)--;
}

void debug_arr(int arr[], int used_size){
    for(int i = 0; i < used_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int used_size = 5;
    int delete_index = 2;

    delete_and_shift(arr, &used_size, delete_index);
    debug_arr(arr, used_size);
    return 0;
}
