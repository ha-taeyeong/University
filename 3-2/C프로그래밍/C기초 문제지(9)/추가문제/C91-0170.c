#include <stdio.h>
#include <string.h>

typedef struct {
    char name[20];
    int kor, eng, math;
} Student;

// 함수 인수를 포인터로 받도록 수정 (Student 구조체 복사 방지)
double getAverage(const Student *s) {
    return (s->kor + s->eng + s->math) / 3.0;
}

// 함수 인수를 포인터로 받고, 반환형도 포인터로 유지
// 이제 반환되는 주소는 main 함수의 유효한 메모리를 가리킵니다.
const char* getTopStudent(const Student *a, const Student *b) {
    // 포인터이므로 -> 연산자 사용
    // getAverage 함수도 포인터를 받도록 수정해야 함
    return getAverage(a) >= getAverage(b) ? a->name : b->name;
}

int main() {
    Student s1, s2;
    scanf("%s %d %d %d", s1.name, &s1.kor, &s1.eng, &s1.math);
    scanf("%s %d %d %d", s2.name, &s2.kor, &s2.eng, &s2.math);
    
    // 함수를 호출할 때 주소( & )를 전달
    printf("Top: %s\n", getTopStudent(&s1, &s2)); 
    return 0;
}
