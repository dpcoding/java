/**  
 * CircleComparison.java
 * Program to determine area of a circle.
 */

import java.util.*;
import java.text.DecimalFormat;

public class CircleComparison
{

    public static void main(String[] args)
    {
        final double TOLERANCE = .000001;
        double radius1, radius2; //in inches
        double area1, area2; //in square inches
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#0.00");
		  
        System.out.println("Enter the radius of a circle1 in inches:");
        radius1 = keyboard.nextDouble( );

        area1 = Math.PI * radius1 * radius1;   // area = 3.14159 * radius * radius;
                                       //           use a Named Constant for pi.
													
        System.out.println("Enter the radius of a circle2 in inches:");
        radius2 = keyboard.nextDouble( );
        area2 = Math.PI * radius2 * radius2;   // area = 3.14159 * radius * radius;
                                       //           use a Named Constant for pi.

       // first comparison
		 if ( area1 == area2)
	        System.out.println("The circles are the same size");
		  else
		    System.out.println("These circles are different");
		  
    // second comparison
		  if ( Math.abs(area1-area2) < TOLERANCE )
		    System.out.println("The circles are the same size");
		  else
		    System.out.println("These circles are different");
		    
        System.out.println("Circle1 of radius " + fmt.format(radius1) + " inches ");
        System.out.println("  and has an area of  " + fmt.format(area1) + " square inches");
        System.out.println("Circle2 of radius " + fmt.format(radius2) + " inches ");
        System.out.println("  and has an area of  " + fmt.format(area2) + " square inches\n");

        /*       Output using the printf instead of the  Decimal Format  */
        System.out.printf("A circle1 of radius %.2f inches\n", radius1);
        System.out.printf(" and has an area of %.2f square inches\n",area1);
        System.out.printf("A circle2 of radius %.2f inches\n", radius2);
        System.out.printf("and has an area of %.2f square inches\n",area2);

    }

}


