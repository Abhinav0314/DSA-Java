import java.util.*;

public class PalindromeSubstringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        String res1 = "", res = "";
        boolean ispallin = false;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1;j<=str.length();j++){
                res = str.substring(i,j);
                if(isPallindrome(res)){
                    if(res.length() > max){
                        max = res.length();
                        res1 = res;
                        ispallin = true;
                    }
                }
            }
        }
        if(ispallin){
            System.out.print("Pallindrome");
        }
        else{
            System.out.print("Not Pallindrome");
        }
        sc.close();
    }
    static boolean isPallindrome(String str){
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
}
