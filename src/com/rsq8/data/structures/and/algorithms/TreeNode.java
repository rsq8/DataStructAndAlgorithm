package com.rsq8.data.structures.and.algorithms;

public class TreeNode<Key extends Comparable<Key>> {
    private Key key;
    public int data;
    public int n;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Key key, int data, int n){
        this.data = data;
        this.n = n;
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {
        return key;
    }

    public TreeNode(){}
}
