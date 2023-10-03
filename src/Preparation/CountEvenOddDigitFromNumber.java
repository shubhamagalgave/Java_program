package Preparation;
public class CountEvenOddDigitFromNumber {

	public static void main(String[] args) {
		
		int num=18568;
		int rem=0;
		int even=0;
		int odd=0;
		while(num != 0)
		{
			 rem = num %10;      //here we are getting last digit
			 
			 if(rem%2==0)       //
			 {
				  System.out.println("Even number are :"+rem);
				  even++;
			 }
			 else
			 {
				 
				 System.out.println("Odd number are :"+rem);
				 odd++;
			 }  
			      num=num/10;        //here we are eleminiting last digit
		}
		System.out.println("Even number count :"+even);
		System.out.println("Even number count :"+odd);
	}
}
     /******
      * 2 way to find even number from array
      * int rem=0;
		int even=0;
		int odd=0;
		for(int num=777868; num!= 0; num=num/10)
		{
			 rem = num %10;      //here we are getting last digit
			 
			 if(rem%2==0)       //
			 {
				  System.out.println("Even number are :"+rem);
				  even++;
			 }
			 else
			 {
				 
				 System.out.println("Odd number are :"+rem);
				 odd++;
			 }  
			     // num=num/10;        //here we are eleminiting last digit
		}
		System.out.println("Even number count :"+even);
		System.out.println("Even number count :"+odd);
       */
