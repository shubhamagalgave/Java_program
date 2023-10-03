package Preparation;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterInString{

	public static void main(String[] args){
		String s="shubhamagalgave";
		int total=s.length();
		System.out.println(total);
		int count = s.replace("a", "").length();
		System.out.println(count);
		int occurance=total-count;
		System.out.println("Occurance of a :"+occurance);
	}
}
/*********
 * public class Demo {

	public static void main(String[] args) {
		String s="shubham";
		int total=s.length();
		System.out.println(total);
		
		for(char c:s.toCharArray())
		{
			String s1=s.replace(c,' ');
			int a=s1.replace(" ", "").length();
			int sum=total-a;
			System.out.print(c+"="+sum+" ");
		}
	}
}
*/
//------------------------------------------------------------------------------------------------------------------------

/***
 * String S="ShubhamAgalgave";
		Map<Character, Integer> map= new HashMap<>();
		for (char c:S.toCharArray())
		{
			if (map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else 
			{
				map.put(c,1);
			}
		}
		System.out.println(map);
		
 */