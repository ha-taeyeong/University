#include <stdio.h>

typedef struct {
    char name[20];
    int age;
} Student;

void increaseAge(Student* s) {
    s->age += 1;
}

int main() {
    Student s;
    scanf("%s %d", s.name, &s.age);
    increaseAge(&s);
    printf("%s %d\n", s.name, s.age);
    return 0;
}
