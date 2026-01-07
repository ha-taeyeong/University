#include <stdio.h>
#include <stdlib.h> // malloc()

int main()
{
    int *parr1 = (int*)malloc(sizeof(int)*5);

    for(int i=0; i<5; i++) {
        parr1[i] = i+1;
    }

    for(int i=0; i<5; i++) {
        printf("%d ", parr1[i]);
    }
    free(parr1);
    for(int i=0; i<5; i++) {
        printf("\n %d " ,parr1[i]);
    }
}