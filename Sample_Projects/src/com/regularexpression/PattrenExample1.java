package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ACER
 *
 */
public class PattrenExample1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("ba");
		Matcher m=p.matcher("abbabbba");
		int count=0;
		while(m.find()) {
			count++;
			System.out.println(m.start()+":::::::"+m.end()+":::::::::"+m.group());
		}
		System.out.println(count);
	}
}
