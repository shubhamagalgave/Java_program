package Preparation;

public class NumberOfDigitInNumber
{
	public static void main(String[] args) {
		int num = 123456789;
		int count=0;
	
		while(num>0)
		{
			num=num/10;      //number is divided by 10 so that last digit will eliminate
			count++;
		}
		System.out.println(count);
	}
}
