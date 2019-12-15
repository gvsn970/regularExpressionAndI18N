package com.nexiilabs.datastructures;

public class Stack {

	private int size = 5;
	private int top = -1;
	private int stack[] = new int[size];
	private int capacity = size;

	public boolean isFull() {

		if (top == size) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void push(int ele) {
		if (isFull()) {
			System.err.println("Stack is Full");
			System.exit(1);
		} else {
			++top;
			System.out.println("Element Inserted...");
			stack[top] = ele;

		}
	}

	public void display() {
		if (isEmpty()) {
			System.err.println("Stack Is Empty...");
			System.exit(1);
		} else {
			for (int i = 5; i < stack.length; i++) {
				System.out.println("Stack Elements are ::::" + stack[i]);
			}
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.err.println("Stack Is Empty...");
			System.exit(1);
		} else {

		}
	}

}
