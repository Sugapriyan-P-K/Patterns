#include <stdio.h>

void drawPattern(int n) {
    int temp = 1, inc = 2, num = 1;
    for (int i = 1; i < n + 1; i++) {
        inc = i + 1;
        int j = 1;
        while (j <= n && inc <= n) {
            printf("%d ", num);
            num += inc;
            inc++;
            j++;
        }
        while (j <= n && inc > 0) {
            printf("%d ", num);
            inc--;
            num += inc;
            j++;
        }
        num = temp + i;
        temp = num;
        printf("\n");
    }
}
int main(void) {
    int n;
    printf("Enter the number : ");
    scanf("%d", &n);
    drawPattern(n);
}