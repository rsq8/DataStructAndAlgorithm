package com.rsq8.data.structures.and.algorithms;

public class BinarySearchTree<Key extends Comparable<Key>> {
    private BSTreeNode root;

    private int size(BSTreeNode tn){
        if (tn == null) return 0;
        return tn.n;
    }

    private BSTreeNode deleteMin(BSTreeNode tn){
        if (tn.left == null) return tn.right;
        tn.left = deleteMin(tn.left);
        tn.n = size(tn.left) + size(tn.right) - 1;
        return tn;
    }

    private BSTreeNode deleteMax(BSTreeNode tn){
        if (tn.right == null) return tn.left;
        tn.right = deleteMax(tn.right);
        tn.n = size(tn.left) + size(tn.right) - 1;
        return tn;
    }

    private BSTreeNode delete(Key key, BSTreeNode tn){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp < 0) tn.left = delete(key, tn.left);
        else if (cmp > 0) tn.right = delete(key, tn.right);
        else {
            if (tn.left == null) return tn.right;
            if (tn.right == null) return tn.left;
            BSTreeNode temp = tn;
            tn = min(temp.right);
            tn.right = deleteMin(temp.right);
            tn.left = temp.left;
        }
        tn.n = size(tn.left) + size(tn.right) +1;
        return tn;
    }

    private BSTreeNode min(BSTreeNode tn){
        if (tn.left == null) return tn;
        return min(tn.left);
    }

    private BSTreeNode max(BSTreeNode tn){
        if (tn.right == null) return tn;
        return max(tn.right);
    }

    private BSTreeNode floor(BSTreeNode tn, Key key){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp == 0) return tn;
        if (cmp < 0) return floor(tn.left, key);
        BSTreeNode temp = floor(tn.right, key);
        if (temp != null) return temp;
        else return tn;
    }

    private BSTreeNode ceiling(BSTreeNode tn, Key key){
        if (tn == null) return null;
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp == 0) return tn;
        if (cmp > 0) return ceiling(tn.right, key);
        BSTreeNode temp = floor(tn.left, key);
        if (temp != null) return temp;
        else return tn;
    }

    private void keys(BSTreeNode tn, LinkedQueue q, Key lo, Key hi){
        if (tn == null) return;
        int complo = lo.compareTo((Key)tn.getKey());
        int comphi = hi.compareTo((Key)tn.getKey());
        if (complo < 0) keys(tn.left, q, lo, hi);
        if (complo <= 0 && comphi >= 0) q.add((Key)tn.getKey());
        if (comphi > 0) keys(tn.right, q, lo, hi);
    }

    private int get(BSTreeNode tn, Key key){
        if (tn == null) return 0;
        int cmp = key.compareTo((Key) tn.getKey());
        if (cmp < 0) return get(tn.left, key);
        else if (cmp > 0) return get(tn.right, key);
        else return tn.data;
    }

    private BSTreeNode insert(BSTreeNode tn, int data, Key key){
        if (tn == null) return new BSTreeNode(key, data, 1);
        int cmp = key.compareTo((Key)tn.getKey());
        if (cmp < 0) tn.left = insert(tn.left, data, key);
        else if (cmp > 0) tn.right = insert(tn.right, data, key);
        else tn.data = data;
        tn.n = size(tn.left) + size(tn.right) + 1;
        return tn;
    }

    private BSTreeNode select(BSTreeNode tn, int num){
        if (tn == null)return null;
        int temp = size(tn.left);
        if (temp > num) return select(tn.left, num);
        else if (temp < num) return select(tn.right, num - temp - 1);
        else return tn;
    }

    private int rank(BSTreeNode tn, Key key){
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
        BSTreeNode temp = floor(root, key);
        if (temp == null) return null;
        return (Key)temp.getKey();
    }

    public Key ceiling(Key key){
        BSTreeNode temp = ceiling(root, key);
        if (temp == null) return null;
        return (Key)temp.getKey();
    }
    public void insert(Key key, int data){
        root = insert(root, data, key);
    }

    public int get(Key key){
        return get(root, key);
    }
    public BSTreeNode getRoot() {
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
