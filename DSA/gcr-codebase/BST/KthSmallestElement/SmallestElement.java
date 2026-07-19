package KthSmallestElement;

import java.util.*;

public class SmallestElement {
    public static int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k)
                return current.val;

            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);

        System.out.println(kthSmallest(root, 3));
    }
}