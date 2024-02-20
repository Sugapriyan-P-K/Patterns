import java.util.*;

public class pattern {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + (n - 2 * i); j++) {
                System.out.print(" ");
            }
            int k = i + 1;
            for (; k > 1; k--) {
                System.out.print(k + " ");
            }
            for (; k <= i + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        try {
            n = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        printPattern(n);
        scan.close();
    }
}