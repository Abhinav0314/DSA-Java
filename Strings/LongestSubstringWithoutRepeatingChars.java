import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();

        String max = "";

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (current.contains(String.valueOf(ch))) {
                    break;
                }

                current += ch;

                if (current.length() > max.length()) {
                    max = current;
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
