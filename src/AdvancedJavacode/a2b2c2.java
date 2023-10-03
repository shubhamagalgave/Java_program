package AdvancedJavacode;

import java.util.HashMap;
import java.util.Map;

public class a2b2c2 {

	public static void main(String[] args) {
		
		String s="aabbcc";
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		for(char c:s.toCharArray())
		{
			if (map.containsKey(c)) 
			{
				int t=map.get(c);
				t++;
				map.replace(c,t);
			}
			else {
				map.put(c, 1);
			}
		}
		for(Character key:map.keySet())
		{
			System.out.print(key+""+map.get(key));
		}
	

	}
}
