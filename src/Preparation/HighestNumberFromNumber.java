package Preparation;

public class HighestNumberFromNumber {

	public static void main(String[] args) {
		
		    int num=12893;//highest number from all number
		    int max=0;
		    int rem=0;
		    while(num!=0)
		    {
		    	rem=num%10;//3
		    	if(rem>max)//
		    	{
		    		max=rem;
		    	}
		    	num=num/10;
		    }
		    System.out.println(max);
	}

}
//this program is our own program