import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        for (int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i -1) ){
                System.out.print("Not Pallindrome");
                sc.close();
                return;
            }
        }
        System.out.print("Pallindrome");
        sc.close();
    }
}
