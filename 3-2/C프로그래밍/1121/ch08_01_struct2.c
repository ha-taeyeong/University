// 지역변수 이용 (Call By Value)
// 지역변수 이용 (Call By Reference)

#include <stdio.h>
//지역변수 이용 (Call By Reference) 호출
//지역변수 이용 (Call By Value) 반환
int myadd_val(int* x_arr)  
{
    return x_arr[0] + x_arr[1];
}
//지역변수 이용 (Call By Reference) 호출
//지역변수 이용 (Call By Reference) 반환
void myadd_ref(int* x_arr, int* x_reult)
{
    *x_reult = x_arr[0] + x_arr[1];
} //1개의 값만 return 가능하다.

int main()
{
    int arr[] = {3,4};
    int result;

    result = myadd_val(arr);
    printf("myadd_val : %d \n", result);

    myadd_ref(arr, &result);
    printf("myadd_ref : %d \n", result);
}