package com.Practice.Selenium.Demo.Site;

import java.util.Scanner;

public class TestPractice2 extends TestPractice {

	@Override
	protected void palindromeString() {
		System.out.println("Enter a string; ");
		Scanner read = new Scanner(System.in);
		
		String str = read.nextLine();
		
		String temp = str;
		
		String reverse = "";
		
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
			
			
		}
		
		
		if (temp.equals(reverse)) 
		{
			
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		TestPractice tp2 = new TestPractice2();
		
		
		tp2.
	}

}
