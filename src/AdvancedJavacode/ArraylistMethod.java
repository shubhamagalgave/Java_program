package AdvancedJavacode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArraylistMethod {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//1. To add values in ArrayList
		list.add("Mango");
		list.add("Banana"); 
		ArrayList list1 = new ArrayList();
			
		list.add("shubh");
		list.add("labh"); 
			
		ArrayList al3 = new ArrayList();
		al3.add("John");
		al3.add("Rahul");
				
		//reterive(iterate) arraylist  (for ,for each and iterarator)
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		//2. replacing/updating/changing value in arraylist
		
		list.set(1,"ram");
		System.out.println(list);
		
		//3. sorting the arraylist
		
		Collections.sort(list);
		System.out.println(list);
		
		//4. Add to two arraylist
		
		list.addAll(list1);
		System.out.println(list);
		
		//5. Adding third list elements to the first list at specific position
		list.addAll(1,al3);
		System.out.println(list);	
		
		//6. Removing specific element from arraylist
		list.remove("Amba");  //removing by value
		list.remove(3);  //removing by index
		System.out.println(list);
				
		//7.Removing all the new elements from arraylist
		ArrayList al = new ArrayList();
		al.add("mi");
		list.addAll(al);
		System.out.println(list);
		list.removeAll(al);
		System.out.println(list);
		
		//8. Removing all the elements available in the list
		list.clear();
		System.out.println("After invoking clear() method: " + list);
	
		//8. to retain all the duplicate elements from two arraylists
		
		ArrayList<String> mi = new ArrayList<String>();
	 
		mi.add("i");
		mi.add("am");
		mi.add("from");
		mi.add("pune");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("i");
		al2.add("am");
		al2.add("from");
		al2.add("mumbai");
		mi.retainAll(al2);
		System.out.println("al list after retailAll(): "+mi);
		

		//9. to reverse all the elements from arraylists
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(15);
		l2.add(18);
	
		System.out.println("Elements of collection: "+l2);
		Collections.sort(l2);
		System.out.println("After sorting Elements of collection: "+l2);//
		Collections.reverse(l2);
		System.out.println("Reversing sorted Elements of collection: "+l2);
	
		
	}

}
