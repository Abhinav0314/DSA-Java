import java.util.Scanner;

public class KokoEatingBananasCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of piles:");
        int n = sc.nextInt();
        System.out.println("Enter eating speed k:");
        int k = sc.nextInt();
        System.out.println("Enter allowed hours h:");
        int h = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter bananas in each pile:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalHours = 0;
        for (int i = 0; i < n; i++) {
            totalHours += (arr[i] + k - 1) / k;
        }

        if (totalHours <= h) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
