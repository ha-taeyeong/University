#include <stdio.h>

typedef struct {
    char name[20];
    int age;
} Person;

void sort(Person arr[], int n) {
    for (int i = 0; i < n-1; i++)
        for (int j = i+1; j < n; j++)
            if (arr[i].age > arr[j].age) {
                Person tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
}

int main() {
    Person p[3];
    for (int i = 0; i < 3; i++) scanf("%s %d", p[i].name, &p[i].age);
    sort(p, 3);
    for (int i = 0; i < 3; i++) printf("%s %d\n", p[i].name, p[i].age);
    return 0;
}
