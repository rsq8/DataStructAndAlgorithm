package com.rsq8.data.structures.and.algorithms;

public class BinarySearchTree {
    private TreeNode root;
    private int height;

    public TreeNode getRoot() {
        return root;
    }

    public BinarySearchTree(){
        this.root = new TreeNode();
        this.height = 0;
    }

    public void insert(int key, int value){
        root = insert(root, key, value);
    }

    private TreeNode insert(TreeNode node, int key, int value){
        if (node == null) return new TreeNode(key, value);
        if (key < node.key) node.left = insert(node.left, key, value);
        else if (key > node.key) node.right = insert(node.right, key, value);
        else if (key == node.key) node.data = value;
        return node;
    }

}
