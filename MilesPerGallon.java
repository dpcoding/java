/**
 * MilesPerGallon.java
 * Purpose: Computes the mpg given start and end odometer readings, and the gallons used.   
 */

import java.util.*;
import java.text.DecimalFormat;

public class MilesPerGallon
{
   //  Computes the miles per gallon achieved given the gallons used and the odometer readings.
   public static void main (String[] args)
   {
      double gas, mpg;
      long odometer1, odometer2;
		
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat ("0.##");

      System.out.print ("Enter the gas used: ");
      gas = keyboard.nextDouble();
      System.out.print ("Initial odometer reading: ");
      odometer1 = keyboard.nextLong();
      System.out.print ("Final odometer reading: ");
      odometer2 = keyboard.nextLong();

      mpg = (odometer2 - odometer1) / gas;
      System.out.println ("Miles Per Gallon: " + fmt.format(mpg));
   }
}
