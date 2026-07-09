import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCowsDistanceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stalls/positions:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter stall coordinates:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of cows/balls m:");
        int m = sc.nextInt();
        System.out.println("Enter minimum required distance:");
        int minDist = sc.nextInt();

        Arrays.sort(arr);

        int count = 1;
        int lastPos = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPos >= minDist) {
                count++;
                lastPos = arr[i];
            }
        }

        if (count >= m) {
            System.out.println("Possible");
        } else {
            System.out.println("Not Possible");
        }
        sc.close();
    }
}
