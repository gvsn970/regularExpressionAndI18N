package com.nexiilabs.interview;

public class StringClassesExamples {

	public static void main(String[] args) {
		String s1=new String("durga");
		String s2="durga";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("Durga");
		StringBuffer sb2=new StringBuffer("Durga");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		
		StringBuilder sbi1=new StringBuilder("Durga");
		StringBuilder sbi2=new StringBuilder("Durga");
		
		System.out.println(sbi1 == sbi2);
		System.out.println(sbi1.equals(sbi2));
		
	}
}
