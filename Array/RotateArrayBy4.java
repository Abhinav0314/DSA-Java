import java.util.Scanner;
public class RotateArrayBy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int rotations = 4;
        for(int j = 0;j<rotations;j++){
            int temp = arr1[n-1];
            for(int i = n-1;i>0;i--){
               
                arr1[i] = arr1[i-1];
            }
            arr1[0] = temp;
        }
        for(int num:arr1){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
