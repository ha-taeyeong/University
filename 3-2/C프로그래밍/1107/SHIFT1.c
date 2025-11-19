#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void debug_title(char x_str[]) // 배열 문자열 전달
{
    printf("%s : ",x_str);
}

void debug_title2(char x_str[], size_t x_val) // 배열 문자열 전달
{
    printf("%s : %zu \n", x_str, x_val);
}

int main()
{
    int arr[10] = {1, 2, 3, 4, 5};
    
    // 이제 컴파일러는 size_t를 정확히 전달하는 것을 알고 있습니다.
    debug_title2("물리적메모리크기", sizeof(arr)); // sizeof는 size_t를 반환
    debug_title2("저장공간갯수", sizeof(arr) / sizeof(int));

    int arr_cnt = 5; // 배열의 사용크기를 알려주어야 한다.

    debug_title("초기값");

    for(int i=0; i<arr_cnt; i++)
        printf("%d ", arr[i]);
    printf("\n");

    for(int i=0; i<arr_cnt; i++)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
    }

    debug_title("left shift");
    for(int i=0; i<arr_cnt; i++)
        printf("%d ", arr[i]);
    printf("\n");

    // 첫번째 right shift
    for(int i=arr_cnt-1; i>0; i--)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = tmp;
    }

    debug_title("right shift");
    for(int i=0; i<arr_cnt; i++)
        printf("%d ", arr[i]);
    printf("\n");

    // 두번째 right shift
    for(int i=arr_cnt-1; i>0; i--)
    {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = tmp;
    }

    debug_title("right shift");
    for(int i=0; i<arr_cnt; i++)
        printf("%d ", arr[i]);
    printf("\n");

    return 0;
    
}