import java.util.*;

public class MostFrequentElementMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int maxfreq = 0;
        for(int elem : hm.keySet()){
            if(hm.get(elem) >= max ){
                max = hm.get(elem);
            }
        }
        for(int x :hm.keySet()){
            if(hm.get(x) == max && x > maxfreq)
                maxfreq = x;
        }
        System.out.print(maxfreq);
        sc.close();
    }
}
