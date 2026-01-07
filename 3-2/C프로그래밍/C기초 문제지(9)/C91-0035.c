#include <stdio.h>

typedef struct {
    char subject[20];
    int score;
} Score;

int main() {
    Score s[3];
    for (int i = 0; i < 3; i++) scanf("%s %d", s[i].subject, &s[i].score);

    int max = 0;
    for (int i = 1; i < 3; i++)
        if (s[i].score > s[max].score)
            max = i;

    printf("%s %d\n", s[max].subject, s[max].score);
    return 0;
}
