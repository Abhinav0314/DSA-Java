import java.util.Scanner;

public class EvenOddCheckBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();

        if ((n | 1) == n + 1) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
