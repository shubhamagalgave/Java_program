package Preparation1;
public class ToFindArrayIsEmptyorNull {

	public static void main(String[] args) {
	int arr[]=null;
	if(arr==null)
	{
		System.out.println("Array is empty or null");
	}
	else
	{
		System.out.println("Array is not empty or null");
	}

	}
}
//-----------------------------------------------------------------------------------------------------------------------------
//	int num=123 and String s="123"; how do you compare the value

//first way
/***
 *      int num=123;
		String s="123";
		
		if (String.valueOf(num).equals(s)) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
 */
//-----------------------------------------------------------------------------------------------------------------------------
//int num=123 and String s="123"; how do you compare the value

//second way
/*****
 * int num=123;
		String s="123";
		
		if (Integer.valueOf(s)==num) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		*/
