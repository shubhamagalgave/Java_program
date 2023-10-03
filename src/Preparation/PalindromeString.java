package Preparation;
public class PalindromeString{

	public static void main(String[] args) {

		String s = "My";
		String org = s;
		String rev = "";

		for (int i = s.length(); i > 0; i--)
		{
			rev = rev + s.charAt(i-1);
		}
		System.out.println(rev);

		if (org.equals(rev))
		{
			System.out.println("Given String is palindrome String");	
		} 
		else
		{
			System.out.println("Given String is not palindrome String");	
		}
	}

}
/**********
 * 1 way to reverse the string
 * 
 * String s="dddd"; 
 * String org=s; 
 * String rev="";
 * 
 * for(int i=s.length();i>0;i--) 
 * { 
 * rev=rev+s.charAt(i-1); 
 * }
 * System.out.println(rev);
 * 
 * 
 * if(org.equals(rev)) 
 * { 
 * System.out.println("Given String is palindrome String");
 *  } 
 *  else
 *   {
 * System.out.println("Given String is not palindrome String");
 *  }
 * 
 * 
 * 
 * 
 * 2 way to reverse the String
 *  String s="dddd"; 
 *  String org=s; 
 *  String rev="";
 * 
 * StringBuffer sd = new StringBuffer(s); 
 * rev=rev+sd.reverse();
 * System.out.println(rev);
 * 
 * if(org.equals(rev))
 *  { 
 * System.out.println("Given String is palindrome String"); 
 * } 
 * else 
 * {
 * System.out.println("Given String is not palindrome String");
 *  }
 * 
 * 
 * 
 * /*** 3 way to reverse the string 
 * String s="madam"; 
 * String org=s; 
 * String rev="";
 * 
 * StringBuilder sd = new StringBuilder(s); 
 * rev=rev+sd.reverse();
 * System.out.println(rev);
 * 
 * 
 * if(org.equals(rev))
 *  { 
 * System.out.println("Given String is palindrome String"); 
 * } 
 * else
 *  {
 * System.out.println("Given String is not palindrome String");
 *  }
 * 
 */
