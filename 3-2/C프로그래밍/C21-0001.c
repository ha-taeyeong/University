#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int arr[10];

    srand(time(NULL));

    for(int i=0; i<10; i++) {
        int random_value = rand() % 5 + 5;

        arr[i] = random_value;
    }

    printf("arr[5~9] = ");
    for (int i=0; i<10; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}