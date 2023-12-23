#include<stdio.h>

void drawPattern(int n) {
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
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    drawPattern(n);
}