import java.util.Scanner;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows m and columns n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter sorted matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();
        int left = 0;
        int right = m * n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = arr[mid / n][mid % n];

            if (midVal == target) {
                found = true;
                break;
            } else if (midVal > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
