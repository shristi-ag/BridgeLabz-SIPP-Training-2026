package RecursiveOrder;
import java.util.*;

import java.util.*;

//class Node {
//    int val;
//    Node left, right;
//
//    Node(int val) {
//        this.val = val;
//        left = right = null;
//    }
//}

public class InorderTransversal{



    // Inorder Traversal
    public static void inorder(Node node, List<Integer> result) {
        if (node == null)
            return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    // Returns the values in sorted order
    public static List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        List<Integer> result = getSortedLeaderboard(root);

        System.out.println(result);
    }
}