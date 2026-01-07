#include <stdio.h>

typedef struct {
    int a, b;
} Pair;

int getMax(Pair p) {
    return p.a > p.b ? p.a : p.b;
}

int main() {
    Pair p;
    scanf("%d %d", &p.a, &p.b);
    printf("Max: %d\n", getMax(p));
    return 0;
}
