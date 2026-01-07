#include <stdio.h>
#include <stdlib.h>        // malloc을 사용하기 위한 표준 헤더
#include <malloc/malloc.h> // [macOS 전용] malloc_size 함수를 쓰기 위함

int main()
{
    int *parr1 = (int*)malloc(sizeof(int)*5);

    // macOS에서는 _msize 대신 malloc_size를 사용합니다.
    printf("Pointer Size: %lu, Heap Size: %lu\n", sizeof(parr1), malloc_size(parr1)); 

    for(int i=0; i < malloc_size(parr1)/sizeof(int); i++) {
        parr1[i] = i+1;
    }

    for(int i=0; i < malloc_size(parr1)/sizeof(int); i++) { 
        printf("%d ", parr1[i]);
    }
    
    free(parr1); // 메모리 해제
    return 0;
}