#include <stdio.h>

// 배열 상태 출력 함수
void debug_arr(int arr[], int used_size) {
    for (int i = 0; i < used_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// 원소 삭제 및 이동 함수
void delete_and_shift(int arr[], int *used_size, int delete_index) {
    // 1. 유효성 검사 (인덱스 범위 확인)
    if (delete_index < 0 || delete_index >= *used_size) {
        printf("삭제 실패: 인덱스 범위 오류\n");
        return;
    }

    // 2. Shift Left: 삭제할 위치 뒤의 원소들을 앞으로 한 칸씩 당김
    // 앞의 원소를 뒤의 원소로 덮어쓰는 방식 (Overwrite)
    for (int i = delete_index; i < *used_size - 1; i++) {
        arr[i] = arr[i + 1];
    }

    // 3. 사용 크기 1 감소 (포인터 사용)
    (*used_size)--;
}

int main() {
    // [예시 1]
    int arr1[10] = {10, 20, 30, 40, 50};
    int used_size1 = 5;

    // 인덱스 2 (값 30) 삭제
    delete_and_shift(arr1, &used_size1, 2);
    debug_arr(arr1, used_size1); // 출력: 10 20 40 50

    // [예시 2]
    int arr2[10] = {7, 8, 9, 10, 11, 12};
    int used_size2 = 6;

    // 인덱스 0 (값 7) 삭제
    delete_and_shift(arr2, &used_size2, 0);
    debug_arr(arr2, used_size2); // 출력: 8 9 10 11 12

    return 0;
}
