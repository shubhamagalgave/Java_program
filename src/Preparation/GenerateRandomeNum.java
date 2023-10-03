package Preparation;

import java.util.Random;

public class GenerateRandomeNum {

	public static void main(String[] args) {
		
		 //  1 Approch generate random number by random class
		
		   Random rand = new Random();
		
		   int randNum=rand.nextInt(1000);
		   System.out.println(randNum);
		
	       double randDoubleNum=rand.nextDouble();
		   System.out.println(randDoubleNum);
		  
		    Boolean randBool=rand.nextBoolean();
		   System.out.println(randBool);
		  
		/**
		 * Random num 2 approch
		System.out.println(Math.random());
		*/
	}

}
