package com.nexiilabs.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java,c");
		list.add("java,c,spring");
		list.add("Angular,c");
		list.add("java,microservices");
		list.add("java,hibernate,c,spring");
		list.add("jsp,c,spring,servlet,hibernate");

		String a[] = new String[list.size()];
		for (String l : list) {
			a = l.split(",");
			System.out.println(l);
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i]);
				}
			}

		}
		System.out.println();

	}
}
