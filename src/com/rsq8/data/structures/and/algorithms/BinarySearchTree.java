package com.rsq8.data.structures.and.algorithms;

public class BinarySearchTree<Key extends Comparable<Key>> {
    private TreeNode root;

    private int size(TreeNode n){
        if (n == null) return 0;
        return n.n;
    }

    private int get(TreeNode n, Key key){
        if (n == null) return 0;
        int cmp = key.compareTo((Key) n.getKey());
        if (cmp < 0) return get(n.left, key);
        else if (cmp > 0) return get(n.right, key);
        else return n.data;
    }

    private TreeNode insert(TreeNode n, int data, Key key){
        if (n == null) return new TreeNode(key, data, 1);
        int cmp = key.compareTo((Key)n.getKey());
        if (cmp < 0) n.left = insert(n.left, data, key);
        else if (cmp > 0) n.right = insert(n.right, data, key);
        else n.data = data;
        n.n = size(n.left) + size(n.right) + 1;
        return n;
    }

    public int size(){
        return size(root);
    }

    public void insert(Key key, int data){
        root = insert(root, data, key);
    }

    public int get(Key key){
        return get(root, key);
    }
    public TreeNode getRoot() {
        return root;
    }


    /*public void insert(int key, int value){
        root = insert(root, key, value);
    }

    /*private TreeNode insert(TreeNode node, int key, int value){
        if (node == null) return new TreeNode(key, value);
        if (key < node.key) node.left = insert(node.left, key, value);
        else if (key > node.key) node.right = insert(node.right, key, value);
        else if (key == node.key) node.data = value;
        return node;
    }*/

}
