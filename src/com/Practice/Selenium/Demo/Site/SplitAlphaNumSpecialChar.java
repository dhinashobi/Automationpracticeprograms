package com.Practice.Selenium.Demo.Site;

public class SplitAlphaNumSpecialChar {

	public static void main(String[] args) {
	
		split("abcdE123@#!*^");
	}
	
	public static void split(String str) {
		
		StringBuffer num = new StringBuffer(), alpha = new StringBuffer(), special = new StringBuffer();
		
		for(int i=0; i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))){
				num.append(str.charAt(i));				
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
			alpha.append(str.charAt(i));	
			}
			else {
				
				special.append(str.charAt(i));
			}
			
		}
			
		System.out.println("Number: "+num);
		System.out.println("Alpha: "+alpha);
		System.out.println("Special: "+special);
	
	}
	
	
	
	
	

}
