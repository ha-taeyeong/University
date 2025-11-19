#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void debug_title(char x_str[]) //배열 문자열 전달
{
    printf("%s : ",x_str);
}

void debug_title2(char x_str[],int x_val) //배열 문자열 전달
{
    printf("%s : %d \n",x_str,x_val);
}

void debug_arr(int x_arr[],int x_cnt)
{
    for(int i=0; i<x_cnt; i++)
        printf("%d ", x_arr[i]);
    printf("\n");    
}

int main()
{
    int arr[10] = {1,2,3,4,5};

    debug_title2("물리적메모리크기",sizeof(arr));
    debug_title2("저장공간갯수",sizeof(arr)/sizeof(int));

    int arr_cnt = 5;  //배열의 사용크기를 알려주어야 한다.

    debug_title("초기값");    
    debug_arr(arr, arr_cnt);
    for(int i=0; i<arr_cnt-1; i++)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
    }
    
    debug_title("left shift");
    debug_arr(arr, arr_cnt);

    //첫번째 right shift
    for(int i=arr_cnt-1; i>0; i--)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = tmp;
    }
    
    debug_title("right shift");    
    debug_arr(arr, arr_cnt);
    //두번째 right shift
    for(int i=arr_cnt-1; i>0; i--)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = tmp;
    }
    
    debug_title("right shift");  
    debug_arr(arr, arr_cnt);

    return 0;
}