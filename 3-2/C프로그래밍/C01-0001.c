#include <stdio.h>
#include <math.h>

int main()
{
    double sum = 0.0;
    double avg = 0.0;
    double sum_of_sq_diff = 0.0; // (편차)^2의 합
    double var = 0.0;
    double std = 0;

    for(int i=1; i<=10; i++) {
        sum += i;    
    }

    avg = sum / 10;

    for (int i=1; i<=10; i++) {
        sum_of_sq_diff += pow(i - avg, 2);
    }

    var = sum_of_sq_diff / (10 - 1);

    std = sqrt(var);

    printf("sum : %.6f\n", sum);
    printf("avg : %.6f\n", avg);
    printf("var : %.6f\n", var);
    printf("std : %.6f\n", std);

    return 0;
}