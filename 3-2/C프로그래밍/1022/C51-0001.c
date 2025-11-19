#include <stdio.h>

int main(void) {
    // long long을 사용하여 10!의 최종 결과값 3,628,800을 안전하게 담습니다.
    int result = 1;

    // 1부터 10까지 반복합니다.
    for (int i = 1; i <= 10; i++) {
        // 현재 result에 i를 곱합니다.
        result *= i; 
        
        // 중간 결과값을 행 단위로 출력합니다.
        printf("%d\n", result);
    }
    
    return 0;
}