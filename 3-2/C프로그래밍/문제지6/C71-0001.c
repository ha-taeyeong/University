#include<stdio.h>

int cm(int v1, int v2, int st, int end, int arr[]) {
    int arr_idx = 0; // arr 배열에 값을 넣을 때 사용할 인덱스

    // st부터 end까지 반복하며 공배수를 찾습니다.
    for(int i = st; i <= end; i++) {
        
        // i가 v1과 v2 모두로 나누어떨어지면 공배수입니다.
        if(i % v1 == 0 && i % v2 == 0) {
            
            // 배열 크기(10)를 초과하지 않는지 확인 (방어적 코드)
            if (arr_idx < 10) { 
                arr[arr_idx] = i; // 공배수를 배열에 저장
                arr_idx++;       // 인덱스 증가
            } else {
                break; // 배열이 가득 차면 루프 종료
            }
        }
    }
    
    // 최종적으로 배열에 저장된 요소의 개수를 반환
    return arr_idx; 
}

void main()
{
    int v1 = 2;
    int v2 = 3;    
    int st = 1; //범위
    int end = 20; //범위

    int arr[10]; //공배수
    int arr_cnt;

    arr_cnt = cm(v1,v2,st,end,arr);        

    for(int jj=0; jj<arr_cnt; jj++){
        printf("%d ",arr[jj]);
    }
}