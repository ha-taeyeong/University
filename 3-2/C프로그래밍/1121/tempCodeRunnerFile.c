#include <stdio.h>

// struct myadd2 //틀만 만든다.
// {
//     int arr[2];
//     int result;
// }; // 구조체 선언 (메모리 자르는 설계도)

// struct myadd2 st; //선언 (메모리 자르기))
// st.result = 3; //대입 (메모리 값 대입)

// typedef int int32; //선언 (설계도)
// int a;  //선언 (메모리 자르기))
// a=3; //대입 (메모리 값 대입)

struct myadd //틀만 만든다.
{
    int arr[2];
    int result;
}; //12byte

int myadd_val(int* x_arr)  // 지역변수 이용 (Call By Value-Return)
{
    return x_arr[0] + x_arr[1];
}

void myadd_ref(int* x_arr, int* x_reult) // 지역변수 이용 (Call By Reference-Return)
{
    *x_reult = x_arr[0] + x_arr[1];
}

int main()
{
    struct myadd myadd1;  //선언
    myadd1.arr[0] = 3;  //대입
    myadd1.arr[1] = 4;

    myadd1.result = myadd_val(myadd1.arr);  // 지역변수 이용 (Call By Value-Return)
    printf("myadd_val : %d \n", myadd1.result);

    myadd_ref(myadd1.arr, &myadd1.result);    // 지역변수 이용 (Call By Reference-Return)
    printf("myadd_ref : %d \n", myadd1.result);
}