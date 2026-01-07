#include <stdio.h>
#include <stdlib.h>

int main()
{
    char *pmenu[4] = {"1.Append List",
                    "2.Print List",
                    "3.Delete List",
                    "4.Exit"};
    // 1. 2중 포인터 변수 선언 (char* 배열의 주소를 담을 변수)
    char **ppmenu; 
    
    // 2. pmenu 배열의 주소를 ppmenu에 대입
    // 배열 이름 pmenu는 첫 번째 요소의 주소(char**)로 자동 형변환됨.
    ppmenu = pmenu;
    
    for(int i=0; i<4; i++){
        printf("%s \n",ppmenu[i]);        
    }       
}
