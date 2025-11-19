// minmax
// 배열을 던져주면 가장 큰 값과 가장 작은 값을 출력해주는 함수를 만드시오.

#include <stdio.h>


// void minmax(int x_arr[], int x_cnt, int x_min[], int x_max[])
void minmax(int* x_arr, int x_cnt, int* x_min, int* x_max)
{
    for(int i=0; i<x_cnt; i++)
    {
        if(x_arr[i] < *x_min)
            *x_min = x_arr[i];
        if(x_arr[i] > *x_max)
            *x_max = x_arr[i];
    }
}


void basic_main()
{
    int arr[10] = {3,2,5,2,3};
    int arr_cnt = 5;

    int min = 100;
    int max = 0;

    printf("입력된 숫자 : ");
    for(int i=0; i<5; i++)
        printf("%d ",arr[i]);
    printf("\n");

    
        
    printf("min :%d  max : %d \n", min, max);
}


void sub_main()
{
    int arr[10] = {3,2,5,2,3};
    int arr_cnt = 5;

    int min = 100;
    int max = 0;

    printf("입력된 숫자 : ");
    for(int i=0; i<5; i++)
        printf("%d ",arr[i]);
    printf("\n");

    minmax(arr,arr_cnt,&min,&max);
    printf("min :%d  max : %d \n", min, max);
}

void io_main()
{
    int arr[10];
    int arr_cnt;;

    int min = 100;
    int max = 0;

    printf("숫자 5개를 입력해주세요 ? ");  //6 8 5 2 9
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr[i]);        
        arr_cnt = i+1;
    }

    printf("입력된 숫자 : ");
    for(int i=0; i<5; i++)
        printf("%d ",arr[i]);
    printf("\n");

    minmax(arr,arr_cnt,&min,&max);
    printf("min :%d  max : %d \n", min, max);
}
void main()
{
    // sub_main();
    io_main();
}