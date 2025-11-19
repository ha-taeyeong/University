#include <stdio.h>

// 문제
// scanf() 를 이용해서 아래와 같이 연산자와 두수를 입력받고 결과를 출력하도록 하시오.
// 입력 : 3            +  6
// 출력 : 3 +  6 = 9

// 입력 : 3  *-2
// 출력 : 3 * -2 = -6

// scanf() 는 엔터입력전까지의 내용을 버퍼를 기준으로 처리한다.
// 버퍼의 내용을 서식과 비교해서 채워 넣는다.
// 숫자인 경우 공란문자white-space characters 은 무시 한다.
// 문자인 경우 공란문자white-space characters 가 포함되는데 유의해야한다. //space tab enter구분기호
// 스페이스를 제외하기 위해 빈칸을 넣어준다.

int main()
{
    char op;
    int in1,in2;
    
    //step1
    scanf("%d",&in1);  //따로 받는 경우
    scanf(" %c",&op); //space 제외
    scanf("%d",&in2);   
    
    //step2
    //scanf("%d %c %d",&in1,&op,&in2);  //연속해서 받는 경우

    switch (op)
    {
    case '+':
        printf("%d %c % d = %d",in1,op,in2,in1+in2);
        break;
    case '-':
        printf("%d %c % d = %d",in1,op,in2,in1-in2);
        break;
    case '*':
        printf("%d %c % d = %d",in1,op,in2,in1*in2);
        break;
    case '/':
        printf("%d %c % d = %d",in1,op,in2,in1/in2);
        break;                
    default:
        break;
    }
}