package com.rsq8.data.structures.and.algorithms;

public class LinkedListAlgo {

    public static Node reverse(Node n){
        Node curr = n;
        Node prev = null;
        Node next = n;
        while (next != null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean compareList(Node l1, Node l2){
        if(l1 == null && l2 == null) return true;
        //Node temp1 = l1;
        //Node temp2 = l2;

        while(l1 != null && l2 != null) {
            if(l1.data == l2.data) {
                l1 = l1.next;
                l2 = l2.next;
            } else return false;
        }

        return l1 == null && l2 == null;
    }

    public static Node reverseStack(Node n){
        LinkedStack data = new LinkedStack();
        while (n != null){
            data.push((int)n.data);
            n = n.next;
        }
        n = new Node(data.pop());
        Node track = n;
        while (!data.isEmpty()){
            Node temp = new Node(data.pop());
            track.next = temp;
            track = track.next;
        }
        return  n;
    }

    public static Node mergeLinkedList(Node l1, Node l2) {
        Node head = new Node();
        Node trace = new Node();
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if ((int)l1.data <= (int)l2.data) {
            trace = l1;
            l1 = trace.next;
        } else {
            trace = l2;
            l2 = trace.next;
        }

        head = trace;

        while(l1 != null && l2 != null) {
            if((int)l1.data <= (int)l2.data) {
                trace.next = l1;
                trace = l1;
                l1 = trace.next;
            } else {
                trace.next = l2;
                trace = l2;
                l2 = trace.next;
            }
        }

        if (l1 == null) trace.next = l2;
        else if (l2 == null) trace.next = l1;

        return head;
    }

    public static Node splitLinkedList(Node l) {
        if (l == null || l.next == null) {
            return l;
        }

        Node tail1 = l;
        Node end = l.next;

        while(tail1 != null && end.next != null) {
            tail1 = tail1.next;
            end = end.next.next;
            if (end == null) break;
        }

        Node head2 = tail1.next;
        tail1.next = null;

        Node first = splitLinkedList(l);
        Node second = splitLinkedList(head2);
        Node merged = mergeLinkedList(first, second);
        return merged;
    }

    public static Node listIntersectUArray(Node l1, Node l2) {
        Node[] nodes = new Node[1];
        int count = 0;
        while(l1 != null) {
            if (count == nodes.length - 1) {
                nodes = (Node[]) ArrayAlgo.resize(nodes, (2*nodes.length));
            }
            nodes[count] = l1;
            l1 = l1.next;
            count++;
        }
        while(l2 != null) {
            if (count == nodes.length - 1) {
                nodes = (Node[]) ArrayAlgo.resize(nodes, (2*nodes.length));
            }
            nodes[count] = l2;
            l2 = l2.next;
            count++;
        }

        for (int i = 0; i < nodes.length; i++) {
            for (int j = 0; j < nodes.length; j++) {
                if (nodes[i] == nodes[j] && i != j) {
                    return nodes[j];
                }
            }
        }

        return null;
    }
}
