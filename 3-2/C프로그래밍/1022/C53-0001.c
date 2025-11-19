#include <stdio.h>

int main(void) {
    // 1부터 20까지의 정수 중 2와 3의 공배수는 6, 12, 18로 최대 3개입니다.
    // 배열의 크기를 넉넉하게 5로 설정합니다.
    int common_multiples[5]; 
    int count = 0; // 배열에 저장된 공배수의 개수

    // 1. for 반복문을 사용하여 1부터 20까지 2와 3의 공배수를 찾아 배열에 저장합니다.
    for (int i = 1; i <= 20; i++) {
        // 2와 3의 공배수 (6의 배수)인지 확인합니다.
        if (i % 6 == 0) { 
            // 공배수를 배열에 저장하고, count를 증가시킵니다.
            common_multiples[count] = i;
            count++;
        }
    }

    // 2. 배열의 내용을 최종 결과물로 출력합니다.
    // 출력 형식: 숫자 사이에 공백, 마지막 숫자 뒤에는 공백 없음.
    for (int j = 0; j < count; j++) {
        printf("%d", common_multiples[j]);
        
        // 마지막 요소가 아니라면 공백을 추가합니다.
        if (j < count - 1) {
            printf(" ");
        }
    }
    printf("\n"); // 줄 바꿈
    
    return 0;
}