package com.rsq8.data.structures.and.algorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue implements Queue {
	Node front;
	Node rear;
	int length;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public Object[] toArray(Object[] a) {
		return new Object[0];
	}


	/*public int front() {
		return front.data;
	}*/
	
	/*public void enqueue(int n) {
		Node temp  = new Node(n);
		if (isEmpty()) {
			rear = temp;
			front = temp;
		} else {
			rear.next = temp;
			rear = temp;
		}
		length++;
	}*/
	
	/*public int dequeue() {
		int temp = front.data;
		front = front.next;
		length --;
		return temp;
	}*/

	@Override
	public boolean add(Object o) {
		Node temp  = new Node((int)o);
		if (isEmpty()) {
			rear = temp;
			front = temp;
		} else {
			rear.next = temp;
			rear = temp;
		}
		length++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean retainAll(Collection c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		return false;
	}

	@Override
	public boolean offer(Object o) {
		return false;
	}

	@Override
	public Object remove() {
		int temp = (int)front.data;
		front = front.next;
		length --;
		return temp;
	}

	@Override
	public Object poll() {
		return null;
	}

	@Override
	public Object element() {
		return null;
	}

	@Override
	public Object peek() {
		return front.data;
	}
}
