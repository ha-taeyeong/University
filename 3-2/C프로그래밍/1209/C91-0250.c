/*
1. Student 구조체를 정의하고 이름(name), 점수(score)를 저장한다.
2. 구조체는 typedef를 사용해 선언한다.
3. 최대 100명의 학생 정보를 입력받는다.
4. 마지막 줄에는 초기화할 학생의 순서 번호(0부터 시작) 가 주어진다.
5. 해당 학생의 정보를 "None"과 0으로 초기화한 후, 전체 학생 정보를 출력하라.
6.구조체 포인터를 이용해 초기화 함수 resetStudent()를 작성하라.*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h> // atoi 사용을 위해 포함

#define MAX 100

// 1, 2. Student 구조체 정의 및 typedef 선언
typedef struct {
    char name[20];
    int score;
} Student;

// 6. 구조체 포인터를 이용해 초기화 함수 resetStudent() 작성
// 5. 해당 학생의 정보를 "None"과 0으로 초기화
void resetStudent(Student *s) {
    if (s != NULL) {
        // 이름(name)을 "None"으로 초기화
        strcpy(s->name, "None"); 
        // 점수(score)를 0으로 초기화
        s->score = 0;
    }
}

int main() {
    Student students[MAX];
    int count = 0;

    // 학생 정보 입력
    while (count < MAX) {
        char name[20];
        int score;
        
        // 입력 받을 때 EOF 또는 입력 오류 시 종료
        if (scanf("%s", name) != 1) break; 
        
        // 숫자인지 확인하는 로직 (4번 문제 조건 처리)
        // 첫 번째 입력(name)이 숫자로만 구성되어 있는지 확인합니다.
        // 이는 초기화할 학생의 순서 번호(resetIndex)가 들어왔다고 판단하는 조건입니다.
        int is_number = 1;
        for (int i = 0; name[i] != '\0'; i++) {
            if (name[i] < '0' || name[i] > '9') {
                is_number = 0; // 숫자가 아닌 문자가 포함되어 있으면 이름으로 간주
                break;
            }
        }
        
        // 숫자가 오면 종료 (초기화 인덱스 입력으로 판단)
        if (is_number) { // <-- 이 부분이 누락된 조건입니다.
            int resetIndex = atoi(name); // 문자열을 정수로 변환
            
            // 유효한 인덱스인지 확인
            if (resetIndex >= 0 && resetIndex < count) {
                // resetStudent 함수 호출 (구조체 포인터 전달)
                resetStudent(&students[resetIndex]); 
            }
            break; // 초기화 인덱스를 받았으므로 입력 루프 종료
        }

        // 숫자가 아니면 학생의 이름으로 간주하고 점수(score)를 추가로 입력받음
        if (scanf("%d", &score) != 1) break;
        
        // 학생 정보 저장
        strcpy(students[count].name, name);
        students[count].score = score;
        count++;
    }

    // 5. 전체 출력
    printf("\n--- 전체 학생 정보 ---\n");
    for (int i = 0; i < count; i++) {
        printf("%s %d\n", students[i].name, students[i].score);
    }

    return 0;
}