#include <stdio.h>

// 입력 : A 65 41 101
// 출력 : A, A, A, A

int main()
{
    char c1;
    int c2,c3,c4;

    scanf("%c %d %x %o", &c1,&c2,&c3,&c4);

    printf("%c, %c, %c, %c\n",c1,c2,c3,c4);

    return 0;
}