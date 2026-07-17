import java.util.*;

public class Sum {
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

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Sum = " + sum(root));
        sc.close();
    }
}
