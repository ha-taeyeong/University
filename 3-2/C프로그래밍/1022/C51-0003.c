#include <stdio.h>

int main(void) {
    long long result = 1;
    int i = 1;

    // i가 10 이하일 때까지 반복합니다.
    while (i <= 10) { 
        // 현재 result에 i를 곱합니다.
        result *= i; 
        
        // 중간 결과값을 행 단위로 출력합니다.
        printf("%lld\n", result);
        
        // 다음 숫자로 증가시킵니다.
        i++; 
    }
    
    return 0;
}