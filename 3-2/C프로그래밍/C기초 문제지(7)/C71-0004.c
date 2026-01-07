/*
다음 프로그램은 두수를 입력받고, **최소공배수** 를 전달해주는 프로그램의 일부이다.

lcm() 함수를 완성하시오.

- 조건
    - for 반복문 사용하시오
- 입출력 예
    - 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
    - 입력 안내 메시지는 생략해주세요
*/
#include <stdio.h>

int lcm(int v1, int v2) {
    int start = (v1 > v2) ? v1 : v2;
    for(int i= start; ; i++) {
        if (i % v1 == 0 && i % v2 == 0) {
            return i; // 가장 먼저 찾은 공배수가 최소공배수이므로, 바로 반환
        }
    }
    return 0;
}

int main()
{
    int v1=6, v2=8;

    printf("%d ", lcm(v1, v2));
}
