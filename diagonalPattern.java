import java.util.Scanner;

public class diagonalPattern {
    static void drawPattern(int n) {
        int temp = 1, inc = 2, num = 1;
        for (int i = 1; i < n + 1; i++) {
            inc = i + 1;
            int j = 1;
            while (j <= n && inc <= n) {
                System.out.print(num + " ");
                num += inc;
                inc++;
                j++;
            }
            while (j <= n && inc > 0) {
                System.out.print(num + " ");
                inc--;
                num += inc;
                j++;
            }
            num = temp + i;
            temp = num;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        drawPattern(n);
        scan.close();
    }
}