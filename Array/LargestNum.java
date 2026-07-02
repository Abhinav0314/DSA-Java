import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int s = Integer.parseInt(arr1[i] + "" + arr1[j]);
                if(s>max)
                    max = s;
            }
        }
        System.out.print(max);
        sc.close();
    }
}
