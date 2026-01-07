#include <stdio.h>

typedef struct {
    char name[30];
    double price;
    int discount;
} Product;

void applyDiscount(Product* p) {
    p->price = p->price * (100 - p->discount) / 100.0;
}

int main() {
    Product p;
    scanf("%s %lf %d", p.name, &p.price, &p.discount);
    applyDiscount(&p);
    printf("%s: %.1f\n", p.name, p.price);
    return 0;
}
