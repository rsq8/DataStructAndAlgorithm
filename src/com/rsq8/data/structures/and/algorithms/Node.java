package com.rsq8.data.structures.and.algorithms;

public class Node<Data extends Object> {
	public Data data;
	public Node next;
	
	public Node(Data data) {
		this.data = data;
	}
	
	public Node() {
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
