import java.util.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;

            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    start = l;
                    count += 1;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;

            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    start = l;
                    count += 1;
                }
                l--;
                r++;
            }
        }

        System.out.print(str.substring(start, start + max) + " " + count);
        sc.close();
    }
}
