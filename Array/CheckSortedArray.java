import java.util.Scanner;
public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        boolean temp = false;
        for(int i = 0;i<n-1;i++){
            if(arr1[i]>arr1[i+1]){
                temp = true;
                break;
            }
        }
        if(temp){
            System.out.print("Unsorted");
        }
        else{
            System.out.print("Sorted");
        }
        sc.close();
    }
}
