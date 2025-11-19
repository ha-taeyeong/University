#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int arr[10] = {1,2,3,4,5};

    printf("%lu  \n",sizeof(arr)); //물리적메모리크기
    printf("%lu  \n",sizeof(arr)/sizeof(int)); //저장공간갯수
    int arr_cnt = 5;  //배열의 사용크기를 알려주어야 한다.

    printf("right shift :");
    for(int i=0; i<arr_cnt; i++)
        printf("%d ", arr[i]);
    printf("\n");

}