#include<stdio.h>

int main() {
    int a = 0;
    int result = 0;
    scanf("%d", &a);
    if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
        result = 1;
        printf("%d\n", result);
    } else {
        result = 0;
        printf("%d\n", result);
    }
}