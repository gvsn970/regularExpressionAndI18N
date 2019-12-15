package com.nexiilabs.corejava;

 class P{

	P(){
		System.out.println(this.hashCode());
	}
}
 class C extends P{

	C(){
		System.out.println(this.hashCode());
	}
}
public class Consrtuctor1 {

	public static void main(String[] args) {
		C c=new C();
		c.hashCode();
		System.out.println(c.hashCode());
	}
}
