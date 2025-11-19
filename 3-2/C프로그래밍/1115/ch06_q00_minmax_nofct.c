// minmax
// 배열을 던져주면 가장 큰 값과 가장 작은 값을 출력해주는 함수를 만드시오.

#include <stdio.h>

int arr[10] = {3,2,5,2,3}; //전역변수
int arr_cnt = 5;

int min = 100;  // 가장 큰 수(비교값)
int max = -100; // 가장 작은 수(비교값)

// Ctrl + K + F : 코드 정리
// Ctrl + K + [     or      Ctrl + K + ] : 코드 접기
void minmax()
{
    for(int i=0; i<arr_cnt; i++)
    {
        if(arr[i] < min)
            min = arr[i];
        if(arr[i] > max)
            max = arr[i];
    }
}

void basic_main()
{
    printf("입력된 숫자 : ");
    for (int i = 0; i < 5; i++) // 지역변수
        printf("%d ", arr[i]);
    printf("\n");

    minmax();

    printf("min :%d  max : %d \n", min, max);
}

void basic_main2()
{
    printf("입력된 숫자 : ");
    for (int i = 0; i < 5; i++) // 지역변수
        printf("%d ", arr[i]);
    printf("\n");

    minmax();

    printf("min :%d  max : %d \n", min, max);
}

void main()
{    
    // basic_main();
    basic_main2();
}