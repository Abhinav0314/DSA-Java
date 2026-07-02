import java.util.Scanner;
public class CountPrimesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int primeCount = 0;
        for(int num:arr1){
            int count = 0;
            for(int i = 2;i<n/2;i++){
                if(num%i==0){
                    count += 1;
                    continue;
                }
            }
            if(count==0){
                primeCount+=1;
            }
        }
        System.out.print(primeCount);
        sc.close();
    }
}
