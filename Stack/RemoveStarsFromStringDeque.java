import java.util.*;

public class RemoveStarsFromStringDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Deque<Character> dq = new ArrayDeque<>();
        if (str.length() > 0 && str.charAt(0) != '*') {
            dq.push(str.charAt(0));
        }
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '*') {
                dq.push(ch);
            } else if (!dq.isEmpty()) {
                dq.pop();
            }
        }
        String st = "";
        for (char ch : dq) {
            st += ch;
        }
        System.out.print(st);
    }
}
