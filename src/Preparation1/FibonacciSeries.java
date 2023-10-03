package Preparation1;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c,count=10;
		for(int i=0;i<count;i++)
		{
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
		}

	}

}
/**
class Demo {                                   //1 2 3 5 8 13
public void add(int a,int b)
{
	if(a<=51)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		add(a,b);

	}
	
}
public static void main(String[] args) { 
	Scanner ss=new Scanner(System.in);
	
	Demo d=new Demo();
	d.add(0,1);
}
}}
*/