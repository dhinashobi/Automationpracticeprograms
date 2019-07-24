package com.Practice.Selenium.Demo.Site;


public class Practice123 {

	
	public static void fibonacciSeries() {
		// initializing the values
		int n1 =0, n2 =1, n3,i; 
		
		//print first 2 values 		
		System.out.println(n1);
		System.out.println(n2);
		
		//logic for the fibonacci  series, already print 2 values hence initialize from 2
		
		for(i=2;i<=15;++i) {
			
			n3=n1+n2;
			System.out.println(n3);
			
			//after looped system should consider n2 as n1 and n3 as n2
			n1 =n2;
			n2 =n3;
			
		
		}
		
		
	}
	
	
	public static void reverse() {
		
		StringBuffer a = new StringBuffer("Software TEESTING");
		
		System.out.println(a.reverse());
		
		
	}
	
	public static void reversenum(int num) {
		
		
		
		
		  while (num != 0) { 
		  int remainder = num % 10; 
		  System.out.print(remainder); 
		  num = num / 10; }
		 
	    System.out.println();
		
	}
	public static void main(String[] args) {
	
		reversenum(1200);


	}

}
