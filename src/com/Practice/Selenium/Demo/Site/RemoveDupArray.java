package com.Practice.Selenium.Demo.Site;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class RemoveDupArray {
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		
		
		Set<T> set = new LinkedHashSet<T>();
		
		for (T val:list)
		{
			set.add(val);
		}
		/* set.addAll(list); */
		list.clear();
		list.addAll(set);
		return list;
		}
	public static void main(String[] args) {
		String [] a = new String [] {"Dhina","Dhina","Raghu","Raghu","Bagavath","Boopathi","Ramprasad","Madan","Zebra","Monkey","Monkey","Zebra",};		 
		ArrayList<String> list = new ArrayList<>(Arrays.asList(a));
		System.out.println("ArrayList with duplicates: "+ list); 
		 ArrayList<String> newList = removeDuplicates(list); 
		 Collections.sort(newList, Collections.reverseOrder());
		 System.out.println("ArrayList with duplicates removed: "+ newList); 
	}
	
		
}
