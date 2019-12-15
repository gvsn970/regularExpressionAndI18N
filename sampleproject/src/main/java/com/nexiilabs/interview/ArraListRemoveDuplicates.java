package com.nexiilabs.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraListRemoveDuplicates {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("surya");
		l.add("surya");
		l.add("Ram");
		l.add("Srinivas");
		l.add("Rahul");
		l.add("Rahul");
		//l.stream().forEach(System.out::println);
		Set set=new HashSet<>(l);
		set.stream().forEach(System.out::println);
	}
}
