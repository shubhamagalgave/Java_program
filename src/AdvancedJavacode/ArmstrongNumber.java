package AdvancedJavacode;

public class ArmstrongNumber {//123    1*1*1 + 2*2*2 + 3*3*3

	public static void main(String[] args) {
		
		
		int num=123;
		int org=num;
		int rem=0,count=0,sum=0,t=num;
		
		while(t!=0)
		{
			t=t/10;
			count++;
		}
		System.out.println(count);
		t=num;
		
		while(t!=0)
		{
			rem=t%10;
			sum+=(Math.pow(rem,count));
			t=t/10;
		}
		System.out.println(sum);
		
		if (org==num)
		{
			System.out.println("number is armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}

	}

}
