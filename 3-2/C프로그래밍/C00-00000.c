#include <stdio.h>

// 입력 : 학번_이름
// 출력 : 123456_홍길동

int main()
{
    char str[100];

    scanf("%s", str); // 연속해서 받는 경우
    printf("%s\n", str);

    return 0;
}