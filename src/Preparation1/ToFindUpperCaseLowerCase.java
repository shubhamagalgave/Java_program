package Preparation1;
 public class ToFindUpperCaseLowerCase {

	public static void main(String[] args) {
		
		String str1="AbDaLrZz";
		int upperCase = 0;
		int lowerCase=0;
		char[] ch=str1.toCharArray();
		for(char chh:ch)
		{
			if(chh>='A'&&chh<='Z')
			{
				upperCase++;
			}
			else if(chh>='a'&&chh<='z')
			{
				lowerCase++;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Uppercase  "+upperCase+"  Lowercase   "+lowerCase);
	}

}
     /*******
      * String s = "ShUbHam";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if (Character.isUpperCase(c[i]))
			{
				System.out.println("Uppercase   :" + c[i]);
			} else {
				System.out.println("LowerCase   :" + c[i]);
			}
		}
		*/

