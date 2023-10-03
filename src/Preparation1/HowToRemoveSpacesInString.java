package Preparation1;
public class HowToRemoveSpacesInString {

	public static void main(String[] args) {
		String s = "Java Selenium TestNG Mevan ";
		
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);
		

	}
}

       /********
        * 2 way with count of spaces
        * String s = "Java Selenium TestNG Mevan ";
		int a=s.length();
		s=s.replaceAll("\\s", "");
		int b=s.length();
		System.out.println(s);
		int count=a-b;
		System.out.println(count);
		*/
//---------------------------------------------------------------------------------------------------------------------
// one string is there but it contains multiple word but space between word is multiple so how multiple space replaced with one space
/****
String s="my name             is            shubham";
s=s.replaceAll("( )+", " ");
//or
//s=s.replaceAll("[ ]+", " ");
System.out.println(s);
*/