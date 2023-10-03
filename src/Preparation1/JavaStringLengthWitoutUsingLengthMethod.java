package Preparation1;
public class JavaStringLengthWitoutUsingLengthMethod {

	public static void main(String[] args) {
		
		String str ="Shubham";
		int i=0;
		for(char c:str.toCharArray())
		{
			i++;
		}
		System.out.println(i);
	}
}

    /*********
     * 2 way
     * String str ="Shubham";
		System.out.println(str.length());
		*/

         /*******
          * 3 way
          * String str ="Shubham";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		
		System.out.println(count);
		*/
