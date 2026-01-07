#include <stdio.h>

void insert_value(int arr[], int *used_size, int arrCnt, int index, int value){
    // 1. 삽입 실패 조건 검사 (사용 크기가 물리적 크기와 같을 경우)
    if (*used_size >= arrCnt)  {
        printf("삽입 실패\n");
        return;
    }

    // 2. 인덱스 유효성 검사 (index는 0 이상 used_size 이하)
    if (index < 0 || index > *used_size) {
        printf("유효하지 않은 인덱스입니다.\n");
        return;
    }

    // 3. 삽입 위치(index)부터 끝까지 원소를 뒤로 한 칸씩 밈 (Shift Right)
    for (int i = *used_size; i > index; i--) {
        arr[i] = arr[i - 1];
    }

    // 4. 새 값을 삽입
    arr[index] = value;

    // 5. 사용 크기 1 증가
    (*used_size)++;
}

void debug_arr(int arr[], int used_size){
    for(int i = 0; i < used_size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {1, 2, 3, 4};
    int used_size = 4;
    int index = 2;
    int value = 99;

    insert_value(arr, &used_size, 10, index, value);
    debug_arr(arr, used_size);
    return 0;
}
