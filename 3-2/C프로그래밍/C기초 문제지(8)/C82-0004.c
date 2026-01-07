#include <stdio.h>

// 배열 상태 출력 함수
void debug_arr(int arr[], int used_size) {
    for (int i = 0; i < used_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// 원소 삽입 및 이동 함수
void insert_value(int arr[], int *used_size, int arrCnt, int index, int value) {
    // 1. 유효성 검사 (배열 꽉 참 또는 인덱스 범위 오류)
    if (*used_size >= arrCnt) {
        printf("삽입 실패\n");
        return;
    }
    if (index < 0 || index > *used_size) {
        printf("유효하지 않은 인덱스입니다.\n");
        return;
    }

    // 2. Shift Right: 삽입할 위치 확보를 위해 뒤에서부터 원소를 밈
    // 주의: 데이터를 덮어쓰지 않기 위해 반드시 '뒤에서 앞으로' 순회해야 함
    for (int i = *used_size; i > index; i--) {
        arr[i] = arr[i - 1];
    }

    // 3. 값 삽입 및 사용 크기 증가
    arr[index] = value;
    (*used_size)++;

    // 결과 출력
    debug_arr(arr, *used_size);
}

int main() {
    // [예시 1] 정상 삽입
    int arr1[10] = {1, 2, 3, 4};
    int used_size1 = 4;

    // 인덱스 2 위치에 99 삽입
    insert_value(arr1, &used_size1, 10, 2, 99); 
    // 출력: 1 2 99 3 4

    // [예시 2] 삽입 실패 (공간 부족)
    int arr2[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int used_size2 = 10;

    // 인덱스 15 위치에 999 삽입 시도
    insert_value(arr2, &used_size2, 10, 15, 999); 
    // 출력: 삽입 실패

    return 0;
}
