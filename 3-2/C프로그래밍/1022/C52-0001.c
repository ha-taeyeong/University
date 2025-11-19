#include <stdio.h>

int main(void) {
    int count = 0; // 출력된 공배수의 개수를 세기 위한 변수 (출력 형식 조절용)

    // 1부터 20까지 반복합니다.
    for (int i = 1; i <= 20; i++) {
        // 2와 3의 공배수(6의 배수)인지 확인합니다. (i % 2 == 0 && i % 3 == 0)
        if (i % 6 == 0) { 
            // 첫 번째 출력 요소가 아니라면 앞에 공백을 추가합니다.
            if (count > 0) {
                printf(" ");
            }
            printf("%d", i);
            count++;
        }
    }
    printf("\n"); // 줄 바꿈
    
    return 0;
}