package com.interview;

 class Singlton {
	String s = null;
	private static Singlton st = null;

	private Singlton() {
		s = "Hello I am a string part of Singleton class";
	}
	
	public static Singlton getInstace() {
		if(st == null) {
			st=new Singlton();
			return st;
		}
		return null;
	}
}

public class SingleTonTest {

	public static void main(String[] args) {
		
		Singlton x=Singlton.getInstace();
		x.s=(x.s).toLowerCase();
		System.out.println(x.s);
	}
}
