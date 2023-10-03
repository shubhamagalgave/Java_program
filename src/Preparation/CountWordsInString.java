package Preparation;

public class CountWordsInString {

	public static void main(String[] args) 
	{
		String str = "Java Selenium TestNg";
		String str1[] =str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
			count++;
		}
		System.out.println(count);	
	}
}
/*******
 * 2 way to count number of words in a string
 *      String str = "Java Selenium TestNg";
		StringTokenizer st = new StringTokenizer(str," ");
		int count=0;
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
		*/
