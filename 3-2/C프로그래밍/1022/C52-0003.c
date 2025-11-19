#include <stdio.h>

int main(void) {
    int num1 = 36;
    int num2 = 96;
    int gcd = 1; // Greatest Common Divisor (최대공약수)
    
    // 두 수 중 작은 값을 찾습니다. (반복 횟수를 줄이기 위함)
    int smaller = (num1 > num2) ? num1 : num2;

    // 1부터 smaller까지 반복하여 공약수를 찾고, 찾은 공약수 중 가장 큰 값을 저장합니다.
    for (int i = 1; i <= smaller; i++) {
        // i가 두 수의 공약수인지 확인합니다.
        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i; // 공약수를 찾을 때마다 최대공약수(gcd)를 갱신합니다.
        }
    }
    
    // 최종 최대공약수를 출력합니다.
    printf("%d\n", gcd);
    
    return 0;
}