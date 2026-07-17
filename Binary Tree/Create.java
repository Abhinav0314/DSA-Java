import java.util.*;

public class Create {
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

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Tree created successfully with root: " + (root != null ? root.data : "null"));
        sc.close();
    }
}
