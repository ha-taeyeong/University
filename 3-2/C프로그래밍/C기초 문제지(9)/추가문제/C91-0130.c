#include <stdio.h>

typedef struct {
    double x, y;
} Point;

Point getMidpoint(Point a, Point b) {
    Point mid;
    mid.x = (a.x + b.x) / 2.0;
    mid.y = (a.y + b.y) / 2.0;
    return mid;
}

int main() {
    Point p1, p2;
    scanf("%lf %lf", &p1.x, &p1.y);
    scanf("%lf %lf", &p2.x, &p2.y);
    Point mid = getMidpoint(p1, p2);
    printf("Midpoint: (%.1f, %.1f)\n", mid.x, mid.y);
    return 0;
}
