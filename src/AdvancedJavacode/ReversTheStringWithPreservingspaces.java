package AdvancedJavacode;

public class ReversTheStringWithPreservingspaces {

	public static void main(String[] args) {
		
		String s="i love java";
		String rev="";
		String s1[]=s.split(" ");
		
		
		for (int i =s1.length-1;i>=0; i--) 
		{
			StringBuffer sb=new StringBuffer(s1[i]);
			System.out.print(sb.reverse());
			System.out.print(" ");
		}
		

	}

}
