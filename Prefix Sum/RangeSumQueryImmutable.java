import java.util.*;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] p = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            p[i + 1] = p[i] + arr[i];
        }

        int t = sc.nextInt();

        while (t > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.print(p[r + 1] - p[l] + " ");
            t--;
        }
    }
}
