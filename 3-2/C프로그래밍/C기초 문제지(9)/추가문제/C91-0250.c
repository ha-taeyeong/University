#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX 100

typedef struct {
    char name[20];
    int score;
} Student;

void resetStudent(Student* s) {
    strcpy(s->name, "None");
    s->score = 0;
}

int main() {
    Student students[MAX];
    int count = 0;

    // 학생 정보 입력
    while (count < MAX) {
        char name[20];
        int score;
        if (scanf("%s", name) != 1) break;

        // 숫자가 오면 종료 (초기화 인덱스 입력으로 판단)
        if (name[0] >= '0' && name[0] <= '9') {
            int resetIndex = atoi(name);
            if (resetIndex >= 0 && resetIndex < count) {
                resetStudent(&students[resetIndex]);
            }
            break;
        }

        scanf("%d", &score);
        strcpy(students[count].name, name);
        students[count].score = score;
        count++;
    }

    // 전체 출력
    for (int i = 0; i < count; i++) {
        printf("%s %d\n", students[i].name, students[i].score);
    }

    return 0;
}

