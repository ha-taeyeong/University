#include <stdio.h>

int main(void) {
    int num = 24;

    // 1부터 num까지 반복하여 약수를 찾습니다.
    for (int i = 1; i <= num; i++) {
        // i가 num의 약수인지 확인합니다. (나머지가 0인 경우)
        if (num % i == 0) {
            printf("%d", i);
            
            // 마지막 약수(24)가 아니라면 공백을 추가합니다.
            if (i < num) {
                printf(" ");
            }
        }
    }
    printf("\n"); // 줄 바꿈
    
    return 0;
}