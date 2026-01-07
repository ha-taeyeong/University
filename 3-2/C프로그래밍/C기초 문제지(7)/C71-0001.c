/*
범위값과 두수를 입력받고, **공배수** 배열을 전달해주는 프로그램의 일부 cm() 함수를 완성하시오.

- 조건
    - 출력순서 주의
- 입출력 예
    - 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
    - 입력 안내 메시지는 생략해주세요
*/
#include <stdio.h>

int cm(int n1, int n2, int st, int end, int result_arr[]) {
    int count = 0; // 공배수의 개수를 세는 변수

    for (int i= st; i<= end; i++) {
        if (i % n1 == 0 && i % n2 == 0) {
            result_arr[count] = i;
            count++;
        }
    }

    return count;
}

int main()
{
    int v1 = 2;
    int v2 = 3;
    int st = 1; // 범위
    int end = 20; // 범위

    int arr[10]; // 공배수
    int arr_cnt;

    arr_cnt = cm(v1, v2, st, end, arr);

    for(int jj=0; jj<arr_cnt; jj++) {
        printf("%d ", arr[jj]);
    }
}
