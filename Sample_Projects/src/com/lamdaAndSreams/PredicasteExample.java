package com.lamdaAndSreams;

import java.util.function.Predicate;

public class PredicasteExample {

	public static void main(String[] args) {
		String[] s= {"chiru","surya","venkatesh","balayya","Roja"};
		Predicate<String> p=s1->s1.length()>5;
		for(String s1 : s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
