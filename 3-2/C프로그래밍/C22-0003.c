#include <stdio.h>
int main() {
    char arr[] = "Hello";
    arr[2] = '0';
    arr[3] = '\0';
    arr[4] = '0';
    printf("%s", arr);

    return 0;
}