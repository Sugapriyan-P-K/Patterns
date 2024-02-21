#include "patternHeader.h"


void method2() {
    int n = getInput();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n + (n - 2 * i); j++) {
            printf(" ");
        }
        for (int l = i; l > 0; l--) {
            printf("%d ", l);
        }
        for (int k = 0; k <= i; k++) {
            printf("%d ", k);
        }
        printf("\n");
    }
}
void drawPattern() {
    int n = getInput();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n + (n - 2 * i); j++) {
            printf(" ");
        }
        int k = i + 1;
        for (; k > 1; k--) {
            printf("%d ", k);
        }
        for (; k <= i + 1; k++) {
            printf("%d ", k);
        }
        printf("\n");
    }
}

int main(void) {
    drawPattern();
    method2();
}