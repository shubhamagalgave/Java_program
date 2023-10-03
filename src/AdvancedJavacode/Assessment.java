package AdvancedJavacode;


public class Assessment {

	public static void main(String[] args) {
		String s="assessment";
		String ss="ss";
		int count=0;
		
		for (int i = 0; i <=s.length()-ss.length(); i++) 
		{
			if (s.substring(i,ss.length()+i).equals(ss))
			{
			   count++;
		    }
		}
		System.out.println(ss+"="+count);
		
//------------------------------------------------------------------------------------------------------------------------------
	//with method	
/**
 * String s="assessment";
		int count1=s.length();
		int count2=0;
		
	    count2=s.replaceAll("ss", "").length();
		int occ=count1-count2;
		System.out.println("ss="+occ/2);
 */
	}
}
//------------------------------------------------------------------------------------------------------------------------------
/****
 *      i/p  s="Shubham Agalgave";
 *      o/p  s="Smahbuh Aevaglag"
 *      
 *      String s="Shubham Agalgave";
		String org="";
		String s1[]=s.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			String ss=s1[i];
			StringBuffer sb =new StringBuffer(ss.substring(1,ss.length()));
			org=" "+ss.charAt(0)+sb.reverse();
			System.out.print(org);
		}
 */
//--------------------------------------------------------------------------------------------------------------------------
/***
DateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
Date d=new Date();

String date=dateformat.format(d);
System.out.println(date);
*/