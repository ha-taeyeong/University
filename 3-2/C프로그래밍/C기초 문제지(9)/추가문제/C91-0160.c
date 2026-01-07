#include <stdio.h>
#include <string.h>

#define MAX 100

typedef struct {
    char name[30];
    int age;
} Student;

void sortByName(Student arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (strcmp(arr[i].name, arr[j].name) > 0) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

void sortByAge(Student arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i].age > arr[j].age) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main() {
    Student students[MAX];
    int count = 0;

    // 입력 받기
    while (count < MAX) {
        scanf("%s", students[count].name);
        if (strcmp(students[count].name, "xxx") == 0) break;
        scanf("%d", &students[count].age);
        count++;
    }

    // 정렬 기준 입력
    char criterion[10];
    scanf("%s", criterion);

    if (strcmp(criterion, "name") == 0) {
        sortByName(students, count);
    } else if (strcmp(criterion, "age") == 0) {
        sortByAge(students, count);
    }

    // 출력
    for (int i = 0; i < count; i++) {
        printf("%s %d\n", students[i].name, students[i].age);
    }

    return 0;
}
