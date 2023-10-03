package Preparation1;

public class ToFindSpecialCharcterFromString {

	public static void main(String[] args) {
		
		String str="!@#$%^&*98965256()shubham";
		str=str.replaceAll("[a-z,0-9,A-Z]", "");
		int count=str.length();
		System.out.println(str);
		System.out.println("number of special characters are  :"+count);
	}
}
        /*******
         * 2 way
         * String str="wel@%&$#come";
		   int count=0;
	      for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='@'||str.charAt(i)=='%'||str.charAt(i)=='&'||str.charAt(i)=='$'||str.charAt(i)=='#')
			{
				System.out.println(str.charAt(i)+"   at the index of   "+i);
				count++;
			}
		}
	      System.out.println("number of special characters are  :"+count);
*/

     /*******
      * 3 way
      * String s="!@#$%^&*98965256()shubham";
		
		for(char c:s.toCharArray())
		{
			
			if(c=='!'||c=='@'||c=='$'||c=='#'||c=='%'||c=='^'||c=='&'||c=='*'||c==')'||c=='(')
			{
				
				System.out.print(c);
			}
		}
		*/
  