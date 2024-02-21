import java.util.*;

public class pattern {
    public static void anotherMethod(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + (n - 2 * i); j++) {
                System.out.print(" ");
            }
            for (int l = i; l > 0; l--) {
                System.out.print(l + " ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

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
        anotherMethod(n); // from start of 0
        scan.close();
    }
}