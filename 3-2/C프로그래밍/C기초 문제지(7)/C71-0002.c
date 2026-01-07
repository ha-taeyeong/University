/*
두수를 입력받고, **공약수** 배열을 전달해주는 프로그램의 일부 cd() 함수를 완성하시오.

- 조건
    - 출력순서 주의
- 입출력 예
    - 입출력 결과와 똑같아야 합니다. (공백, 대소문자, 형식을 정확하게 맞춰주세요)
    - 입력 안내 메시지는 생략해주세요
*/
#include <stdio.h>

int cd(int v1, int v2, int result_arr[]) {
    int count = 0; // 공배수의 개수를 세는 변수

    // 두 수 중 더 작은 값을 찾음 (공약수는 작은 수보다 클 수 없으므로)
    int limit = (v1 < v2) ? v1 : v2;

    for (int i=limit; i >= 1; i--) {
        if (v1 % i == 0 && v2 % i == 0) {
            result_arr[count] = i; // 배열에 저장
            count++;               // 개수 증가
        }
    }

    return count;
}

int main()
{
    int v1 = 36;
    int v2 = 96;
    int st = 1; // 범위
    int end = 20; // 범위

    int arr[10]; // 공배수
    int arr_cnt;

    arr_cnt = cd(v1, v2, arr);

    for(int jj=0; jj<arr_cnt; jj++) {
        printf("%d ", arr[jj]);
    }
}
