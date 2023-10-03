package Preparation1;
import java.util.Scanner;

public class CodeToPrintOddNumberFromArray {

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5,6,7,8,9,1,0 };

		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]%2 != 0)
			{
				System.out.print(+a[i] + " ");
			}
		}

	}

}

     /***
      * 2 way
      * int a[]= new int[5];
		Scanner scan = new Scanner(System.in);
		for(int j=0;j<a.length;j++)
		{
			a[j]=scan.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	*/

        /******
         * 3 way
         * int a[]= {1,2,34,4,56,5};
		int i=0;
		while(i<a.length)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
			i++;
		}
	
	*/

         /********
          * 4 way
          * 
          * int a[]= {1,2,34,7,4,56,5};
		
		for(int element:a)
		{
			if(element%2!=0)
			{
				System.out.print(element+" ");
			}
			
		}
	*/
