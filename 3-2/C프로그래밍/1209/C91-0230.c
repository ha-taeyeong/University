/*
함수 resize() 를 작성하고, 프로그램을 완성하시오.

문제 조건
1.Rectangle 구조체를 정의하고 width, height를 저장한다.
2.구조체 포인터를 인자로 받아 너비와 높이를 2배로 만드는 resize() 함수를 작성하라.
3.결과는 원래 값의 2배가 된다.
*/


#include <stdio.h>

typedef struct {
    int width, height;
} Rectangle;

void resize(Rectangle *r){
    r->width = r->width * 2;
    r->height = r->height * 2;
}



int main() {
    Rectangle r;

    resize(&r);
    printf("Resized: %d x %d\n", r.width, r.height);
    return 0;
}
