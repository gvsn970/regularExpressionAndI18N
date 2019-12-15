package com.nexiilabs.datastructures;

import java.util.Random;

public class UniqueCode {

	public static void main(String[] args) {
		
		String lastName="gosala";
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000000);
		String randomId=lastName+rand_int1;
		System.out.println("Random Integers: " + randomId);
		System.err.println();
		String random = lastName+(int )(Math.random()*1000000 );
		
		System.out.println("Second Random Integers: " + random);
	}

}
