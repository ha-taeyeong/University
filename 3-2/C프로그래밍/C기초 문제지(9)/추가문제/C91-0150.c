#include <stdio.h>
#include <string.h>

#define MAX 100

typedef struct {
    char name[30];
    int age;
} Student;

Student findLongestName(Student arr[], int n) {
    int maxIdx = 0;
    for (int i = 1; i < n; i++) {
        if (strlen(arr[i].name) > strlen(arr[maxIdx].name)) {
            maxIdx = i;
        }
    }
    return arr[maxIdx];
}

int main() {
    Student students[MAX];
    int count = 0;

    while (count < MAX) {
        scanf("%s", students[count].name);
        if (strcmp(students[count].name, "xxx") == 0) {
            break;
        }
        scanf("%d", &students[count].age);
        count++;
    }

    if (count > 0) {
        Student longest = findLongestName(students, count);
        printf("Longest Name: %s\n", longest.name);
    }

    return 0;
}
