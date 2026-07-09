import java.util.Scanner;

public class MaxConcatenatedPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int concatVal = arr[i] * 10 + arr[j];
                if (concatVal > max) {
                    max = concatVal;
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
