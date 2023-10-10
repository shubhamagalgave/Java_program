package AdvancedJavacode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapIterator {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Shubham");
		map.put(2, "Shubham1");
		map.put(3, "Shubham2");
		map.put(4, "Shubham3");
		map.put(5, "Shubham4");
		map.put(6, "Shubham5");
		
		/***
		// Iterate hashmap through entryset() using iterator
		Iterator<Entry<Integer, String>> itr =map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		/***
		// Iterate hashmap through keyset() using iterator
		Iterator<Integer> itr =map.keySet().iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());	
		}*/
		/**
		// Iterate hashmap through keyset() using iterator
		for(Entry<Integer, String> ent:map.entrySet())
		{
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}*/
		Iterator<Entry<Integer, String>>itr =map.entrySet().iterator();
		
	
		
	}
}
