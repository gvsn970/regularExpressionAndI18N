package com.nexiilabs.designpatterns;

public class TestLogger {

	public static void main(String[] args) {
		Logger obj1=Logger.getInstace();
		Logger obj2=Logger.getInstace();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		TestLogger test=new TestLogger();
		TestLogger test1=new TestLogger();
		System.out.println(test.hashCode());
		System.out.println(test1.hashCode());
	}
}
