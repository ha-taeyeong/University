#include <stdio.h>

typedef struct {
    int x, y;
} Point;

int main() {
    Point p;
    int dx, dy;
    scanf("%d %d", &p.x, &p.y);
    scanf("%d %d", &dx, &dy);
    printf("New Position: (%d, %d)\n", p.x + dx, p.y + dy);
    return 0;
}
