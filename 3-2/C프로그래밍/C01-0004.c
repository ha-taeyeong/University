#include <stdio.h>
#include <math.h>

int main()
{
    int r = 0;
    int h = 0;
    double result = 0.0;

    scanf("%d %d", &r, &h);
    double base_area = 2 * M_PI * r * r; // 밑 넓이 * 2
    double side_area = 2 * M_PI * r * h; // 옆 넓이
    result = base_area + side_area;

    printf("%.2f\n", result);

    return 0;
}