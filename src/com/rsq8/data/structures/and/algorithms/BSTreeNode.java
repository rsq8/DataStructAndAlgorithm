package com.rsq8.data.structures.and.algorithms;

public class BSTreeNode<Key extends Comparable<Key>> {
    private Key key;
    public int data;
    public int n;
    public BSTreeNode<Key> left;
    public BSTreeNode<Key> right;

    public BSTreeNode(Key key, int data, int n){
        this.data = data;
        this.n = n;
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public Key getKey() {
        return key;
    }

    public BSTreeNode(){}
}
