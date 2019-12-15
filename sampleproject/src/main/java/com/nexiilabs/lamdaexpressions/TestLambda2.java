package com.nexiilabs.lamdaexpressions;

interface interf {
	public void m1();
}

public class TestLambda2 {

	public static void main(String[] args) {
		interf i=()->System.out.println("Hello........");
		i.m1();
	}
}
