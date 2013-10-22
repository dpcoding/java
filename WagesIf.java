/**  
 * File: WagesIF.java    
 * Description: Demonstrates the use of an if-else statement. 
 */

import java.text.DecimalFormat;
import java.util.*;

public class WagesIf
{
   /**    Reads the number of hours worked and calculates wages. */
   public static void main (String[] args) 
   {
      final double RATE = 8.25;  // regular pay rate
      final int STANDARD = 40;   // standard hours in a work week
		Scanner keybd = new Scanner(System.in);
      double pay = 0.0;
      int hours;      

      System.out.print ("Enter the number of hours worked: ");
      hours = keybd.nextInt();
      System.out.println ();

      // Pay overtime at "time and a half"
      if (hours > STANDARD)
         pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
      else
         pay = hours * RATE;

      System.out.printf ("Gross earnings: $%.2f",pay);
   }
}
