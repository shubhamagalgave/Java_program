package Preparation1;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str="happy birthday";
		char[] carray =str.toCharArray();
	
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carray[i]==carray[j])
				{
					System.out.print(carray[j]+"  ");
					break;
				}
			}
		}
	}
}

        /*********
		 * 2 way
		 * 	String s="";
		Scanner a= new Scanner(System.in);
		s=a.next();
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]+" ");
					count++;
				}
			}
			
		}
		System.out.println(count);
	*/

/*****
String s="happy birthday";

for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<s.length();j++)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			System.out.print(s.charAt(i)+" ");
		}
	}
}
*/
//--------------------------------------------------------------------------------------------------------------------

/***
 * Remove the duplicate character 
 * 
String s="happy birthday";
LinkedHashSet<Character> set = new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
for(Character ch:set)
{
	System.out.print(ch+" ");
}
*/

//--------------------------------------------------------------------------------------------------------------------
/**
 * To remove duplicate characters Without using set
 *
String s="happy";
char c[]=s.toCharArray();
for (int i = 0; i < c.length; i++) {
	for (int j = i+1; j < c.length; j++) {
		if (c[i]==c[j])
		{
			c[i]=' ';
		}
	}
}
for (int i = 0; i < c.length; i++) {
	if (c[i]!=' ')
	{
		System.out.print(c[i]+" ");
	}
}
*/
//---------------------------------------------------------------------------------------------------------------------------
/***
String s="happy";

HashMap<Character, Integer> map=new HashMap<>();
for(char c:s.toCharArray())
{
	if (map.containsKey(c)) {
		map.put(c,map.get(c)+1);
	}
	else {
		map.put(c,1);
	}
}
for(Entry<Character, Integer> m:map.entrySet())
{
	if (m.getValue()>1)
	{
		System.out.println(m);
	}
}
//----------------------------------------------------------------------------------------------------------------------
 * for(Character m :map.keySet())
		{
			if (map.get(m)>1)
			{
				System.out.print(m);
			}
		}
		
 */
