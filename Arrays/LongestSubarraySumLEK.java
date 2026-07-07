import java.util.*;

public class LongestSubarraySumLEK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int maxCount = 0;
        for(int i = 0;i<n;i++){
            int sum = 0;
            int count = 0;
            for(int j = i;j<n;j++){
                sum += arr[j];
                count += 1;
                if(sum > k){
                    break;
                }
                if(maxCount < count && sum <= k){
                    maxCount = count;
                }
            }
        }
        System.out.print(maxCount);
        sc.close();
    }
}
