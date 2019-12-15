package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ACER
 *
 */
public class PattrenExample2 {

	public static void main(String[] args) {
		//Pattern p=Pattern.compile("[^`a-zA-Z0-9]");
		//Pattern p=Pattern.compile("\\D");
		Pattern p=Pattern.compile("a*");
		//Matcher m=p.matcher("acb#$%@ a434ADF");
		Matcher m=p.matcher("abaaabaaeeaab");
		while(m.find()) {
			System.out.println(m.start()+":::::::"+m.group());
		}
	}
}
