#include <stdio.h>
typedef struct {
    char name[20];
    int age;
    int id;
} Student;

int main() {
    Student s;
    scanf("%s %d %d", s.name, &s.age, &s.id);
    printf("Name: %s\nAge: %d\nID: %d\n", s.name, s.age, s.id);
    return 0;
}
