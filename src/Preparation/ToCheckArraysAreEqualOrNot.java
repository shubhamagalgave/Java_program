package Preparation;
import java.util.Arrays;

public class ToCheckArraysAreEqualOrNot {
	public static void main(String[] args) {
		
		int a[]= {1,5,6,5};
		int b[]= {5,1,8,6};

		if (a.length==b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			
			boolean r=Arrays.equals(a, b);
			if (r==true)
			{
				System.out.println("Arrays are  equal");
			}
			else {
				System.out.println("Arrays are not equal");
			} 
		}
		else {
			System.out.println("Arrays are not equal");
		}
	
		
	}
}
//---------------------------------------------------------------------------------------------------------------------------
/***
 *Add Two Arrays or merge two array
 *int a[]= {4,3,2,1};
		int b[]= {9,8,7,6,5};
		
		int length=a.length+b.length;
		int c[]= new int[length];
		
		for (int i = 0; i < a.length; i++)
		{
			c[i]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			c[a.length+i]=b[i];
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
 */
//----------------------------------------------------------------------------------------------------------------------------
/***
int a[]= {1,2,3,4};
int b[]= {1,2,3,4};

boolean res =Arrays.equals(a, b);
System.out.println(res);
if(res==true)
{
	System.out.println("both arrays are equal");
}
else
{
	System.out.println("both arrays are not equal");
}


*/