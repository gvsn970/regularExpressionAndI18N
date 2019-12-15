package com.nexiilabs.interview;

final class ImmutableTest {

	private int i;

	ImmutableTest(int i) {
		this.i = i;
	}

	public ImmutableTest modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableTest(i);
		}
	}

	public static void main(String[] args) {
		ImmutableTest t1=new ImmutableTest(10);
		ImmutableTest t2=t1.modify(100);
		ImmutableTest t3=t1.modify(10);
		
		System.out.println( t1== t2);
		System.out.println( t1== t3);
		
		
		String s=new String("Surya");
		s.concat("Narayanba");
		System.out.println(s);
	}
}
