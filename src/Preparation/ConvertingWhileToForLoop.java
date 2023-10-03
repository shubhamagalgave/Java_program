package Preparation;

import java.util.Scanner;

public class ConvertingWhileToForLoop {

	public static void main(String[] args) {
		/********
		int num = 1234;//                  here we are initialization number
		int rev = 0;
		for (;num != 0;)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;               // here we are doing increment/decrement
		}
		System.out.println(rev);*/
		
		//int num =1234;
		int rev=0;
		Scanner s= new Scanner(System.in);
		//for(int num =s.nextInt();num!=0;num=num/10)
			for(int num =6589;num!=0;num=num/10)
		{
			rev=rev*10+num%10;
			//num=num/10;
		}
		System.out.println(rev);

	}

}
