package com.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ACER
 *
 */

public class ValidMobileNumber {

	public static void main(String[] args) {
		System.out.println("Entewr aMobile  number :");
		Scanner s=new Scanner(System.in);
		String number=s.next();
		boolean validNumber= isValidMobileNumber(number);
		if(validNumber) {
			System.out.println("Valid mobile number");
		}else {
			System.out.println("inValid mobile number");
		}
	}
	static boolean  isValidMobileNumber(String number){
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(number);
		return m.find() && m.group().equals(number);
	}
}
