#include <stdio.h>

typedef struct {
    int width, height;
} Rectangle;

void resize(Rectangle* r) {
    r->width *= 2;
    r->height *= 2;
}

int main() {
    Rectangle r;
    scanf("%d %d", &r.width, &r.height);
    resize(&r);
    printf("Resized: %d x %d\n", r.width, r.height);
    return 0;
}
