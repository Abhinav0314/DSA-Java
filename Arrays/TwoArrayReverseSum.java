import java.util.Scanner;

public class TwoArrayReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int idx2 = n;
        for (int i = 0; i < n; i++) {
            System.out.print((arr1[i] + arr2[idx2 - 1]) + " ");
            idx2--;
        }
        System.out.println();
        sc.close();
    }
}
