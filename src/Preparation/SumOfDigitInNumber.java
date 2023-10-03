package Preparation;


public class SumOfDigitInNumber {

	public static void main(String[] args) {
		int num =1998;  
		 int sum=0;
		while(num>0)
		{
			sum=sum+num%10;//  this statement give you last digit
			num=num/10; // this statement will eliminate last number
		}
		System.out.print(sum);
	}

}
