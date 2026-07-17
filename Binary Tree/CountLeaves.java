import java.util.*;

public class CountLeaves {
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

    public static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Leaf Nodes Count = " + countLeaves(root));
        sc.close();
    }
}
