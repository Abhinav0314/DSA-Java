import java.util.Scanner;
public class DualArraySumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i= i+ 2){
            System.out.print(arr1[i] + arr2[i+1] + " ");
            System.out.print(arr1[i+1] + arr2[i] + " ");
        }
        sc.close();
    }
}
