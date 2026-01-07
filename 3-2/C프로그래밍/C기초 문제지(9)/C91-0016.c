#include <stdio.h>

typedef struct {
    int hour;
    int minute;
} Time;

int toMinutes(Time t) {
    return t.hour * 60 + t.minute;
}

int main() {
    Time t1, t2;
    scanf("%d %d", &t1.hour, &t1.minute);
    scanf("%d %d", &t2.hour, &t2.minute);
    printf("Difference: %d minutes\n", toMinutes(t2) - toMinutes(t1));
    return 0;
}
