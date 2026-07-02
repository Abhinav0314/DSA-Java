import java.util.Scanner;

public class StrongPasswordMinChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        int hasUpper = 0;
        int hasLower = 0;
        int hasDigit = 0;
        int hasSpecial = 0;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = 1;
            } else if (Character.isLowerCase(ch)) {
                hasLower = 1;
            } else if (Character.isDigit(ch)) {
                hasDigit = 1;
            } else {
                hasSpecial = 1;
            }
        }

        int miss = 4 - (hasUpper + hasLower + hasDigit + hasSpecial);
        System.out.print(Math.max(miss, 8 - pass.length()));
        sc.close();
    }
}
