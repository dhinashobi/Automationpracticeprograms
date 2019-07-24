package com.Practice.Selenium.Demo.Site;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestPractice {

	private Scanner read;

	public static void reverseString() {
		
		
		String input = "abcd";
		String reverse = "";
		
		for (int i=input.length()-1; i>=0; i--)
		{
			
			reverse = reverse+input.charAt(i);
		}
		
		
		System.out.println("Reveresed string is: ");
		System.out.println(reverse);
		
	}
	
	public static void strbuffer() {
		
		
		/*
		 * Scanner read = new Scanner(System.in); // get the System input with Scanner
		 * class
		 * 
		 * 
		 * String str = read.nextLine(); //Store the users input in str value
		 */	
		/* StringBuffer sb = new StringBuffer("Dhina"); */
		
		  StringBuilder bf = new StringBuilder("DHINAKARAN"); //Creating string builder object with parameter of reverse string value
		 		
		System.out.println(bf.reverse()); //Print the reversed String with the help of reverse method
		
		
	}
	
	 public static void palindromeNumber() {
		
		int r,sum=0, temp; // declaring 3 integers
		
		int n = 3454; // Assign the input values to n
		
		temp = n; // store the n value into temp to compare the palindrome value
		
			while (n>0) {									//condition to reverse the number 
				
				
				r=n%10; //getting reminder
				
				sum = (sum*10) +r;
				
				n=n/10;
			}
			if(temp==sum)    
				   System.out.println("palindrome number ");    
				  else    
				   System.out.println("not palindrome");    
				
				
			}
		
		
	 void palindromeString() {
	
		
		System.out.println("Enter the string to check palindrome: ");	
		
		read = new Scanner(System.in);
		
		String str = read.nextLine();
		
		String temp = str;
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			
			reverse = reverse+str.charAt(i);
		}
	
		
		/*
		 * StringBuffer bf = new StringBuffer(str);
		 * 
		 * String cd = bf.reverse().toString();
		 */
		if (temp.equals(reverse))
			
		{
			
			System.out.println(str+" is palindrome");
		}
		else {
			
			System.out.println(str+" is not palindrome");
		}
			
			
		
		
	}
	
	public static void SplitWordAndNumber() {
		
		
		
		String a = "abcd1234";
		int i;
		
		for (i=0;i<=a.length();i++)
		{
			
			
			char c = a.charAt(i);
			
			if('0'<=c&&c<='9') 
				break;
			
			
		}
		
		String alphaPart = a.substring(0, i);
		String numberPart = a.substring(i);
		
		System.out.println(alphaPart);
		System.out.println(numberPart);
		
	}
	
	
	public static void fibonacciseries() {
		
		int i,sum;
		int t1 = 0;
		int t2= 1;
		
		for(i=0;i<=9;i++) {
			
			sum = t1+t2;
			t1=t2;
			t2=sum;
		System.out.println(sum);	
		}
		
		
		
	}
	
	public static void palindromenumber()	
	{
		
	int rem, sum = 0,n=59895,temp;
	temp =n;
	while (n>0) {
		
		rem = n%10;
		sum = (sum*10)+rem;
		n/=10;
	}
	
	if (temp==sum) {
		
		System.out.println(sum+" is palindrome");
	}
	else {
		
		System.out.println(sum+" is not palindrome");
	}
	}
	
	
	public static void stringToInt() {
		
		String a = "12345";
		int b =Integer.parseInt(a);
		
		System.out.println(b);
		http://toolsqa.com/automation-practice-switch-windows/
	}
	public static void intToString() {
		
		int a = 12345;
		String  b =String.valueOf(a);
		int e = Integer.parseInt(b);
		int c = 20;
		int d = c+e;
		
		System.out.println(d);		
	}
	
	public static void removeDuplicate() {
		
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		
	}
	
	
	public static void removeduplicatevalues() {
		
		String strwithdup = "afsjeadrffafvgdefeverhfgberAAad";
		char[] chars = strwithdup.toCharArray();
		Set set = new HashSet();
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates:" + strwithdup );
		for(char c : chars) {
			
			
			
			//*[@id="menu-item-1747"]/a
			
		}
		
		
	}
	
	public static void main(String[] args) {
	
		removeDuplicate();
		
	}
	

}
