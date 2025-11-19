#include <stdio.h>

int main() {
    char op;
    int in1, in2;
    scanf("%d %c %d", &in1, &op, &in2);
    switch(op) {
        case '+': printf("%d + %d = %d\n", in1, in2, in1+in2);
        break;
        case '-': printf("%d - %d = %d\n", in1, in2, in1-in2);
        break;
        case '*': printf("%d * %d = %d\n", in1, in2, in1*in2);
        break;
        case '/': printf("%d / %d = %d\n", in1, in2, in1/in2);
        break;
    }
    return 0;
}
