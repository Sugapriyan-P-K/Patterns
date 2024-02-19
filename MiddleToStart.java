import java.util.Scanner;

public class MiddleToStart {
    static void drawPattern(String string, int length) {
        String str = "";
        for (int i = length / 2; i < length; i++) {
            str += string.charAt(i);
        }
        for (int i = 0; i < length / 2; i++) {
            str += string.charAt(i);
        }
        string = str;
        for (int row = 1; row <= length; row++) {
            for (int space = 0; space < length - row; space++) {
                System.out.print("  ");
            }
            for (int column = 0; column < row; column++) {
                System.out.print(string.charAt(column) + " ");
            }
            System.out.println();
        }
    }

    static void method2(String string, int length) {
        int mid = length / 2;
        for (int row = 1; row <= length; row++) {
            int column = mid, idx = 0, idx2 = 0;
            for (int space = 0; space < length - row; space++) {
                System.out.print("  ");
            }
            while (column < length && idx < row) {
                System.out.print(string.charAt(column) + " ");
                column++;
                idx++;
            }
            while (column == length && idx < row) {
                System.out.print(string.charAt(idx2) + " ");
                idx++;
                idx2++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        int length = inputString.length();
        drawPattern(inputString, length);
        method2(inputString, length);
        scan.close();
    }
}