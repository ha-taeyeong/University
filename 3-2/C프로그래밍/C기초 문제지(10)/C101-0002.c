//2차원 배열 크기 계산
#include <stdio.h>
int main()
{
    int arr[][5] = {{1,2,3,4,5},{6,7,8,9,10}}; //2차원 배열

    // 전체 배열의 크기(총 바이트 수)를 구합니다.
    int total_size = sizeof(arr); 

    // 배열 한 행의 크기(바이트 수)를 구합니다.
    // arr[0]은 첫 번째 행 전체를 나타냅니다.
    int row_size = sizeof(arr[0]); 

    // 배열 한 요소(int)의 크기(바이트 수)를 구합니다.
    int element_size = sizeof(arr[0][0]); // 또는 sizeof(int)

    // 1. 행(row) 개수 계산: 전체 크기 / 한 행의 크기
    int row = total_size / row_size; 

    // 2. 열(col) 개수 계산: 한 행의 크기 / 요소 하나의 크기 (또는 이미 정의된 5 사용)
    int col = row_size / element_size;

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }    
}
