#include <stdio.h>

int main ()
{
    int a = 0;
    int b = 0;
    int sum = 0;
    int sub = 0;

    scanf("%d %d", &a, &b);

    sum = a+b;
    sub = a-b;

    printf("%d, %d\n", sum, sub);

    return 0;
}