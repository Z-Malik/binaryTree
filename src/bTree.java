public class bTree {

    /*
    Passing class object of Node as root and setting the root node to null (empty).
     */
    Node root;
    public void BST() {
        root = null;
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    /*
    Inner class to create nodes. Once node is created, data will pass data attribute to both nodes
    left and right, which are set to null.
     */
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
