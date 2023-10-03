package Preparation;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int ar[]= {1,1,2,3,4,4,5,5};
		
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i]==ar[j])
				{
					ar[i]=-1;
				}
			}
		}
		System.out.println("--------After removing Duplicates---------");
		
		for (int i = 0; i < ar.length; i++) 
		{
				if (ar[i]!=-1)
				{
					System.out.print(ar[i]+" ");
				}
		}
	}
}
/**
 * ---------------------------------------------------------------------------------------------------------------
 * remove duplicate from array
 * 
 * int a[]= {1,1,2,3,4,4,5,5};
	Set<Integer> set=new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) 
	{
		set.add(a[i]);
	}
	for(int e:set)
	{
		System.out.print(e+" ");
	}
	
 */

/*
 * ----------------------------------------------------------------------------------------------------------------------
 */

		//To remove Random element from array
		
  /****
  * Scanner ss=new Scanner(System.in);
	int a[]= {3,1,2,3,4,5};
	int i1=ss.nextInt();
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if (a[i]==i1)
			{
				a[i]=-1;
			}
		}
	}
	System.out.println("To remove random element from array");
	for (int i = 0; i < a.length; i++)
	{
		if (a[i]!=-1)
		{
			System.out.print(a[i]+" ");
		}
	}
	*/
	
//----------------------------------------------------------------------------------------------------------------------
// Write code to pull all 0 at the end.


/*****
 * before changing array  = 0 0 0 2 3 5 8 
 * After changing array  = 8 5 3 2 0 0 0 
 

Scanner ss=new Scanner(System.in);

int a[]={2,3,0,0,5,0,8};
int t=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++)
	{
		if (a[i]>a[j])
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
}
System.out.print("before changing array  = ");
for (int i = 0; i < a.length; i++)
{
	
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.print("After changing array  = ");
for (int j =a.length;j>0;j--) 
{
	System.out.print(a[j-1]+" ");
}

*/
//-----------------------------------------------------------------------------------------------------------------
/***
 * int a[]= {1,1,2,3,4,4,5,5};
		
		Map<Integer,Integer> set=new HashMap<Integer,Integer>();
		for (Integer e:a)
		{
			if (set.containsKey(e)) 
			{
				set.put(e,set.get(e)+1);
			}
			else {
				set.put(e,1);
			}
		}
		System.out.println(set);
		*/
//----------------------------------------------------------------------------------------------------------------------------------
/***
int a[]= {1,1,2,3,4,4,5,5};
Map<Integer,Integer> map=new HashMap<Integer, Integer>();

for (int i = 0; i < a.length; i++) 
{
	if (map.containsKey(a[i]))
	{
		map.put(a[i],map.get(a[i])+1);
	}
	else {
		map.put(a[i],1);
	}
}

for(Integer key :map.keySet())
{
	if (map.get(key)>1)
	{
	      System.out.println("dup="+key);
 	}
}
*/