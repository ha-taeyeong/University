/*
함수 applyDiscount() 를 작성하고, 프로그램을 완성하시오.
문제 조건
1.Product 구조체를 정의하고 이름(name), 가격(price), 할인율(discount, %)을 저장한다.
2.구조체 포인터를 인자로 받아 할인율을 적용해 price를 수정하는 applyDiscount() 함수를 작성하라.
3.할인된 가격은 소수 첫째 자리까지 출력하라.
*/

#include <stdio.h>

// 1. Product 구조체 정의 (이미 제공됨)
typedef struct {
    char name[30];
    double price;
    int discount; // 할인율 (%)
} Product;

/**
 * 2. applyDiscount() 함수 정의
 * Product 구조체 포인터를 인자로 받아 할인율을 적용하여 price를 수정합니다.
 * @param p Product 구조체에 대한 포인터
 */
void applyDiscount(Product *p) {
    // 할인 금액 계산: 원래 가격 * (할인율 / 100.0)
    // 할인율(p->discount)은 정수이므로, 정확한 계산을 위해 100.0으로 나누어 double형으로 변환합니다.
    double discountAmount = p->price * ((double)p->discount / 100.0);
    
    // 할인된 가격으로 price 수정
    p->price = p->price - discountAmount;
    
    // 포인터를 사용하여 구조체 멤버를 수정했기 때문에 main 함수 내의 p 변수의 price가 변경됩니다.
    // 참고: p->price -= p->price * (p->discount / 100.0); 와 같이 한 줄로도 가능합니다.
}


int main() {
    Product p;
    // 사용자로부터 상품 이름, 가격, 할인율을 입력받습니다.
    // 예시 입력: Laptop 1200.0 10
    scanf("%s %lf %d", p.name, &p.price, &p.discount);
    
    // applyDiscount 함수 호출: 구조체 변수의 주소(&p)를 전달합니다.
    applyDiscount(&p);
    
    // 3. 할인된 가격을 소수 첫째 자리까지 출력합니다.
    printf("%s: %.1f\n", p.name, p.price);
    
    return 0;
}