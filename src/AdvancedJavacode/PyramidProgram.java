package AdvancedJavacode;

public class PyramidProgram { 

	public static void main(String[] args) {
		
		
		
		      
	

  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
//---------------------------------------------------------------------------------------------------------------------
/***
 
    //         *****                             no of row(i)   star(j)
	//         ****                                  1         5
	//         ***                                   2         4
	//         **                                    3         3
	//         *                                     4         2
	//                                               5         1 
	//         formula                            j<5-i+1
	
	for (int i = 0; i <=5; i++) 
	{
		for (int j = 0; j <5-i+1; j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/
//---------------------------------------------------------------------------------------------------------------------
/*****
//         *                            no of row(i)   star(j)
//         **                                 1         1
//         ***                                2         2
//         ****                               3         3
//         *****                              4         4
//                                            5         5 
//         formula                           j=i

for (int i = 0; i <5; i++) 
{
	for (int j = 0; j <=i; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
*/
//---------------------------------------------------------------------------------------------------------------------
/***

//      *****                             no of row(i)   star(j)
//      ****                                   1         5
//      ***                                    2         4
//      **                                     3         3
//      *                                      4         2
//                                             5         1 
//      formula                               j<5-i+1

		
		for (int i = 0; i <=5; i++) 
		{
			for (int j = 0; j<5-i+1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}


*/
//------------------------------------------------------------------------------------------------------------------------
/***
//          *                             no of row(i)   no of spaces(k) star(j)
//         **                                1                 5           1
//        ***                                2                 4           2
//       ****                                3                 3           3
//      *****                                4                 2           4 
//                                           5                 1           5
//         formula                        k=5-i+1                         j<=i  



for (int i = 0; i <5; i++) 
{
	for (int k = 0; k <=5-i+1; k++) 
	{
		System.out.print(" ");
	}
	
	for (int j = 0; j <=i; j++) 
	{
		System.out.print("*");
	}
	System.out.println();
}
*/
//------------------------------------------------------------------------------------------------------------------------
/***
    //             *                             no of row(i)  no of spaces(k) star(j)
	//            ***                                1                5          1
	//           *****                               2                4          3
	//          *******                              3                3          5
	//         *********                             4                2          7
	//                                               5                1          9 
	//         formula                             k<=5-i+1        j<=2*i-1

	for (int i = 0; i <=5; i++) 
	{
		for (int k = 0; k <5-i+1; k++)
		{
			System.out.print(" ");
		}
		for (int j = 0; j <2*i-1; j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/
//------------------------------------------------------------------------------------------------------------------------
/***
                //        *********                             no of row(i)  no of spaces(k) star(j)
				//         *******                                  1                1          9
				//          *****                                   2                2          7
				//           ***                                    3                3          5
				//            *                                     4                4          3
				//                                                  5                5          1 
				//         formula                                 k<=i           j<11-2*i

				for (int i = 0; i <=5; i++) 
				{
					for (int k = 0; k <i; k++)
					{
						System.out.print(" ");
					}
					for (int j = 0; j <11-2*i; j++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}

 */


