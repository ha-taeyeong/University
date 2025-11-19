#include <stdio.h>

int main()
{
    char op;
    int in1, in2;
    int result = 0;

    scanf("%d %c %d", &in1, &op, &in2);

    switch(op){
        case '+':
            result = in1 + in2;
            printf("%d %c %d = %d\n", in1, op, in2, result);
            break;

        case '-':
            result = in1 - in2;
            printf("%d %c %d = %d\n", in1, op, in2, result);
            break;
            
        case '*':
            result = in1 * in2;
            printf("%d %c %d = %d\n", in1, op, in2, result);
            break;
            
        case '/':
            result = in1 / in2;
            printf("%d %c %d = %d\n", in1, op, in2, result);
            break;
            
    }
    return 0;
}