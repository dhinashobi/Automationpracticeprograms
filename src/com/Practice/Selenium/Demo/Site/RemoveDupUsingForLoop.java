package com.Practice.Selenium.Demo.Site;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDupUsingForLoop {

	public static void dupremovusingforloop(Integer[] array) {
		
		
		System.out.println("Original Array:" +Arrays.toString(array));
		
			
		Integer unique_elements = array.length;
		
		for(int i=0; i<unique_elements;i++)
		{
			
		for (int j=i+1;j<unique_elements;j++)	{
			
			
			if(array[i] == array[j]) {
				
				array[j] = array[unique_elements-1];
				unique_elements--;
				j--;
								
			}
			
		}
			
			}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
			}
		System.out.println();
		Integer [] array1 = Arrays.copyOf(array, unique_elements);
		
		
		Arrays.sort(array1,Collections.reverseOrder()); 
		
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
			}
		/* System.out.println(); */
		
         
		/*
		 * System.out.println();
		 * 
		 * System.out.println("---------------------------");
		 */
	}
	
	
	public static void main(String[] args) {
		
		dupremovusingforloop(new Integer [] {5,4,6,5,4,6,9,8,7});


	}

}
