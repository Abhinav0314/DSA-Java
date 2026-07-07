import java.util.*;

public class RemoveDuplicatesLinkedHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        System.out.print(set);
        sc.close();
    }
}
