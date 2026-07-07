import java.util.Scanner;

public class BitMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(2);
        int pos = sc.nextInt();

        int bitmask = 1 << pos;

        if ((bitmask & num) != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        System.out.println(Integer.toBinaryString(num));
        sc.close();
    }
}
