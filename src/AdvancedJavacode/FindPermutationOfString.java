package AdvancedJavacode;

class FindPermutationOfString{  
	public static void permutation(String s,String permutation)
	{
		if (s.length()==0)
		{
			System.out.println(permutation+" ");
			return;
		}
			for (int i = 0; i < s.length(); i++)
			{
			  	char c=s.charAt(i);
			    String newStr=s.substring(0,i)+s.substring(i+1);
		
		        permutation(newStr, permutation+c);
			}
		}
	
	public static void main(String[] args) {
		String s="abc";
		String permutation="";
		permutation(s,permutation);
		
	}

}
