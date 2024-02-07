package org.quangphan.generics.node;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public void removeChild(TreeNode<T> child) {
        children.remove(child);
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    // Additional methods for tree manipulation can be added here...

    // Recursive method to print the tree structure
    public void printTree() {
        printTree(this, 0);
    }

    // Recursive method to print the tree structure
    private static void printTree(TreeNode<?> node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(node.getData());

        for (TreeNode<?> child : node.getChildren()) {
            printTree(child, depth + 1);
        }
    }


    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);

        root.addChild(node1);
        root.addChild(node2);

        printTree(root, 0);
    }
}
