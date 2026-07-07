import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i]= sc.nextInt();
        }
        
        int count = 0;
        int[] newArr = new int[size];
        
        for(int i = 0;  i < size - 1; i++){
            int j = 0;
            boolean dublicate = false;
            while(j<count){
                if(arr[i] == newArr[j]){
                    dublicate = true;
                    break;
                }
                else{
                    j++;
                }
            }
            if(!dublicate){
                newArr[count] = arr[i];
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            System.out.print(newArr[i]);
        }
        sc.close();
    }
}
