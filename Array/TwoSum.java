import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int size = n / 2;
        for(int i =0;i<size;i++){
            System.out.print(arr[i] + arr[i + size] + " ");
            if((arr[i] + arr[i + size]) > max){
                max = arr[i] + arr[i + size];
            }
        }
        System.out.println();
        System.out.println(max);
        sc.close();
    }
}