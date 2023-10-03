package Preparation;
public class ReverseTheNumber 
{
	public static void main(String[] args) 
	{
		//with help of append method also we can do
		int num =569;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);	
	}
}
/*********
 * 1 way to reverse the number
 * int num=1234;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;         //0*10 + 1234%4= 4        4*10 + 123%10=43          430+2=432       4320+1=4321  this statement will give last digit
			num=num/10;                    //1234/10=123              123/10=12                  12/10=1         1/10=0
			//num/10 is wrote becouse to eliminate last last digit
		}
		System.out.println(num);
		*/
/*****
 * 2 way to reverse the number
 *       int num =569;
		//first we convert number into string format for that we have to use  method String.valueOf(num);
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();  //we can store number only in StringBuffer type
		System.out.println(rev);
		*/

/******
 * 3 way to reverse the number
 *with help of append method also we can do
		int num =569;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);	
 */
		
