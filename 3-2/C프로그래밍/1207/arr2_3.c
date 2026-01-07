#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *parr1 = (int*)malloc(sizeof(int)*5);

    for(int i=0; i<sizeof(parr1)/sizeof(int); i++){ // 크기 오류
        parr1[i] = i+1;
    }

    for(int i=0; i<sizeof(parr1)/sizeof(int); i++) { // 크기 오류
        printf("%d ", parr1[i]);
    }
}