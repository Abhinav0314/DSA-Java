import java.util.*;

public class Create {
    public static Node create(int n, Scanner sc) {
        Node head = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node temp = new Node(x);

            if (head == null) {
                head = temp;
            } else {
                Node t = head;
                while (t.next != null) {
                    t = t.next;
                }
                t.next = temp;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        Node head = create(n, sc);

        System.out.print("Created Linked List: ");
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
        sc.close();
    }
}
