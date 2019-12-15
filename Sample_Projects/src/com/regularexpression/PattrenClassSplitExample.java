package com.regularexpression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * 
 * @author ACER
 *
 */
public class PattrenClassSplitExample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[.]");
		String s[]=p.split("www.durgajobs.com");
		for(String s1 : s) {
			//System.out.println(s1);
			
		}
		StringTokenizer st=new StringTokenizer("Durga Software Solutions");
		while(st.hasMoreElements()) {
		//	System.out.println(st.nextElement());
		}
		
		StringTokenizer st1=new StringTokenizer("12-04-2019","-");
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken());
		}
	}
}
