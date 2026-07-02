import java.util.Scanner;

public class AlphabetPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' '){
                System.out.print(ch - 96 + " ");
            }
        }
        sc.close();
    }
}