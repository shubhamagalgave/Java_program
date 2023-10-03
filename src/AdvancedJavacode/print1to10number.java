package AdvancedJavacode;

import java.util.Scanner;

public class print1to10number {

		int n=0;
		public void add(int n)
		{
		    if (n<=10)
		   {
			  System.out.println(n);
			  add(n+1);
		   }
		}
		public static void main(String[] args) {
		
			print1to10number d=new print1to10number();
			d.add(3);
			//if you want to step any number the you can use n is equal to that number and add same number
			//e.g you want 3 step then ==> n=3 & add(n+3)		
		}
	}
//-------------------------------------------------------------------------------------------------------------------------------
//2 step O/P  ==>>  2 4 6 8 10 12 14 16 18 20 


/***
 * class Demo {                                   //1 2 3 5 8 13
	
	public void add(int n)
	{
		if(n<=20) 
		{
		   System.out.println(n);
		   add(n+2);
		}
	}
	public static void main(String[] args) { 
		Scanner sss=new Scanner(System.in);
		Demo d=new Demo(); 
		d.add(2);
		}
	}
*/
