#include <stdio.h>
#include <string.h>

typedef struct {
    char name[30];
    int age;
} Student;

Student findLongestName(Student s[], int n) {
    int max = 0;
    for (int i = 1; i < n; i++) {
        if (strlen(s[i].name) > strlen(s[max].name))
            max = i;
    }
    return s[max];
}

int main() {
    Student s[3];
    for (int i = 0; i < 3; i++) {
        scanf("%s %d", s[i].name, &s[i].age);
    }
    Student result = findLongestName(s, 3);
    printf("Longest Name: %s\n", result.name);
    return 0;
}
