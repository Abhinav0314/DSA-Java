import java.util.*;

public class Insert {
    public static Node insert(Node head, int x) {
        Node temp = new Node(x);

        if (head == null) {
            return temp;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        t.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial number of nodes: ");
        int n = sc.nextInt();
        Node head = null;
        if (n > 0) {
            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                head = insert(head, sc.nextInt());
            }
        }
        System.out.print("Enter element to insert at the end: ");
        int x = sc.nextInt();
        head = insert(head, x);

        System.out.print("Linked List after insertion: ");
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
        sc.close();
    }
}
