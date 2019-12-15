package com.nexiilabs.lamdaexpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdmaExpression1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(4));
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(5));
		//(int a,int b) -> System.out.println(a+b);
	}
}
