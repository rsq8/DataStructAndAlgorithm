package com.rsq8.data.structures.and.algorithms;

public class ArrayStack {
	private int t;
	private int[] s;
	private int size;
	
	public ArrayStack(int size) {
		this.t = -1;
		this.size = size;
		this.s = new int[size];
	}
	
	public int size() {
		return t + 1;
	}
	
	public boolean isEmpty() {
		return t < 0;
	}
	
	public int top() {
		return s[t];
	}
	
	public void push(int n) {
		if (size() == s.length) {
			return;
		}
		t = t + 1;
		s[t] = n;
	}
	
	public int pop() {
		if (isEmpty()) return 0;
		int n = s[t];
		s[t] = 0;
		t = t - 1;
		return n;
		
	}
}
