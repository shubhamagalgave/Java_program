package Preparation1;
import java.util.*;
public class ReversStringWithoutReversFunction {

	public static void main(String[] args) {
		String S="";
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		S=Scan.nextLine();
		
		System.out.println("after reverse the   string");
		
		for(int i=S.length();i>0;i--)
		{
			System.out.print(S.charAt(i-1));
		}
	}
}
