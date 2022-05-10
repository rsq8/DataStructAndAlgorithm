package com.rsq8.data.structures.and.algorithms;

public class TreeNode <Key extends Comparable<Key>>{
    private Key key;
    public int data;
    public TreeNode<Key> left;
    public TreeNode<Key> right;

    public TreeNode(Key key, int data){
        this.data = data;
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {
        return key;
    }

    public TreeNode(){}
}
