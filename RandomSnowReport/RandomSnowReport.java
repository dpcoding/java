/**
 * Lab 5A: RandomSnowReport.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/8/2013
 * -------------------------------
 * This program generates 15 double random numbers (in inches) 
 * in the range 0...20 and prints out the numbers and  
 * "*" representing an interval ofeach half inch of snow.
 */
 
import java.util.Random; 

/** Generate 10 random integers in the range 0..20. */
public final class RandomSnowReport 
{ 
	public static final void main(String[] args)
	{	
		//DecimalFormat df = new DecimalFormat("##.##");
	   
	   System.out.println("Paradise Mountain Snow Report");
		System.out.print("Day Inches Snow Fall Chart");
		 
	   // Create a random object
    	Random randomGenerator = new Random();
		for (int d = 1; d <= 15; ++d)
		{  
			//Generating 15 random integers in range 0..20." 	  			
			double randomDouble = (randomGenerator.nextDouble() * 20);
			System.out.printf("\n" + d + " %.2f ", randomDouble);
			for (double i = 0.5; i <= randomDouble; i += 0.5)// increment by 0.5
				System.out.print("*");
	   }
	    
	   System.out.println("\n\n******************************");
		System.out.println("*** Snow! Go snowboarding! ***");
		System.out.println("******************************");
  	}// end main
  
}