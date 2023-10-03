package Preparation1;
public class StringManupulationCommand {

	public static void main(String[] args) {
		String str="The rains have started here";
		String str1="The rains have started here";
		/****
		System.out.println(str.length());
		
		System.out.println(str.charAt(7));
		
		System.out.println(str.indexOf("s")); 
		
		System.out.println(str.indexOf("s", 9));
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));//it is important when we have to check string is contains perticular word or not
		
		//String comparison
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//Substring
		System.out.println(str.substring(0, 8));//start index and end index
		
		//trim
		String s="     Hello World    ";
		System.out.println(s.trim());//it will remove before and after space
		
		System.out.println(s.replace(" ", ""));
		
		String s1="12/12/2022";
		String s2="24/07/1998";
		
		System.out.println(s1.replaceAll(s1, s2));
		
		//split
		
		String test="Hello_world_Test_Selenium";
		String test1[]=test.split("_");
		for(int i=0;i<test1.length;i++)
		{
			System.out.println(test1[i]);
		}
		
		//Concatenation
		
		String s3="core";
		String s4="s";
		
		System.out.println(s3.concat(s4));
		*/
		//imp interview question asked
	
		String x="core";
		String y="s";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
	}

}
