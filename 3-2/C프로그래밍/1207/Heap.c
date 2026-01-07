#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *parr1 = (char*)malloc(sizeof(char)*20); // 집을 짓고 집 주소형을 리턴한다.

    char arr1[] = "Hello World";
    for(int i=0; i<strlen(arr1); i++) {
        parr1[i] = arr1[i];
    }

    for(int i=0; i<strlen(arr1); i++) {
        printf("%c ", parr1[i]);
    }
}