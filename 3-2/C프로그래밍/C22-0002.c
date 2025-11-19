#include <stdio.h>

int main() {
    short s = 3;
    int i = 4;
    float f = 5.f;
    char c = 'A';
    short sarr[] = {'H','e','l','l','o'};
    printf("%d\n", sizeof(s));
    printf("%d\n", sizeof(i));
    printf("%d\n", sizeof(f));
    printf("%d\n", sizeof(5));
    printf("%d\n", sizeof(sarr));
    printf("%d\n", sizeof(sarr) / sizeof(sarr[0]));

    return 0;
}