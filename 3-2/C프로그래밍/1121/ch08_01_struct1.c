// 전역변수 이용
#include <stdio.h>

int arr[] = {3,4};
int result=0;

int myadd()
{
    return arr[0] + arr[1];
}

int main()
{
    result = myadd();
    printf("%d \n", result);
}