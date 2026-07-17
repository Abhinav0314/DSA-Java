import java.util.*;

public class CountEven {
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

    public static int countEven(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.data % 2 == 0) {
            return 1 + countEven(root.left) + countEven(root.right);
        }

        return countEven(root.left) + countEven(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree nodes (-1 for null):");
        Node root = createTree();
        System.out.println("Even Count = " + countEven(root));
        sc.close();
    }
}
