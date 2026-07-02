import java.util.Scanner;

public class CaesarCipherDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int key = sc.nextInt();
        key = key % 26;
    
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' '){
                int num = ch - key;
                if(num < 97){
                    num = 122 - (96 - num);
                }
                char decoded = (char) num;
                System.out.print(decoded);
            }
            else{
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
