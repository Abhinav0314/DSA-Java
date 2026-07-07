import java.util.*;

public class LongestNiceSubstringSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        String res1 = "", res = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1;j<=str.length();j++){
                res = str.substring(i,j);
                if(isNice(res)){
                    if(res.length() > max){
                        max = res.length();
                        res1 = res;
                    }
                }
            }
        }
        System.out.print(res1);
        sc.close();
    }
    static boolean isNice(String str){
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            hs.add(ch);
        }
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                if(!hs.contains(Character.toLowerCase(ch))){
                    return false;
                }
            }
            else{
                if(!hs.contains(Character.toUpperCase(ch))){
                    return false;
                }
            }
        }
        return true;
    }
}
