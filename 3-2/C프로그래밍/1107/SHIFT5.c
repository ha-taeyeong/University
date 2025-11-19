#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//문제
//Shift 에 대해서 이해하고 있는가? (Swap 을 연속으로 사용)
//배열의 크기를 읽을 수 있는가?
//배열의 사용 크기를 작성해주어야 한다.

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

void arr_shift(int x_arr[],int x_cnt,char op)
{
    switch(op)
    {
        case 'l':
            for(int i=0; i<x_cnt-1; i++)
            {
                int tmp;
                tmp = x_arr[i];
                x_arr[i] = x_arr[i+1];
                x_arr[i+1] = tmp;
            } 
            break;
        case 'r':
            for(int i=x_cnt-1; i>0; i--)
            {
                int tmp;
                tmp = x_arr[i];
                x_arr[i] = x_arr[i-1];
                x_arr[i-1] = tmp;
            }
            break;
        
    }
}

void arr_shift_cnt(int x_arr[],int x_cnt,int x_shift_cnt)
{
    while(x_shift_cnt != 0)
    {
        if(x_shift_cnt < 0)
        {
            arr_shift(x_arr, x_cnt, 'l');
            x_shift_cnt++;
        }
        else if(x_shift_cnt > 0)
        {
            arr_shift(x_arr, x_cnt, 'r');
            x_shift_cnt--;
        }
    }
}
int main()
{
    int arr[10] = {1,2,3,4,5};

    debug_title2("물리적메모리크기",sizeof(arr));
    debug_title2("저장공간갯수",sizeof(arr)/sizeof(int));

    int arr_cnt = 5;  //배열의 사용크기를 알려주어야 한다.

    debug_title("초기값");    
    debug_arr(arr, arr_cnt);
    
    arr_shift_cnt(arr, arr_cnt,4);
    arr_shift_cnt(arr, arr_cnt,-5);

    debug_title("최종값");    
    debug_arr(arr, arr_cnt);

    return 0;
}