package com.nexiilabs.excelsheet;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DateFormat {

	public static void main(String[] args) throws ParseException {

	/*	Date date = new Date();
		System.out.println(date);
		String input = "2019-02-16";

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM");
		Date strDate = formatter.parse(input);
		String fd = formatter.format(strDate);
		System.out.println(fd);
*/
		double x = 105;

		 
		  DecimalFormat df = new DecimalFormat();
		  df.setMaximumFractionDigits(2);
		  System.out.println(df.format(x));
		  int cell=1;
		  for(int i=0;i<=5;i++) {
			  System.out.println(cell);
			  cell+=3;
		  }
	}
}
