#include "patternHeader.h"

void drawPattern(int n) {
    int even = 2, odd = 1, row = 1, idx = 0;
    while (row <= n) {
        idx = 0;
        while (idx < row && row <= n) {
            printf("%d ", odd);
            odd += 2;
            idx++;
        }
        row++;
        idx = 0;
        printf("\n");
        while (idx < row && row <= n) {
            printf("%d ", even);
            idx++;
            even += 2;
        }
        row++;
        printf("\n");
    }
}

int main(void) {
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    drawPattern(n);
}