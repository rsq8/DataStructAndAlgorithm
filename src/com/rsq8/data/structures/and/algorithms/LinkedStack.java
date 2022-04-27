package com.rsq8.data.structures.and.algorithms;

public class LinkedStack {
	private Node head;
	private int size;
	
	public LinkedStack() {
		this.head = null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(int n) {
		Node temp = new Node(n);
		if (head != null) {
			temp.next = head;
		}
		head = temp;
		size++;
	}
	
	public int pop() {
		if (isEmpty()) return 0;
		int n = (int)head.data;
		head = head.next;
		size--;
		return n;
	}
	
	public Object top() {
		if (isEmpty()) return 0;
		return head.data;
	}
}
