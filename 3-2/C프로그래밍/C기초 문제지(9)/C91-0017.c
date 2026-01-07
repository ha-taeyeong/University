#include <stdio.h>

typedef struct {
    char name[20];
    int kor, eng, math;
} Student;

int main() {
    Student s;
    scanf("%s %d %d %d", s.name, &s.kor, &s.eng, &s.math);
    double avg = (s.kor + s.eng + s.math) / 3.0;
    printf("Average: %.2f\n", avg);
    return 0;
}
