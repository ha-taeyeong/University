#include <stdio.h>
#include <stdlib.h> // (rand(), srand(), time.h는 시프트 로직에 불필요하므로 제거해도 무방)
#include <time.h>

int main()
{
    int arr[10] = {1, 2, 3, 4, 5};
    int arr_cnt = 5; // 배열의 사용크기

    printf("초기값 :");
    for(int i=0; i<arr_cnt; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // ===============================================
    // 1. Left Shift 구현 및 출력 (1 2 3 4 5 -> 2 3 4 5 1)
    // ===============================================
    
    printf("left shift :");
    
    // 1-1. 가장 앞의 값 (arr[0])을 임시 저장
    int temp = arr[0]; 
    
    // 1-2. 모든 요소를 왼쪽(앞)으로 한 칸씩 이동 (덮어쓰기)
    for(int i = 0; i < arr_cnt - 1; i++) {
        arr[i] = arr[i+1];
    }
    
    // 1-3. 임시 저장했던 값을 가장 뒤(arr[4])에 삽입
    arr[arr_cnt - 1] = temp;
    
    // 1-4. Left Shift 결과 출력
    for(int i=0; i<arr_cnt; i++) {
        printf("%d ", arr[i]); // 현재: 2 3 4 5 1
    }
    printf("\n");


    // ===============================================
    // 2. Right Shift 1 구현 및 출력 (2 3 4 5 1 -> 1 2 3 4 5)
    // ===============================================

    printf("right shift :");

    // 2-1. 가장 뒤의 값 (arr[4])을 임시 저장 (현재 1)
    temp = arr[arr_cnt - 1];
    
    // 2-2. 모든 요소를 오른쪽(뒤)으로 한 칸씩 이동
    for(int i = arr_cnt - 1; i > 0; i--) {
        arr[i] = arr[i-1];
    }
    
    // 2-3. 임시 저장했던 값을 가장 앞(arr[0])에 삽입
    arr[0] = temp;

    // 2-4. Right Shift 1 결과 출력
    for(int i=0; i<arr_cnt; i++) {
        printf("%d ", arr[i]); // 현재: 1 2 3 4 5
    }
    printf("\n");


    // ===============================================
    // 3. Right Shift 2 구현 및 출력 (1 2 3 4 5 -> 5 1 2 3 4)
    // ===============================================
    
    printf("right shift :");

    // 3-1. 가장 뒤의 값 (arr[4])을 임시 저장 (현재 5)
    temp = arr[arr_cnt - 1]; 
    
    // 3-2. 모든 요소를 오른쪽(뒤)으로 한 칸씩 이동
    for(int i = arr_cnt - 1; i > 0; i--) {
        arr[i] = arr[i-1];
    }
    
    // 3-3. 임시 저장했던 값을 가장 앞(arr[0])에 삽입
    arr[0] = temp;

    // 3-4. Right Shift 2 결과 출력
    for(int i=0; i<arr_cnt; i++) {
        printf("%d ", arr[i]); // 현재: 5 1 2 3 4
    }
    printf("\n");

    return 0;
}