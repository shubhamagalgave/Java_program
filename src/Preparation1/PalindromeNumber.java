package Preparation1;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num,org_Num,rev=0;
		Scanner Scan = new Scanner(System.in);
		 num=Scan.nextInt();
		
		 org_Num=num; 
		while(num!=0)	
		{
		       rev=rev*10+num%10;
		       num=num/10;       
		}
		if(org_Num==rev)
		{
			System.out.println("given number is Palindrome number");
		}
		else
		{
			System.out.println("given number is not Palindrome number");
		}

	}

}
