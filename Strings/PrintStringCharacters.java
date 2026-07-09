import java.util.Scanner;

public class PrintStringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        int n = str.length();

        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
