// 구조체 포인터 함수 선언

#include <stdio.h>
typedef int int32 ;
typedef struct myadd MYADD; //typedef 선언
struct myadd //구조체틀 생성
{
    int32 arr[2];
    int32 result;

    void (*pmyadd_struct)(MYADD *); //포인터 함수 선언
};

int32 myadd_val(int32* x_arr)  // 지역변수 이용 (Call By Value-Return)
{
    return x_arr[0] + x_arr[1];
}

void myadd_ref(int32* x_arr, int32* x_reult) // 지역변수 이용 (Call By Reference-Return)
{
    *x_reult = x_arr[0] + x_arr[1];
}

void myadd_struct(MYADD *x_myadd) // 구조체 전달 (Call By Reference-Return)
{
    x_myadd->result = x_myadd->arr[0] + (*x_myadd).arr[1];  //구조체 포인터 연산자 ->
}

int main()
{
    MYADD myadd1;  //16byte 구조체 생성
    myadd1.arr[0] = 3;
    myadd1.arr[1] = 4;
    myadd1.pmyadd_struct = myadd_struct;  //구조체 포인터함수 대입
    
    myadd1.pmyadd_struct(&myadd1);    //구조체 포인터함수 이용
    printf("myadd_ref : %d \n", myadd1.result);
}