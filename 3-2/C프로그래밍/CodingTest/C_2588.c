#include<stdio.h>

int main() {
    int a=0;
    int b=0;
    scanf("%d\n", &a);
    scanf("%d\n", &b);
    
    printf("%d\n", a * (b%10));
    printf("%d\n", a * ((b/10) % 10));
    printf("%d\n", a * (b/100));
    printf("%d\n", a * b);
    
    return 0;
}