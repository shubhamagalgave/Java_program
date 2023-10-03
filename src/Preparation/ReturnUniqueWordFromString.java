package Preparation;

public class ReturnUniqueWordFromString {

	public static void main(String[] args) {
		
		String str="Java selenium Testng";
		System.out.println(str.substring(5,13));
	}
}
/****
 * //Capitalize two word from String
	String s="shubham";
	
	s=s.substring(0,1)+s.substring(1,3).toUpperCase()+s.substring(3);
	//s=s.substring(0,6)+s.substring(6).toUpperCase();
	System.out.println(s);
*/
/**
 //----------------------------------------------------------------------------------------------------------------------
  * important
/from given string convert upper to lower and vice versa
 * 	String s="jAvA";
		StringBuffer sb=new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
	
		if (Character.isLowerCase(s.charAt(i))) 
		{
		       sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
		}
		else if (Character.isUpperCase(s.charAt(i)))
		{
			sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
		}
		}
		System.out.println(sb);
	
 */
