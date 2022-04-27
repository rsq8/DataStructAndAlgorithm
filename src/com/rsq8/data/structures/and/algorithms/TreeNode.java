package com.rsq8.data.structures.and.algorithms;

public class TreeNode {
    public int key;
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key, int data){
        this.data = data;
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public TreeNode(){}
}
