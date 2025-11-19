#include <stdio.h>

int main() {
    char a=3, b=6;
    printf("%d %d\n", a>>1, b>>1);
    printf("%d %d\n", a<<1, b<<1);
    printf("%d %d\n", a&1, a&b);
    printf("%d %d\n", a&&1, a&&b);
    printf("%d %d\n", ~a, !a);
}