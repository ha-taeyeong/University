#include <stdio.h>
// 같은 문제를 배열을 이용해서 해결해보자.

void main_copy()
{
    int arr[10] = {3,4};

    int tt = 0;

    for(int i=0; i<2; i++)
        printf("%d ", arr[i]);    
    printf("\n");
    
    tt = arr[0];
    arr[0] = arr[1];
    arr[1] = tt; 

    for(int i=0; i<2; i++)
        printf("%d ", arr[i]);
    printf("\n");        
}

void myswap(int *x_a, int *x_b)
{
    int tt = 0;
    tt = *x_a;
    *x_a = *x_b;
    *x_b = tt;
}

int main()
{
    int arr[10] = {3,4};

    int tt = 0;

    for(int i=0; i<2; i++)
        printf("%d ", arr[i]);
    printf("\n");  

    myswap(&arr[0],&arr[1]); //방법1) 배열의 주소 입력

    myswap((arr+0),(arr+1)); //방법2) 배열의 주소 입력   () 괄호 주의

    for(int i=0; i<2; i++)
        printf("%d ", arr[i]);
    printf("\n");  
    return 0;
}