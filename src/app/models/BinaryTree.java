package app.models;

import app.entities.NodeTree;

public class BinaryTree {
    public NodeTree root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = addRecursively(root, key);
    }

    private NodeTree addRecursively(NodeTree current, Integer key) {
        if (current == null) {
            return new NodeTree(key);
        }
        int compareResult = key.compareTo(current.value);

        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else if (compareResult > 0) {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public void inorderTraversal(NodeTree node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(NodeTree node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(NodeTree node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }
}
