/*
다음 프로그램은 두수를 입력받고, **최대공약수** 를 전달해주는 프로그램의 일부이다.

gcd() 함수를 완성하시오.

- 조건
    - for 반복문 사용하시오
- 입출력 예
    - 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
    - 입력 안내 메시지는 생략해주세요
*/
#include <stdio.h>

int gcd(int v1, int v2) {
    int limit = (v1 < v2) ? v1 : v2;
    int result = 0; // 최대공약수 결과 변수

    for(int i = limit; i>=1; i--) {
        if(v1 % i == 0 && v2 % i == 0) {
            return i;
        }
    }
    return 1;
}

int main()
{
    int v1 = 96;
    int v2 = 36;

    printf("%d ", gcd(v1, v2));
}
