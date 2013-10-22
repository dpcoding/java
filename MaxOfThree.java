/**
 * MaxOfThree.java      
 * Demonstrates the use of nested if statements.
 */

import java.util.Scanner;

public class MaxOfThree
{
   // Reads three integers from the user and determines the smallest value.
   public static void main (String[] args)
   {
      int num1, num2, num3, max = 0;

      Scanner scan = new Scanner (System.in);

      System.out.println ("Enter three integers: ");
      num1 = scan.nextInt();
      num2 = scan.nextInt();
      num3 = scan.nextInt();

      if (num1 > num2)
         if (num1 > num3)
            max = num1;
         else
            max = num3;
      else
         if (num2 > num3)
            max = num2;
         else
            max = num3;

      System.out.println ("The largest number is: " + max);
   }
}
