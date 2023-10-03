package Preparation;

//Factorial number e.g:   5!=>5*4*3*2*1=120   or   1*2*3*4*5=120
public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=7;
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;//1 2  6  24 120
		}
		System.out.println(factorial);
	}
}

       /*******
        * 2 way to find factors of number (using while loop)
        * Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int factor=1;
		for(int i=num;i>0;i--)
		{
			factor=factor*i;
		}
		System.out.println(factor);
		*/

       /****
        * 3 way to find factorial number 
        * Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int factor=1;
		int i=num;
		while(i>0)
		{
			factor=factor*i;
			i--;
		}
		System.out.println(factor);
		*/
