package com.Practice.Selenium.Demo.Site;

import java.util.regex.Pattern;

public class FindMaxNum {


		public static void main(String[] arg) 
		{ 
			
			int [] array = {12,10,54,98,1};
			
			int max = getMax(array);
			System.out.println("Max value "+max);
			int min = getMin(array);
			System.out.println("Min Value "+min);
			
		} 
		public static int getMax(int[] number) 
		{ 
		 int maxi = number[0];
		 
		 for (int i=0; i<number.length; i++) {
			 
			 if(number[i]>maxi) {
				 maxi = number[i];			 
			 }
			 
		 }
			return maxi;
		} 
		public static int getMin(int[] number) 
		{ 
			 int mini = number[0];
			 for(int i =0; i<number.length;i++) {
				 
				 if(number[i]<mini) {
					 
					 mini = number[i];					 
				 }
				 
			 }
			 
			 
			 
			 
			 return mini;
		} 

}
