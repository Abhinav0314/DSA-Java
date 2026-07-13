import java.util.*;

public class RemoveStarsFromStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        if (str.length() > 0 && str.charAt(0) != '*') {
            arr[0] = str.charAt(0);
        }
        int j = 1;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '*') {
                arr[j] = ch;
                j++;
            } else if (j > 0) {
                j--;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]);
        }
    }
}
