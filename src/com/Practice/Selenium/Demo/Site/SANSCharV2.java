package com.Practice.Selenium.Demo.Site;

public class SANSCharV2 {
	
	public static void sanscharv2(String abc) {
		
		
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), spl = new StringBuffer();
		
		for(int i=0;i<abc.length();i++) {
			
			if(Character.isAlphabetic(abc.charAt(i))) {
				
				alpha.append(abc.charAt(i));
			}
			else if(Character.isDigit(abc.charAt(i))) {
				num.append(abc.charAt(i));
			}
			
			else {
				spl.append(abc.charAt(i));
			}
			
		}
		System.out.println("String = "+alpha);
		System.out.println(num);
		System.out.println(spl);
	}
	public static void main(String[] args) {

		String  abc = "Dhisdfna123$%^*(&&)345345*";
		sanscharv2(abc);
		
	}

}
