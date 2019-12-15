package com.I8n;

import java.util.Locale;

/**
 * 
 * @author ACER
 *
 */
public class LocaleExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale.getDisplayLanguage() +"::::::::::::::"+locale.getDisplayCountry());
		Locale locale2=new Locale("pa","IN");
		System.out.println(locale2.getDisplayLanguage() +"::::::::::::::"+locale2.getDisplayCountry());
		String[] s1=Locale.getISOLanguages();
		for(String lan : s1) {
			//System.out.println(lan);
		}
		String[] s2=Locale.getISOCountries();
		for(String cou : s2) {
			//System.out.println(cou);
		}
		Locale[] s=Locale.getAvailableLocales();
		for(Locale l : s) {
			System.out.println(l.getDisplayCountry()+"       "+l.getDisplayLanguage());
		}
	}
}
