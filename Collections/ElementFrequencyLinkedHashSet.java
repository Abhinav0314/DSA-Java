import java.util.*;

public class ElementFrequencyLinkedHashSet {
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
        for(int element: set){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(element == arr[j])
                    count++;
            }
            System.out.println(element + " - " + count);
        }
        sc.close();
    }
}
