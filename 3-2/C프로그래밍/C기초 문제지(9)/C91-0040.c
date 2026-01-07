#include <stdio.h>

typedef struct {
    char name[30];
    int price;
    int discount;
} Product;

int main() {
    Product p;
    scanf("%s %d %d", p.name, &p.price, &p.discount);
    double result = p.price * (100 - p.discount) / 100.0;
    printf("Discounted Price: %.1f\n", result);
    return 0;
}
