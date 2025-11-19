#include <stdio.h>

int main(void) {
    int num = 24;
    // 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24로 총 8개입니다. 
    // 배열 크기를 넉넉하게 10으로 설정합니다.
    int divisors[10]; 
    int count = 0; // 배열에 저장된 약수의 개수

    // 1. for 반복문을 사용하여 1부터 num까지 약수를 찾아 배열에 저장합니다.
    for (int i = 1; i <= num; i++) {
        // i가 num의 약수인지 확인합니다. (나머지가 0인 경우)
        if (num % i == 0) {
            // 약수를 배열에 저장하고, count를 증가시킵니다.
            divisors[count] = i;
            count++;
        }
    }

    // 2. 배열의 내용을 최종 결과물로 출력합니다.
    // 출력 형식: 숫자 사이에 공백, 마지막 숫자 뒤에는 공백 없음.
    for (int j = 0; j < count; j++) {
        printf("%d", divisors[j]);
        
        // 마지막 요소가 아니라면 공백을 추가합니다.
        if (j < count - 1) {
            printf(" ");
        }
    }
    printf("\n"); // 줄 바꿈
    
    return 0;
}