package com.rsq8.data.structures.and.algorithms;

public class ArrayQueue {
	int[] q;
	int front;
	int rear;
	int size;
	
	public ArrayQueue(int size) {
		this.front = 0;
		this.rear = 0;
		this.size = size;
		this.q = new int[size];
	}
	
	public int size() {
		return (q.length - front + rear) % q.length;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public int front() {
		if(isEmpty()) return 0;
		return q[front];
	}
	
	public void enqueue(int n) {
		if (size() == q.length - 1) return;
		q[rear] = n;
		rear = (rear + 1) % q.length;
	}
	
	public int dequeue() {
		if (isEmpty()) return 0;
		int temp = q[front];
		q[front] = 0;
		front = (front + 1) % q.length;
		return temp;
	}
}
