// 포인터를 이용해 생성한 1차원 문자열
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *parr1 = "Hello World"; // IO 입력값으로 주어진 경우

    char arr1[1024];  // 배열이용 stack 메모리확보

    sprintf(arr1,"%s",parr1); //stack 메모리에 입력값을 복사해서 작업한다.

    for(int i=0; i<strlen(parr1+1); i++){
        if(arr1[i] == 'o'){                        
            arr1[i] = 'x'; //조작 불가 강제 실행 종료            
        }        
    }    
    
    for(int i=0; i<strlen(parr1); i++){
        printf("%c ",arr1[i]); 
    }
    
    printf("%s", arr1);
}