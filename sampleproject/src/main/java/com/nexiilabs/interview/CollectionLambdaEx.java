package com.nexiilabs.interview;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}

public class CollectionLambdaEx {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Surya", 231));
		l.add(new Employee("Rahul", 1));
		l.add(new Employee("Ram", 4));
		l.add(new Employee("Tilak", 23));
		Collections.sort(l, (e1, e2) -> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0);
		//Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));
		// System.out.println(l);
		l.stream().forEach(System.out::println);
	}
}
