import java.util.*;

public class SecondMostFrequentElementMap {
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
        
        int maxVal = 0;
        int maxFreq = 0;
        int secMaxVal = 0;
        int secMaxFreq = 0;

        for(int x : hm.keySet()){
            int currentFreq = hm.get(x);

            if(currentFreq > maxFreq){
                secMaxFreq = maxFreq;
                secMaxVal = maxVal;
                maxFreq = currentFreq;
                maxVal = x;
            } else if(currentFreq > secMaxFreq){
                secMaxFreq = currentFreq;
                secMaxVal = x;
            }
        }
        System.out.print(secMaxVal);
        sc.close();
    }
}
