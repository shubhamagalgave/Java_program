package Preparation1;
import java.util.Scanner;

public class CodeToGetHighestNumberUsingArray{

	public static void main(String[] args) 
		{
			int arr[] = { 12,1, 45, 79, 98, 4665, 231 };
			int max = arr[0];

			for (int element : arr) {
				if (element > max) {
					max = element;
				}
			}
			System.out.println(max);
		}
	}

     /******
      * 2 way to get highest number from array(while loop)
      * int a[]= {1,2,8,3,9,4,5};
		int max=a[0];
		int i=0;
		while(i<a.length)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			i++;
		}
		
		System.out.println(max);

      */
      /********
       * 3 way to find highest number from array(for loop)
       * int a[]= {1,2,8,368,4,5};
		int max=a[0];
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	*/
    /*****
     * 4 way to find highest number from array(for each loop)
     * int arr[] = { 1, 45, 79, 98, 4665, 231 };
			int max = Integer.MIN_VALUE;

			for (int element : arr) {
				if (element > max) {
					max = element;
				}
			}
			System.out.println(max);
*/
      /****
       * 5 way to find higest number from array( using Scanner)
       * Scanner s = new Scanner(System.in);
		int a[]= new int[5];
		for(int j=0;j<a.length;j++) 
		{
			a[j]=s.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print(max);
		*/
