package AdvancedJavacode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		String s="hi i am am am shubham";
		String  a[]=s.split(" ");


		Set<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for(String ss:set)
		{
			System.out.print(ss+" ");
		}
		
	
	
	//To print words in sentences in ascending order use Syntax collections.sort(list);
	
	
	
	
	
	
	
	
	
	
	}
}
