package Preparation;

import java.util.Scanner;

public class FindLargestNumberFrom3Number { //ternary operartor in java

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c =scan.nextInt();
		
		//Ternary operator
		int large=a>b?a:b;
		int largest=large>c?large:c;
		System.out.println(largest);
	}

}
        /***
        * Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b  &&  c<a)
		{
		System.out.println("a is largest number :"+a);
		}
		else if(b>a  && b>c)
		{
		System.out.println("b is largest number :"+b);
		}
		else
		{
			System.out.println("c is largest number :"+c);
		}
		
         */

