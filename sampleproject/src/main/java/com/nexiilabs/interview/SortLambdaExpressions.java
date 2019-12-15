package com.nexiilabs.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
	String name;
	int id;

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}

public class SortLambdaExpressions {

	public static void main(String[] args) {

		List<Person> l = new ArrayList<>();
		l.add(new Person("a", 1));
		l.add(new Person("Ram", 2));
		l.add(new Person("Rahul", 3));
		l.add(new Person("Tilak", 4));
		l.add(new Person("surya", 5));

		//Collections.sort(l, (e1, e2) -> e1.id > e2.id ? 1 : e1.id < e2.id ? -1 : 0);
		Collections.sort(l,(e1,e2) -> e1.name.compareTo(e2.name));
		l.stream().forEach(System.out::println);
		
		
	}
}
