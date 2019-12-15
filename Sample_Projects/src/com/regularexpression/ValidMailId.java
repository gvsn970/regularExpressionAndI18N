package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ACER
 *
 */
public class ValidMailId {

	public static void main(String[] args) {
		System.out.println("Entewr emailId:");
		Scanner s=new Scanner(System.in);
		String number=s.next();
		boolean validNumber= isValidEmail(number);
		if(validNumber) {
			System.out.println("Valid EmailId");
		}else {
			System.out.println("inValid EmailId");
		}
	}
	
	static boolean  isValidEmail(String number){
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]+([.][a-zA-Z0-9]+)+");
		Matcher m=p.matcher(number);
		return m.find() && m.group().equals(number);
	}
}
