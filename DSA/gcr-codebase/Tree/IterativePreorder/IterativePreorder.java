package IterativePreorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorder {
    public static List<Integer> IterativePreorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();
            result.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(IterativePreorder(root));
    }
}