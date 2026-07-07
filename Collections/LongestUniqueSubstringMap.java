import java.util.*;

public class LongestUniqueSubstringMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int left = 0;
        for( int right = 0;right < str.length();right++){
            char ch = str.charAt(right);
            if (hm.containsKey(ch)) {
                left = Math.max(left, hm.get(ch) + 1);
            }
            hm.put(ch,right);
            max = Math.max(max,right - left + 1);
        }
        System.out.println(max);
        sc.close();
    }
}
