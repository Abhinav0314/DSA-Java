import java.util.*;

public class RangeSumQueryMutablePrefixSum {
    int[] p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RangeSumQueryMutablePrefixSum obj = new RangeSumQueryMutablePrefixSum();

        int n = sc.nextInt();
        int[] arr = new int[n];
        obj.p = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            obj.p[i + 1] = obj.p[i] + arr[i];
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.print("1 - SumRange");
            System.out.print("2 - Query Solver");
            switch (x) {
                case 1:
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(obj.sumRange(left, right));
                    break;

                case 2:
                    int idx = sc.nextInt();
                    int value = sc.nextInt();
                    obj.querySolver(idx, value);
                    break;
            }
        }
    }

    public int sumRange(int left, int right) {
        return p[right + 1] - p[left];
    }

    public void querySolver(int idx, int value) {
        for (int i = idx + 1; i < p.length; i++) {
            p[i] += value;
        }
    }
}
