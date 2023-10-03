package Preparation;

import java.util.Scanner;

// Natural number must greater then 1
//which has only 2 factors 1 and itself
//prime number e.g 1,2,3,5,7

//19 => 1 & 19 => prime number
//28 => 1,2,4,7,14,28 => number is not prime number

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count=0;
		if(num>1)            //Natural number must greater then 1
		{
			for(int i=1;i<=num;i++)  //which has only 2 factors 1 and itself
			{
				if(num%i==0)                                                           //if(num%i==0){    it is also work 
					count++;//only one statement is there so we not wrote loop    or   //count++ }
			}                                                     
			if(count==2)                                               
			{                                                           
				System.out.println("number is  prime number");
			}
			else
			{
				System.out.println("number is not prime number");
			}
		}
		else
		{
			System.out.println("number is not prime number");
		}
	}
}
//for => while =>for conversion
//regular to Scanner => to regular