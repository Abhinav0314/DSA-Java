import java.util.*;

public class Height {
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

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Height = " + height(root));
        sc.close();
    }
}
