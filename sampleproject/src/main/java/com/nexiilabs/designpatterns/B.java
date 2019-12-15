package com.nexiilabs.designpatterns;

public class B implements A {

	public void methodB() {
		System.out.println("B Method");
	}
	public void methodA() {
		System.out.println("B Method Calling");
	}
}
