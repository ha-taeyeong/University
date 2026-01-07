#include <stdio.h>

typedef struct {
    int width;
    int height;
} Rectangle;

int getArea(Rectangle r) {
    return r.width * r.height;
}

int main() {
    Rectangle r;
    scanf("%d %d", &r.width, &r.height);
    printf("Area: %d\n", getArea(r));
    return 0;
}
