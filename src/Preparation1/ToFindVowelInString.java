package Preparation1;
public class ToFindVowelInString {

	public static void main(String[] args) {
		String str="welcome";
		int count=0;
	      for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='u')
			{
				System.out.println(str.charAt(i)+"   at the index of   "+i);
				count++;
			}
		}
	      System.out.println(count);
	}
}

        /*******
         * String s="welcome";
	     int v = 0,nv=0;
		for(char c :s.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
			       System.out.println(c+" Vovel");
			       v++;
			}
			else
			{
				System.out.println(c+" not Vovel");
				nv++;
			}
		}
		System.out.println("Vovel count "+v);
		System.out.println("not Vovel count "+nv);
*/
