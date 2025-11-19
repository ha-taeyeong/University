#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int arr[10];
    int arrOdd[10];
    int arrEven[10];

    int oddCount = 0;
    int evenCount = 0;
    
    srand(time(NULL));
    
    for(int i=0; i<10; i++) {
        
        int random_value = (rand() % 10);
        arr[i] = random_value;
        if(random_value % 2 == 0) {
            arrEven[evenCount] = random_value;
            evenCount++;
        } else {
            arrOdd[oddCount] = random_value;
            oddCount++;
        }

    }
    for(int i=0; i<10; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    printf("arrEven: ");
    for(int i=0; i<evenCount; i++) {
        printf("%d ", arrEven[i]);
    }
    printf("\n");
    
    printf("arrOdd: ");
    for(int i=0; i<oddCount; i++) {
        printf("%d ", arrOdd[i]);
    }
    printf("\n");

    return 0;
}