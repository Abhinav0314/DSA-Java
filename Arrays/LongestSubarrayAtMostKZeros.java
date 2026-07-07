import java.util.*;

public class LongestSubarrayAtMostKZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int left = 0;
        int zc = 0;
        for(int right = 0; right < n; right++){
            if(arr[right] == 0){
                zc++;
            }
            if(zc > k){
                if(arr[left] == 0){
                    zc--;
                }
                left++;
            }
        }
        System.out.print(n - left);
        sc.close();
    }
}
