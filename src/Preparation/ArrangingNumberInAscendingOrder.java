package Preparation;
import java.util.Arrays;
public class ArrangingNumberInAscendingOrder {

	public static void main(String[] args) {
		int a[]= {1,2,4,85,9,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.print(a[i]+" ");// to print number by ascending order or sorting the number
		} 
           System.out.println(a[a.length-1]);//with the help of it            
	}
}
      /***********
       * 2 way 
       * int a[]= {17,25,12,39,48,59};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		//System.out.println("num="+a[a.length-2]);
		*/
