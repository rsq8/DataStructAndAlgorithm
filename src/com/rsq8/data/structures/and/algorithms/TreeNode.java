package com.rsq8.data.structures.and.algorithms;

public class TreeNode <Data extends Object>{
    public Data data;
    public TreeNode<Data> left;
    public TreeNode<Data> right;

    public TreeNode(Data data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Data getKey() {
        return data;
    }

    public TreeNode(){}
}
