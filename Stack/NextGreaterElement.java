import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int res = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    res = arr[j];
                    break;
                }
            }
            ans[i] = res;
        }
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
