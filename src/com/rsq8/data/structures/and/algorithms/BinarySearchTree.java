package com.rsq8.data.structures.and.algorithms;

public class BinarySearchTree<Key extends Comparable<Key>> {
    private TreeNode root;

    private int size(TreeNode tn){
        if (tn == null) return 0;
        return tn.n;
    }

    private TreeNode deleteMin(TreeNode tn){
        if (tn.left == null) return tn.right;
        tn.left = deleteMin(tn.left);
        tn.n = size(tn.left) + size(tn.right) - 1;
        return tn;
    }

    private TreeNode deleteMax(TreeNode tn){
        if (tn.right == null) return tn.left;
        tn.right = deleteMax(tn.right);
        tn.n = size(tn.left) + size(tn.right) - 1;
        return tn;
    }

    private TreeNode delete(Key key, TreeNode tn){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp < 0) tn.left = delete(key, tn.left);
        else if (cmp > 0) tn.right = delete(key, tn.right);
        else {
            if (tn.left == null) return tn.right;
            if (tn.right == null) return tn.left;
            TreeNode temp = tn;
            tn = min(temp.right);
            tn.right = deleteMin(temp.right);
            tn.left = temp.left;
        }
        tn.n = size(tn.left) + size(tn.right) +1;
        return tn;
    }

    private TreeNode min(TreeNode tn){
        if (tn.left == null) return tn;
        return min(tn.left);
    }

    private TreeNode max(TreeNode tn){
        if (tn.right == null) return tn;
        return max(tn.right);
    }

    private TreeNode floor(TreeNode tn, Key key){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp == 0) return tn;
        if (cmp < 0) return floor(tn.left, key);
        TreeNode temp = floor(tn.right, key);
        if (temp != null) return temp;
        else return tn;
    }

    private TreeNode ceiling(TreeNode tn, Key key){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp == 0) return tn;
        if (cmp > 0) return ceiling(tn.right, key);
        TreeNode temp = floor(tn.left, key);
        if (temp != null) return temp;
        else return tn;
    }

    private void keys(TreeNode tn, LinkedQueue q, Key lo, Key hi){
        if (tn == null) return;
        int complo = lo.compareTo((Key)tn.getKey());
        int comphi = hi.compareTo((Key)tn.getKey());
        if (complo < 0) keys(tn.left, q, lo, hi);
        if (complo <= 0 && comphi >= 0) q.add((Key)tn.getKey());
        if (comphi > 0) keys(tn.right, q, lo, hi);
    }

    private int get(TreeNode tn, Key key){
        if (tn == null) return 0;
        int cmp = key.compareTo((Key) tn.getKey());
        if (cmp < 0) return get(tn.left, key);
        else if (cmp > 0) return get(tn.right, key);
        else return tn.data;
    }

    private TreeNode insert(TreeNode tn, int data, Key key){
        if (tn == null) return new TreeNode(key, data, 1);
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp < 0) tn.left = insert(tn.left, data, key);
        else if (cmp > 0) tn.right = insert(tn.right, data, key);
        else tn.data = data;
        tn.n = size(tn.left) + size(tn.right) + 1;
        return tn;
    }

    private TreeNode select(TreeNode tn, int num){
        if (tn == null)return null;
        int temp = size(tn.left);
        if (temp > num) return select(tn.left, num);
        else if (temp < num) return select(tn.right, num - temp - 1);
        else return tn;
    }

    private int rank(TreeNode tn, Key key){
        if (tn == null) return 0;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp < 0) return rank(tn.left, key);
        else if (cmp > 0) return 1 + rank(tn.right, key) + size(tn.left);
        else return size(tn.left);
    }

    public int size(){
        return size(root);
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    public void deleteMax(){
        root = deleteMax(root);
    }

    public void delete(Key key){
        root = delete(key, root);
    }

    public int rank(Key key){
        return rank(root, key);
    }

    public Key select(int key){
        return (Key)select(root, key).getKey();
    }

    public Key min(){
        return (Key)min(root).getKey();
    }

    public Key max(){
        return (Key)max(root).getKey();
    }

    public Key floor(Key key){
        TreeNode temp = floor(root, key);
        if (temp == null) return null;
        return (Key)temp.getKey();
    }

    public Key ceiling(Key key){
        TreeNode temp = ceiling(root, key);
        if (temp == null) return null;
        return (Key)temp.getKey();
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

    public Iterable<Key> keys(Key lo, Key hi){
        LinkedQueue q = new LinkedQueue();
        keys(root, q, lo, hi);
        return q;
    }

    public Iterable<Key> keys(){
        return keys(min(), max());
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
