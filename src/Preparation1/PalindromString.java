package Preparation1;
import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String org_str = str;

		String rev = "";

		for (int i = str.length(); i > 0; i--) 
		{
			rev=rev+str.charAt(i-1);
		}
		System.out.println(rev);
		System.out.println(org_str);
		
		if (org_str.equals(rev)) 
		{
			System.out.println("String is palindrom string");
		}
		else
		{
			System.out.println("String is not palindrom string");
		}
		//This Program Is not Working*/


	}

}
