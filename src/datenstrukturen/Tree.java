package datenstrukturen;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public void insert(Node root, Node node) {
        if (node.getValue() < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(node);
            } else {
                insert(root.getLeft(), node);
            }
        } else if (node.getValue() > root.getValue()) {
            if (root.getRight() == null) {
                root.setRight(node);
            } else {
                insert(root.getRight(), node);
            }
        }
    }


    public Node find(Node root, int value) {
        if (root.getValue() == value) {
            return root;
        } else if (value < root.getValue()) {
            if (root.getLeft() == null) {
                return null;
            } else {
                return find(root.getLeft(), value);
            }
        } else if (value > root.getValue()) {
            if (root.getRight() == null) {
                return null;
            } else {
                return find(root.getRight(), value);
            }
        }
        return null;
    }


    public void delete(Node root, int value) {
        if (root.getValue() == value) {
            root = null;
        } else if (value < root.getValue() && root.getLeft() != null) {
            delete(root.getLeft(), value);
        } else if (value > root.getValue() && root.getRight() != null) {
            delete(root.getRight(), value);
        }
    }


}
