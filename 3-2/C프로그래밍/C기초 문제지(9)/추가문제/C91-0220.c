#include <stdio.h>

typedef struct {
    int x, y;
} Point;

void movePoint(Point* p, int dx, int dy) {
    p->x += dx;
    p->y += dy;
}

int main() {
    Point p;
    int dx, dy;
    scanf("%d %d", &p.x, &p.y);
    scanf("%d %d", &dx, &dy);
    movePoint(&p, dx, dy);
    printf("New Position: (%d, %d)\n", p.x, p.y);
    return 0;
}
