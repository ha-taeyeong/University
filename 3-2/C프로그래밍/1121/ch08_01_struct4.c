#include <stdio.h>

struct myadd //구조체틀 생성
{
    int arr[2];
    int result;
};

int myadd_val(int* x_arr)  // 지역변수 이용 (Call By Value-Return)
{
    return x_arr[0] + x_arr[1];
}

void myadd_ref(int* x_arr, int* x_reult) // 지역변수 이용 (Call By Reference-Return)
{
    *x_reult = x_arr[0] + x_arr[1];
}

void myadd_struct(struct myadd *x_myadd) // 구조체 전달 (Call By Reference-Return)
{
    x_myadd->result = x_myadd->arr[0] + (*x_myadd).arr[1];  //구조체 포인터 연산자 -> 
                                        // *x_myadd : 주소, (*x_myadd) : 값
                                        //  *x_myadd.arr[1] // 연산순서 : 1. x_myadd.arr[1] 2. * 
                                        //  (*). ==   ->
}

int main()
{
    struct myadd myadd1;
    myadd1.arr[0] = 3;
    myadd1.arr[1] = 4;

    myadd1.result = myadd_val(myadd1.arr);  // 지역변수 이용 (Call By Value-Return)
    printf("myadd_val : %d \n", myadd1.result);

    myadd_ref(myadd1.arr, &myadd1.result);    // 지역변수 이용 (Call By Reference-Return)
    printf("myadd_ref : %d \n", myadd1.result);

    myadd_struct(&myadd1);    // 지역변수 이용 (Call By Reference-Return)
    printf("myadd_ref : %d \n", myadd1.result);
}