import java.util.*;

public class BinaryIndexedTree {
    int[] bit;
    int n;

    public void build(int idx, int value) {
        idx++;
        while (idx <= n) {
            bit[idx] += value;
            idx += idx & -idx;
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefixSum(right);
        return prefixSum(right) - prefixSum(left - 1);
    }

    public void update(int idx, int value) {
        idx++;
        while (idx <= n) {
            bit[idx] += value;
            idx += idx & -idx;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryIndexedTree obj = new BinaryIndexedTree();

        obj.n = sc.nextInt();
        obj.bit = new int[obj.n + 1];

        for (int i = 0; i < obj.n; i++) {
            int value = sc.nextInt();
            obj.build(i, value);
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

            System.out.println("1 - SumRange");
            System.out.println("2 - Update");

            switch (x) {
                case 1:
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(obj.sumRange(left, right));
                    break;

                case 2:
                    int idx = sc.nextInt();
                    int value = sc.nextInt();
                    obj.update(idx, value);
                    break;
            }
        }
    }

    public int prefixSum(int idx) {
        idx++;
        int sum = 0;
        while (idx > 0) {
            sum += bit[idx];
            idx -= idx & -idx;
        }
        return sum;
    }
}
