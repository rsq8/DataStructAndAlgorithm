package com.rsq8.data.structures.and.algorithms;

public class StackQueue {
	private LinkedStack stackOne;
	private LinkedStack stackTwo;
	private int length;
	
	public StackQueue() {
		this.stackOne = new LinkedStack();
		this.stackTwo = new LinkedStack();
		this.length = 0;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return stackOne.isEmpty();		
	}
	
/*	public int front() {
		while (!stackOne.isEmpty()) {
			stackTwo.push(stackOne.pop());
		}
		int n = stackTwo.top();
		while (!stackTwo.isEmpty()) {
			stackOne.push(stackTwo.pop());
		}
		return n;
	}
	
	public void enqueue(int n) {
		stackOne.push(n);
		length ++;
	}
	
	public int dequeue() {
		while (!stackOne.isEmpty()) {
			stackTwo.push(stackOne.pop());
		}
		int n = stackTwo.pop();
		while (!stackTwo.isEmpty()) {
			stackOne.push(stackTwo.pop());
		}
		length --;
		return n;
	}*/
	
}
