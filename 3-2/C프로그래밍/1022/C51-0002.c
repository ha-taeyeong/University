#include <stdio.h>

int main(void) {
    int result = 1;
    int i = 1;

    // for 무한 반복문 (조건식이 항상 참)
    for (;;) { 
        // 10까지 곱하는 것이므로, i가 11이 되면 반복을 종료합니다.
        if (i > 10) {
            break; // break 탈출문 사용
        }

        // 현재 result에 i를 곱합니다.
        result *= i; 
        
        // 중간 결과값을 행 단위로 출력합니다.
        printf("%d\n", result);
        
        // 다음 숫자로 증가시킵니다.
        i++; 
    }
    
    return 0;
}