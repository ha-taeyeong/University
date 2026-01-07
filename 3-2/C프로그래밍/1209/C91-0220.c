/*
함수 movePoint() 를 작성하고, 프로그램을 완성하시오.
문제 조건
1.Point 구조체를 정의하고 x, y 좌표를 저장한다.
2.구조체 포인터를 인자로 받아 (dx, dy)만큼 이동시키는 movePoint() 함수를 작성하라.
3.변경된 좌표를 출력하라.
*/


#include <stdio.h>

typedef struct {
    int x, y;
} Point;


void movePoint(Point *p, int dx, int dy) {
    p->x = p->x + dx;
    p->y = p->y + dy;
}



int main() {
    Point p;
    int dx, dy;
    if (scanf("%d %d", &p.x, &p.y) !=2) {
        printf("입력 오류\n");
        return 1;
    };
    if (scanf("%d %d", &p.x, &p.y) !=2) {
        printf("입력 오류\n");
        return 1;
    };
    movePoint(&p, dx, dy);
    printf("New Position: (%d, %d)\n", p.x, p.y);
    return 0;
}
