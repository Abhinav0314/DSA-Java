import java.util.*;

public class EvenSum {
    static Scanner sc = new Scanner(System.in);

    public static Node createTree() {
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);
        root.left = createTree();
        root.right = createTree();
        return root;
    }

    public static int evenSum(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.data % 2 == 0) {
            return root.data + evenSum(root.left) + evenSum(root.right);
        }

        return evenSum(root.left) + evenSum(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Even Sum = " + evenSum(root));
        sc.close();
    }
}
