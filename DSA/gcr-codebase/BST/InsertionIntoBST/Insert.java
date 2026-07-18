package InsertionIntoBST;

public class Insert {
    public static Node insert(Node node, int id) {

        if (node == null)
            return new Node(id);

        if (id < node.val)
            node.left = insert(node.left, id);
        else if (id > node.val)
            node.right = insert(node.right, id);

        return node;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);

        inorder(root);
    }
}