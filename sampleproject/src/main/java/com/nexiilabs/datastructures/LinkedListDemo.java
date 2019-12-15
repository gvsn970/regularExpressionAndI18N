package com.nexiilabs.datastructures;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}
}
