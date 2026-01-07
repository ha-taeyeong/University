#include <stdio.h>

typedef struct {
    int width, height;
} Rectangle;

int main() {
    Rectangle r;
    scanf("%d %d", &r.width, &r.height);
    printf("Area: %d\n", r.width * r.height);
    return 0;
}

