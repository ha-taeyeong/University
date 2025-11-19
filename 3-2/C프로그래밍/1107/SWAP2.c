#include<stdio.h>
void myswap(int *x_a, int *x_b)
{
    int tt = 0;
    tt = *x_a;
    *x_a = *x_b;
    *x_b = tt;
}

int main()
{
    int a = 3;
    int b = 4;

    printf("%d  %d \n", a,b);

    myswap(&a, &b);

    printf("%d  %d \n", a,b);

    return 0;
}