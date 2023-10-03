package Preparation1;
public class CodeToPrintEvenNumberFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,1,0};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(+a[i]+" ");
			}
		}

	}
}
       /****
        * 2 way
        * int a[]= {12,3,14,8,5,4,5};
		System.out.println();
		for(int element:a)
		{
			if(element%2==0)
			{
				System.out.print(element+" ");
			}
		}
	*/
        /*****
         * 3 way
         * int a[]= {12,3,14,5,8,4,5};
		int i=0;
		while(i<a.length)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			i++;
		}
	*/

         /*******
          * 
          * int a[]= new int[5];
		Scanner scan = new Scanner(System.in);
		for(int j=0;j<a.length;j++)
		{
			a[j]=scan.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	*/
