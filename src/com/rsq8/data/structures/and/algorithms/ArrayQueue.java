package com.rsq8.data.structures.and.algorithms;

import java.util.ArrayList;

public class ArrayQueue<E extends Object> {
	Object[] q;
	int front;
	int rear;
	int size;
	
	public ArrayQueue(int size) {
		this.front = 0;
		this.rear = 0;
		this.size = size;
		this.q = new Object[size];
	}
	
	public int size() {
		return (q.length - front + rear) % q.length;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public Object front() {
		if(isEmpty()) return null;
		return q[front];
	}
	
	public void enqueue(E n) {
		if (size() == q.length - 1) return;
		q[rear] = n;
		rear = (rear + 1) % q.length;
	}
	
	public Object dequeue() {
		if (isEmpty()) return null;
		Object temp = q[front];
		q[front] = null;
		front = (front + 1) % q.length;
		return temp;
	}

	public Iterable<Object> items(){
		ArrayList<Object> items = new ArrayList<>();
		for (int i = 0; i < size(); i++){
			items.add(q[i]);
		}
		return items;
	}
}
