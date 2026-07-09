import java.util.Scanner;

public class ToggleKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        System.out.println("Enter bit position k:");
        int k = sc.nextInt();

        n = n ^ (1 << (k - 1));
        System.out.println(n);
        sc.close();
    }
}
