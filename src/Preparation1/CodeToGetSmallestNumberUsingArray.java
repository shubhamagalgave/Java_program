package Preparation1;
public class CodeToGetSmallestNumberUsingArray {

	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,5,6};
		int min=arr[0];
		for(int element : arr)
		{
			if(element<min)
			{
				min=element;
			}
		}
		System.out.println(min);
	}
}
          /****
           * 2 way to find largest number from array
           * int arr[] = { 1, 45, 79, 98, 4665, 231 };
		     int min = Integer.MAX_VALUE;

	       	for (int element : arr) 
	       	{
			if (element < min) 
			{
				min = element;
				
			 }
		     }
		    System.out.println(min);    
           */

           /****
            * 3 way to find min number from arry[using for loop]
            * int arr[] = { 5000, 45, 79,10, 98, 4665, 231 };
		      int min=arr[0];
		      for(int i=0;i<arr.length;i++)
		      {
		    	if(arr[i]<min)
			     {
				    min=arr[i];
			     }
		      }
	             	System.out.println(min);
            */

            /********
             * 4 way to find min number from array
             * int arr[] = { 5000, 45, 79,10,7, 98, 4665, 231 };
		       int min=arr[0];
		       int i=0;
		       while(i<arr.length)
	        	{
	     		if(arr[i]<min)
		    	{
				min=arr[i];
		     	}
		     	i++;
	         	}
	         	System.out.println(min);
	
             */
              /*******
               * 5 way to find min number from array(using Scanner)
               * Scanner s = new Scanner(System.in);
		         int arr[]= new int[5];
	           	for(int i=0;i<arr.length;i++)
		        {
		        	arr[i]=s.nextInt();
		        }
		
	          	int min=arr[0];
		        for(int element : arr)
		         {
		    	if(element<min)
		     	{
		  		min=element;
		     	}
	          	}
		       System.out.println(min);
               */


