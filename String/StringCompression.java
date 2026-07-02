import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        
        String str = ""; 
        int count = 1;
        
        for (int i = 0; i < input.length() - 1; i++) {
            char ch = input.charAt(i);
            char ch1 = input.charAt(i + 1);
            
            if (ch == ch1) {
                count++;
            } else {
                str += "" + ch + count;
                count = 1;
            }
        }
        int len = input.length();
        str += "" + input.charAt(len - 1) + count;
        
        if (str.length() < input.length()) {
            System.out.print(str);
        } else {
            System.out.print(input);
        }
        sc.close();
    }
}
