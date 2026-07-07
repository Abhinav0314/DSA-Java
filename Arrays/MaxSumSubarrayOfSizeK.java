import java.util.*;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        int k = sc.nextInt();
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        max = sum;
        int index = 0;
        for(int i = k;i<n;i++){
            sum += arr[i] - arr[i-k];
            if(sum > max){
                max = sum;
                index = i - k + 1;
            }
        }
        System.out.println(max);
        for(int i = index; i<index + k;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }   
}
