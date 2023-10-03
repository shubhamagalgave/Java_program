package Preparation;

public class PalindromeNumber3Ways
{
	public static void main(String[] args)
	{
		int num=123;
		int org=num;
		int rev=0;
		 while(num!=0)
		 {
			rev=rev*10+ num%10;
			num=num/10;
		 }
		 
		 System.out.println(rev);
		 
		 if(org==rev)
		 {
			 System.out.println("Given number is palindrome number");
		 }else
		 {
			 System.out.println("Given number is not palindrome number");
		 }
	
	}

}
     /****
      * 1 way to achive palindrme number
      * int num=8568;
		int org=num;
		StringBuffer sb = new StringBuffer(String.valueOf(num));//number is converted into string format stoared in sb varaible
		String rev="";
	    rev =rev+ sb.reverse();
		System.out.println(rev);
		String r="";
	    r=r+num;
	    if(r.equalsIgnoreCase(rev))
	    {
	    	System.out.println("Given number is palindrome number");
	    }
	    else
	    {
	    	System.out.println("Given number is not palindrome number");	 
	    	
	    }

      */

/***
 *      int num=565;
		StringBuilder sd = new StringBuilder();
		sd.append(num);
		String rev="";
		rev=rev+sd.reverse();
		System.out.println(rev);
		String org="";
		org=org+num;
		System.out.println(org);
		
		if(org.equals(rev))
		{
			System.out.println("Given no is palindrome number");
		}
		else
		{
			System.out.println("Given no is not palindrome number");
		}
 */

       /****
        * 5 way
        * int org=123;
		int org=num;
		int rev=0;
		 for(int num=123;num!=0;num=num/10)
		 {
			rev=rev*10+ num%10;
			
		 }
		 
		 System.out.println(rev);
		 
		 if(org==rev)
		 {
			 System.out.println("Given number is palindrome number");
		 }else
		 {
			 System.out.println("Given number is not palindrome number");
		 }
        */

