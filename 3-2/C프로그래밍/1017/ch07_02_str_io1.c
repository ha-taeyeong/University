#include <stdio.h>
#include <string.h> //strlen()

//자료형 data type
//문자열 다루기

//문제
// 다음 결과를 메모리 맵을 그려서 설명하시오.

int main()
{
    printf("-- step1 -- \n");
    char arr1[] = "Hello"; //문자열 저장
    printf("%s \n",arr1);   
    printf("%d \n",sizeof(arr1));
    printf("%d \n",strlen(arr1));

    printf("-- step2 -- \n");
    char arr2[] = {'H','e','l','l','o',0};
    printf("%s \n",arr2);   
    printf("%d \n",sizeof(arr2));
    printf("%d \n",strlen(arr2));

    printf("-- step3 -- \n");
    char arr3[] = {'H','e','l','l','o','\0'};
    printf("%s \n",arr3);   
    printf("%d \n",sizeof(arr3));
    printf("%d \n",strlen(arr3));
    
    printf("-- step4 -- \n");
    char arr4[10] = "Hello"; //문자열 저장
    printf("%s \n",arr4); 
    printf("%d \n",sizeof(arr4)); 
    printf("%d \n",strlen(arr4));

    printf("-- step5 -- \n");
    char *parr1 = "Hello"; //문자열 저장
    printf("%s \n",parr1); 
    printf("%d \n",sizeof(parr1)); 
    printf("%d \n",strlen(parr1));

    printf("-- step6 -- \n");
    char *parr2 = arr1; //배열의 시작 주소 저장
    printf("%s \n",parr2); 
    printf("%d \n",sizeof(parr2)); //포인터변수의 크기는 언제나 4byte
    printf("%d \n",strlen(parr2));
}