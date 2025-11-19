#include <stdio.h>

int main()
{
    int arr[10] = {6, 3};
    printf("before :");
    for(int i=0; i<2; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n");
    
    int temp = 0;
    temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;

    printf("after :");
    for (int i=0; i<2; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}