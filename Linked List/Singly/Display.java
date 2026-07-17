import java.util.*;

public class Display {
    public static void display(Node head) {
        Node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        if (n > 0) {
            System.out.print("Enter " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                Node temp = new Node(sc.nextInt());
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            }
        }
        System.out.println("Displaying elements:");
        display(head);
        sc.close();
    }
}
