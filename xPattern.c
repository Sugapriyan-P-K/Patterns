#include "patternHeader.h"

void drawPattern() {
    int n = getInput();
    int num = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ((i - j == 0) || (i + j == n - 1)) {
                printf("%d ", num++);
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
}
int main(void) {
    drawPattern();
}