#include <stdio.h>

typedef struct {
    char title[30];
    char author[30];
    int price;
} Book;

int main() {
    Book b;
    scanf("%s %s %d", b.title, b.author, &b.price);
    printf("Title: %s\nAuthor: %s\nPrice: %d\n", b.title, b.author, b.price);
    return 0;
}
