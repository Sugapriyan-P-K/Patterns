public class countAndSay {
    public static String CountAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countIdx(s);
        }
        return s;
    }

    public static String countIdx(String s) {
        String str = "";
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                str += (char) (count + '0');
                str += c;
                c = s.charAt(i);
                count = 1;
            }
        }
        str += (char) (count + '0');
        str += c;
        return str;
    }

    public static void main(String[] args) {
        System.out.println(CountAndSay(5));
        // one of the leetcode problen -> https://leetcode.com/problems/count-and-say/
    }
}
