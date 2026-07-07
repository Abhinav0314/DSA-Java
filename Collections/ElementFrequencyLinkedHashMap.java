import java.util.*;

public class ElementFrequencyLinkedHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int key : hm.keySet()){
            System.out.println(key + " - " + hm.get(key));
        }
        sc.close();
    }
}
