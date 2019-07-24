package com.Practice.Selenium.Demo.Site;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDupUsingSetArrray implements RemoveDupArraySet {
	
	@Override
	public Object[] removeduplicate(int[]array) {
		
	int end = array.length;

 HashSet<Integer> set = new HashSet<Integer>(end);
    for(int i = 0 ; i < end ; i++){
        set.add(array[i]);
    }
    int[] array1 = Arrays.copyOf(array, end);
    System.out.println(Arrays.toString(array1));
return set.toArray();
}
	
	@Override
	public String reverseStringUsingBuffer(String str) {
	
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);		
		return str;
		}

	
	@Override
	public int fibonacciseries() {
		
	int t1 = 1;
	int t2 = 1; 
	int sum = 0;
	System.out.println(t1);
	System.out.println(t2);
	for (int i = 0; i<7;i++){
	sum = t1+t2;
	System.out.println(sum);
	t1=t2;
	t2=sum;
	}
	return sum;
	}
	
	
	@Override
	public void triangleShape() {
		
		for (int i=0;i<5;i++) {
		for(int j=5-i;j>1;j--) {
			System.out.print(" ");
		}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Override
	public void getOccuringChar() {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
			String theString = "aaba"; 
			for (int i = 0; i < theString.length(); i++) { 
			if ( map.containsKey(theString.charAt(i))) { 
			map.put (theString.charAt(i), map.get(theString.charAt(i)) + 1 ); 
			} else { 
			map.put (theString.charAt(i), 1); 
			} 
			} 
			for(Map.Entry item:map.entrySet()) 
			System.out.println(item.getKey() + ": " + item.getValue()); 
			} 
		
	@Override
	public  int findMaximumNum(int[] numbers) {
		
	
		int maxSoFar = numbers[0];
		
		for(int num : numbers) {
			
			if(num>maxSoFar) {
			maxSoFar = num;
			}
		}
		return maxSoFar;
		}

	@Override
	public void palindrome(String str) {
		String temp = str;
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);	
		}
		System.out.println(reverse);
		
		if(temp.equals(reverse)) {
			System.out.println(reverse + "is palindrome");
		}
		else {
			System.out.println(reverse +"is not palindrome");
		}
				
	}
	
public static void main(String[] args) {
		
		RemoveDupArraySet duparr = new RemoveDupUsingSetArrray();

		/*
		 * int[] marks = { 125, 132, 995, 116, 110 };
		 * 
		 * int highest_marks = duparr.findMaximumNum(marks);
		 * System.out.println("The highest score is " + highest_marks);
		 */
		
		duparr.palindrome("DADDY");
	}
}


