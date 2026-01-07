#include <stdio.h>

void minmax(int arr[], int size, int *min_ptr, int *max_ptr)
{
    *min_ptr = arr[0];
    *max_ptr = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] < *min_ptr) {
            *min_ptr = arr[i];
        }
        if (arr[i] > *max_ptr) {
            *max_ptr = arr[i];
        }
    }
}
void io_main()
{
    int arr[10];
    int arr_cnt;;

    int min = 100;
    int max = 0;

    printf("숫자 5개를 입력해주세요 ? ");  //6 8 5 2 9
    for(int i=0; i<5; i++)
    {
		if (scanf("%d", &arr[i]) != 1) {
            printf("\n입력 오류가 발생했습니다.\n");
            return;
        }
    }
    printf("입력된 숫자 : ");
    for(int i=0; i<5; i++)
        printf("%d ",arr[i]);
    printf("\n");

    minmax(arr, 5, &min, &max);

    printf("min :%d  max : %d \n", min, max);
}
int main()
{
    io_main();
}
