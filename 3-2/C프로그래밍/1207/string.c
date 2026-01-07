#include <stdio.h>

int main() {
    char arr1[] = "Hello World";
    for(int i=0; i<10; i++) {
        printf("%c ", arr1[i]);
    }
    printf("%s", arr1);
}