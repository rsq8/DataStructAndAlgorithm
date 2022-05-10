package com.rsq8.data.structures.and.algorithms;

import java.util.Stack;

public class TreeAlgorithm {
    public static void recInOrder(TreeNode node){
        if (node == null) return;
        recInOrder(node.left);
        System.out.print(node.data + ", ");
        recInOrder(node.right);
    }

    public static void recPostOrder(TreeNode tn){
        if (tn == null) return ;
        recPostOrder(tn.left);
        recPostOrder(tn.right);
        System.out.print(tn.data + ", ");
    }

    public static void levelTraversal(TreeNode tn){
        LinkedQueue q = new LinkedQueue();
        TreeNode ref = tn;
        while (ref != null){
            System.out.print(ref.data + ", ");
            if (ref.left != null) q.add(ref.left);
            if (ref.right != null) q.add(ref.right);
            ref = (TreeNode) q.remove();
        }
    }

    public static void recPreOrder(TreeNode tn){
        if (tn == null) return;
        System.out.print(tn.data + ", ");
        recPreOrder(tn.left);
        recPreOrder(tn.right);
    }

    public static void itInOrder(TreeNode tn){
        Stack<TreeNode> s = new Stack<>();
        boolean done = false;
        TreeNode ref = tn;
        while(!done){
            if (ref != null){
                s.push(ref);
                ref = ref.left;
            }
            else if (!s.isEmpty()){
                ref = s.pop();
                System.out.print(ref.data + ", ");
                ref = ref.right;
            } else done = true;
        }
    }

    public static void itPreOrder(TreeNode tn){
        Stack<TreeNode> s = new Stack<>();
        boolean done = false;
        TreeNode ref = tn;
        while(!done){
            if (ref != null){
                System.out.print(ref.data + ", ");
                s.push(ref);
                ref = ref.left;
            }
            else if (!s.isEmpty()){
                ref = s.pop();
                ref = ref.right;
            } else done = true;
        }

    }

    public static void itPostOrder(TreeNode tn){
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        TreeNode ref = tn;
        s.push(ref);
        while(!s.isEmpty()){
            ref = s.pop();
            s2.push(ref);
            if(ref.left != null) s.push(ref.left);
            if(ref.right != null) s.push(ref.right);
        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop().data + ", ");
        }
    }

}
