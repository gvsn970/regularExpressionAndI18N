package com.I8n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author ACER
 *
 */
public class NumberFormatExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		String s=nf.format(d);
		System.out.println(s);
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(":::::::::::"+nf1.format(d));
		
		NumberFormat nf3=NumberFormat.getPercentInstance(Locale.ITALY);
		System.out.println(":::::::::::"+nf3.format(d));
		
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(":::::::::::"+nf2.format(d));
		
		System.out.println("Us Date Format :"+DateFormat.getDateInstance(0,Locale.CANADA).format(new Date() ));
	
	}
}
