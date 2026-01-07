/*
다음 프로그램은 arr_shift_cnt() 함수를 이용해서 배열원소를 오른쪽 왼쪽 이동을 수행하는 프로그램의 일부이다.

- arr_shift() 함수를 이용하는 arr_shift_cnt() 함수를 작성하시오
*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void debug_title(char x_str[]) // 배열 문자열 전달
{
    printf("%s : ", x_str);
}

void debug_title2(char x_str[], int x_val) // 배열 문자열 전달
{
    printf("%s : %d \n", x_str, x_val);
}

void debug_arr(int x_arr[], int x_cnt)
{
    for(int i=0; i<x_cnt; i++)
        printf("%d ", x_arr[i]);
    printf("\n");
}

void arr_shift(int x_arr[], int x_cnt, char op)
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


void arr_shift_cnt(int x_arr[], int x_cnt, int op_cnt)
{
    int shift_count = (op_cnt > 0) ? op_cnt : -op_cnt; // 이동 횟수의 절댓값
    char direction;

    // 1. 이동 방향 결정
    if (op_cnt > 0) {
        direction = 'r'; // 양수면 오른쪽 이동
    } else if (op_cnt < 0) {
        direction = 'l'; // 음수면 왼쪽 이동
    } else {
        return; // 0이면 이동할 필요 없음
    }

    // 2. 결정된 횟수(절댓값)만큼 arr_shift 함수 반복 호출
    for (int i=0; i< shift_count; i++) {
        // 배열과 크기, 방향을 arr_shift 함수에 전달하여 1회 이동 수행
        arr_shift(x_arr, x_cnt, direction);
    }
}

int main()
{
    int arr[10] = {1, 2, 3, 4, 5};

    debug_title2("물리적메모리크기", sizeof(arr));
    debug_title2("저장공간갯수", sizeof(arr)/sizeof(int));

    int arr_cnt = 5; // 배열의 사용크기를 알려주어야 한다.

    debug_title("초기값");
    debug_arr(arr, arr_cnt);

    arr_shift_cnt(arr, arr_cnt, 4); // 오른쪽 4번 shift
    arr_shift_cnt(arr, arr_cnt, -5); // 왼쪽 5번 shift

    debug_title("최종값");
    debug_arr(arr, arr_cnt);
}
