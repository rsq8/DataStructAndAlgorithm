package com.rsq8.data.structures.and.algorithms;

import java.util.List;
public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList() {
		this.head = new Node();
		this.tail = new Node();
		this.length = 0;
	}

	public Node getTail() {
		return tail;
	}

	public Node getHead() {
		return head;
	}

	public void insertHead(int data) {
		Node newNode = new Node(data);
		anh(newNode);
	}

	public void insertTail(int data) {
		Node newNode = new Node(data);
		ant(newNode);
	}


	public Node getNode(int index) {
		if (length < index) {
			throw new IndexOutOfBoundsException("index is not in linked list");
		} else {
			Node node = new Node();
			node = head;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
		}	
	}

	public void addNodeHead(Node n){
		anh(n);
	}
	public void addNodeTail(Node node) {
		ant(node);
		/*if (head == null) {
			head = node;
			length++;
		} else {
			if(head.next == null) {
				head.next = node;
				int count = 0;
				while(head.next != null) {
					head = head.next;
					count++;
				}
				length = length + count;
			} else {
				Node tail = head.next;
				while (tail.next != null) {
					tail = tail.next;
				}
				tail.next = node;
				int count = 0;
				while(tail.next != null) {
					tail = tail.next;
					count++;
				}
				length = length + count;
			}
		}*/
	}

	private void ant(Node node) {
		if(head == null){
			head = node;
			tail = head;
			//tail = node;
			//head.next = tail;
		}
		else if (head.next == null){
			tail = node;
			head.next = tail;
		} else {
			tail.next = node;
			tail = tail.next;
		}
		length++;
	}

	private void anh(Node n) {
		if (head == null){
			head = n;
		}
		else if (head.next == null) {
			tail = head;
			n.next = head;
			head = n;
			head.next = tail;
		} else {
			n.next = head;
			head = n;
		}
		length++;
	}

	public int size() {
		return length;
	}

	public Iterable<Node> nodes(){
		Node[] nodes = new Node[length];
		Node n = head;
		for (int i = 0;  i < length ; i++){
			nodes[i] = n;
			n = n.next;
		}
		return List.of(nodes);
	}
	
	public String toString() {
		String result = "[" ;
		if (head == null) {
			return result + "]";
		}
		result = result + head.data;
		Node temp = head.next;
		while(temp != null) {
			result = result + ", " + temp.data;
			temp = temp.next;
		}
		return result + "]";
	}
	
}
