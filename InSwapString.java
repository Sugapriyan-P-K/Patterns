import java.util.Scanner;

public class InSwapString {
    static void pattern(String s, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(s.charAt(j));
            }
            for (int k = 0; k < i; k++) {
                System.out.print(s.charAt(k));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        pattern(s, s.length());
        scan.close();
    }
}