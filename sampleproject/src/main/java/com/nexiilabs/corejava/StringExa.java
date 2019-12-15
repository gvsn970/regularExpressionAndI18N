package com.nexiilabs.corejava;

/**
 * 
 * @author surya
 *
 */
public class StringExa {

	public static void main(String[] args) {
		String s = "surya";
		//s = "narayana";
		s.substring(0, s.length()-2);
		
		String str="Good"; 
		str=str+" Morning";
		System.out.println(str);
		
		String s1=new String("Venkey");
		s1.concat("sadadf");
		
		s1.substring(0, 2);
		System.out.println(s1);
		
		StringBuilder sb=new StringBuilder("StringBuilder");
		sb.append("surya...........");
		 sb.substring(0, 2);
		System.out.println(sb);
		
		StringBuffer sbf=new StringBuffer("String Buffer");
		sb.substring(0, 2);
		System.out.println(sbf);
		
		System.out.println();
		System.out.println();
		
		String s2=new String("SuryaNarayana");
		String s3=new String("SuryaNarayana");
		
		StringBuffer sbf1=new StringBuffer("SuryaNarayana");
		StringBuffer sbf2=new StringBuffer("SuryaNarayana");
		
		System.out.println(s2.equals(s3));
		System.out.println(sbf1.equals(sbf2));
		
	}
}
