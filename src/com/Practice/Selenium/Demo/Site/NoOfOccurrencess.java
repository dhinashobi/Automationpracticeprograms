package com.Practice.Selenium.Demo.Site;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class NoOfOccurrencess {

	
	public static int count(String str,String c) {
	
		int count= 0; 
		
		for(int i=0;i<str.length();i++) {
			
			if (str.charAt(i)==c.charAt(0)) {
				count++;
			}
			
			
		}
		return count;
}
	public static void main(String[] args) {
		String abc = "GeeksofGeeks";
		Set<String> s = new LinkedHashSet<String>();
		for(int i = 0; i<abc.length();i++) {
			s.add(String.valueOf(abc.charAt(i)));
		}
		System.out.println(s.toString());
		for(String val : s){
			System.out.println("Character occurence of "+ val + " " + NoOfOccurrencess.count(abc,val));

	}

}

}