package com.Practice.Selenium.Demo.Site;

import java.util.LinkedHashSet;
import java.util.Set;

public class NoOfOccurancesVersion2 {
	
	public static int countv2(String a,String b) {
		
		int count =0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(0)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		String abc = "geeksforgeeks";		
		Set<String> s = new LinkedHashSet<String>();
		for(int i=0;i<abc.length();i++) {
			s.add(String.valueOf(abc.charAt(i)));
		}
		
		for(String val:s) {
		System.out.println("Character occurence of "+ val + " " + NoOfOccurancesVersion2.countv2(abc,val));
		}
	}
}
