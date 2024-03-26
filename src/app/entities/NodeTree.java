package app.entities;

public class NodeTree {
    public int value;
    public NodeTree left;
    public NodeTree right;

    public NodeTree(int value) {
        this.value = value;
        left = right = null;
    }
}