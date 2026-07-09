import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeInSubarrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
        }

        for (int i = k; i <= n; i++) {
            if (!queue.isEmpty()) {
                System.out.print(arr[queue.peek()] + " ");
            } else {
                System.out.print("0 ");
            }

            if (i == n) break;

            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            if (arr[i] < 0) {
                queue.add(i);
            }
        }
        System.out.println();
        sc.close();
    }
}
