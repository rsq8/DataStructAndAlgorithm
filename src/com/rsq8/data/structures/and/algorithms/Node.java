package com.rsq8.data.structures.and.algorithms;

public class Node implements Comparable<Node>{
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node() {
	}

	@Override
	public int compareTo(Node o) {
		if (this.data < o.data) return -1;
		else if (this.data > o.data) return 1;
		return 0;
	}

	public String toString(){
		return Integer.toString(data);
	}

	/*public void setData (int data) {
		this.data = data;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}*/
}
