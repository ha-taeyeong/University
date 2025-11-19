#include<stdio.h>

int main()
{
    int a = 3;
    int b = 4;

    int tt = 0;

    printf("%d %d \n", a,b);

    tt = a;
    a = b;
    b = tt;

    printf("%d %d \n", a,b);

    return 0;
}