package com.constructor;

public class CharDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "hi hyderabad hello";
		int count = 0;
	
		
		char ch[]=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
			for(int j=i+1;j<len;j++) {
				if(ch[i] == ch[j]) {
					ch[j]=ch[len-1];
					j--;
					len--;
				}
			}
			System.out.println(ch[i]+" No Count OF"+count);
			count=0;
		}*/
		int count=0;
		
		String words="hi Hello Hi Surya Ram Hello Hi Sriniva";
		String ch[]=words.split(" ");
		int len=ch.length;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
			for(int j=i+1;j<len;j++) {
				if(ch[i].equals(ch[j])) {
					ch[j]=ch[len-1];
					j--;
					len--;
				}
			}
			System.out.println(ch[i]+" No Count OF"+count);
			count=0;
		}

	}

}
