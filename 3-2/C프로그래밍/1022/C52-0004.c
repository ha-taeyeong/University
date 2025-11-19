#include <stdio.h>

int main(void) {
    int num1 = 6;
    int num2 = 8;
    int lcm = 0; // Least Common Multiple (최소공배수)

    // 두 수 중 큰 수부터 시작하여 무한히 반복합니다. (최소공배수는 반드시 두 수 중 크거나 같습니다)
    // for문을 이용하라는 조건에 맞게, for(;;) 무한 루프를 사용합니다.
    for (int i = (num1 > num2) ? num1 : num2; ; i++) {
        // i가 num1과 num2의 공배수인지 확인합니다. (두 수로 모두 나누어 떨어지는 경우)
        if (i % num1 == 0 && i % num2 == 0) {
            lcm = i; // 최소공배수를 찾았습니다.
            break;   // 반복을 종료합니다.
        }
    }
    
    // 최종 최소공배수를 출력합니다.
    printf("%d\n", lcm);
    
    return 0;
}