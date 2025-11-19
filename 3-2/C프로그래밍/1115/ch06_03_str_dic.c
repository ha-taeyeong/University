#include <stdio.h>
#include <string.h> //strlen()

char dic[10] = {'\0'}; //NULL
char dic_cnt = 0;    

int find_dic(char x_ch){
    for(int j=0; j<dic_cnt; j++)
    {
        if(dic[j] == x_ch)
            return j+1; //딕셔너리 내 위치 발견 (사용 x)
    }
    return 0; //없음
}

void stack_dic(char x_ch){
    dic[dic_cnt] = x_ch;
    dic_cnt++;
}


void print_dic(){
    for(int i=0; i<dic_cnt; i++)
    {
        printf("%c",dic[i]);               

        if(i==dic_cnt-2)
        {
            printf("\n");
            break;
        }
        else
            printf(",");                   
    }
}

void sub_main(){
    char str[1024];

    // printf("공백 문자가 포함된 문자열을 입력하시오 ? ");
    // fgets(str,sizeof(str),stdin);   
    //Step1     매번문자열 입력이 번거롭다.
    sprintf(str,"%s","Hello World 1212");
    printf("%s %d \n",str,strlen(str));

    //Step2
    for(int i=0; i<strlen(str); i++)
    {
        if(find_dic(str[i]) == 0) 
            stack_dic(str[i]); 
    }   

    print_dic();  
}
void loop_main(){
    char str[1024];

    while(1)
    {
        dic_cnt = 0;
        printf("공백 문자가 포함된 문자열을 입력하시오 ? ");
        fgets(str,sizeof(str),stdin);   
        //Step1     매번문자열 입력이 번거롭다.
        //sprintf(str,"%s","Hello World 1212");
        //printf("%s %d \n",str,strlen(str));

        //Step2
        for(int i=0; i<strlen(str); i++)
        {
            if(find_dic(str[i]) == 0) 
                stack_dic(str[i]); 
        }   

        print_dic();    
    }
}

int main() {  //Entry Point (진입점)
    sub_main(); //단일 문자열 입력
    //loop_main(); //연속 문자열 입력
}