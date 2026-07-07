import java.util.Scanner;

public class ValidatePassword
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        isValidPass(pass);
        sc.close();
    }
    
    static void isValidPass(String c){
        if (c.length() < 8){
            System.out.println("Password is less than 8 characters");
            return;
        }
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i); 
            
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("@#$%&".indexOf(ch) >= 0) {
                hasSpecial = true;
            }
        }
        
        if (!hasUpper) System.out.println("Missing an uppercase letter.");
        if (!hasLower) System.out.println("Missing a lowercase letter.");
        if (!hasDigit) System.out.println("Missing a number.");
        if (!hasSpecial) System.out.println("Missing a special character.");
        
        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password is strong and valid!");
        }
    }
}
