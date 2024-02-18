#include "patternHeader.h"

void drawPattern() {
    int n = getInput();
    int inc = 1, num = (-1 * n) + 1;
    for (int i = 0; i < n; i++) {
        num += n;
        for (int j = 0; j < n; j++) {
            printf("%d ", num);
            num += inc;
        }
        inc *= -1;
        num += inc;
        printf("\n");
    }
}
int main(void) {
    drawPattern();
}