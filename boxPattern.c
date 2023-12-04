#include<stdio.h>

void drawPattern(int n) {
    int whole = n + (n - 1), m, upto;
    for (int i = 1; i < n + 1; i++) {
        m = n;
        for (int j = 0; j < i; j++) {
            printf("%d ", m);
            m--;
        }
        m++;
        upto = whole - i;
        for (int j = i; j < upto; j++) {
            printf("%d ", m);
        }
        if (upto < i) {
            upto = i;
            m++;
        }
        for (int j = upto; j < whole; j++) {
            printf("%d ", m);
            m++;
        }
        printf("\n");
    }
    for (int i = n - 1; i > 0; i--) {
        m = n;
        for (int j = 0; j < i; j++) {
            printf("%d ", m);
            m--;
        }
        m++;
        upto = whole - i;
        for (int j = i; j < upto; j++) {
            printf("%d ", m);
        }
        upto = upto > i ? upto : i;
        for (int j = upto; j < whole; j++) {
            printf("%d ", m);
            m++;
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