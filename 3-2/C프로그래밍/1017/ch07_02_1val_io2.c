#include <stdio.h>

// 입력 : A 65 41 101
// 출력 : A , A , A , A

// <터미널 입출력 원리>
// (1) scanf 로 중복해서 데이터를 받을 경우 데이터 타입을 구분해준다.
// (2) 서식지정연산자에 2진수는 없다.

int main()
{
    char c1;
    int c2,c3,c4;
    
    // scanf("%c",&c1);  //문자를 각각 받는 경우
    // scanf("%d",&c2);
    // scanf("%x",&c3);  
    // scanf("%o",&c4);
    
    scanf("%c %d %x %o",&c1,&c2,&c3,&c4);  //연속해서 받는 경우
    
    printf("%c , %c , %c , %c \n",c1, c2, c3, c4);
}