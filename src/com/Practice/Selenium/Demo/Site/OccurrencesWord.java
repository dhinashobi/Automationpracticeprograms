package com.Practice.Selenium.Demo.Site;

public class OccurrencesWord {
	static int countOccurences(String str, char c)  
	{ 
	    // split the string by spaces in a 
	   
	    // search for pattern in a 
	    int count = 0; 
	    for (int i = 0; i < str.length(); i++)  
	    { 
	    // if match found increase count 
	    if (c==(str.charAt(i)))
	        count++; 
	    } 
	  
	    return count; 
	} 
	  
	// Driver code 
	public static void main(String args[])  
	{ 
	    String str = "GeeksforGeeks"; 
	    char c = 'e'; 
	    System.out.println(countOccurences(str, c)); 
	} 
	} 

