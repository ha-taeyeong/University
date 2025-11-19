#include <stdio.h>
#include <math.h>

int main()
{
    int r = 0;
    double result = 0;
    scanf("%d", &r);

    result = M_PI * pow((double)r, 2);

    printf("%.2f\n", result);
    return 0;

}