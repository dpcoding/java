import java.util.Scanner;   		// Needed for Scanner
import java.io.*;          		// Needed for File and IOException
import java.text.DecimalFormat; 	// Needed for format average

/**
 * Lab 6A: SummerWarming.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/14/2013
 * -------------------------------
 * The temperature data is in TemData.txt
 */

public class SummerWarming
{
   public static void main(String[] args) throws IOException
   {
		String filename, filePath; // File name
		int numInput;       // Number of friends
		double tem = 0; // temperature
		
		//Create DecimalFormat object for formating $22,345.99
		DecimalFormat d = new DecimalFormat("#,##0.00");
		
		// Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
		
		// Get the filename. // my file path: "C:/Users/Dylan/Documents/CS 161J/Lab6/lab6SummerWarming.txt"
		filePath = "C:/Users/Dylan/Documents/CS 161J/Lab6/"; //setting up to the lab folder.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine(); // variable filename can also be decleared here by add data type
		
		// Make sure the file exists.
      File file = new File(filePath + filename);
      while (!file.exists())
      {
         // Display an error message and ask for filename again.
         System.out.println("The file " + filename + " does not exist.");
         System.out.print("Please re-enter the filename: ");
      	filename = keyboard.nextLine();
			file = new File(filePath + filename); // added this (no File) so it checks filename again.
      }
		//System.out.println("Yep, we got the file you entered.\n");
		System.out.println();
		// Open the file.
		Scanner outputFile = new Scanner(file); // KEY --- new FileReader(filePath + filename)
      //PrintWriter outputFile = new PrintWriter(filePath + filename); //for writing to file
		
		//------------------------Start of user input temperatures------------------------------//
		/*	Don't know if we need to get temperatures from keyboard as instrument readings
			But good practice I guess. */
			
		/* Get the number of input temperatures.
      System.out.print("How many numbers of temperatures are you entering? (or enter 0 to the next step) ");
      numInput = keyboard.nextInt();
		
      // Consume the remaining newline character.
      keyboard.nextLine();
		
		while (numInput != 0)
		{
			// Get data and write it to the file.
	      for (int i = 1; i <= numInput; i++)
	      {
	         // Get the name of a friend.
	         System.out.print("Enter the temperature(°F) " + i + ": ");
	         tem = keyboard.nextDouble();
	         // Write the name to the file.
	         outputFile.println(tem);
	      }
		}*/
		//------------------------End of user input temperatures------------------------------//
		
		int count = 0;
		double sum = 0;
		double max = 0;
		double min = 106;
		// Read lines from the file until no more are left.
      while (outputFile.hasNext())
      {
			// Read the next temperature.
		   tem = outputFile.nextDouble();
			if (tem > -15.1 && tem < 105.1)
			{
				sum += tem; 
		      // Display the temperature read.
				System.out.println(tem);
				count++;
				if	(tem < min)
				{
				 	min = tem;
				}	
				if(tem > max)
				{
					max = tem; 
				}
			}
			
      }

		System.out.println("\nTotal number of valid temperatures collected is: " + count);
		System.out.println("The average temperature is: " + d.format(sum / count));
		System.out.println("The highest temperature is: " + max);
		System.out.println("The lowest temperature is: " + min);// min is wrong
		// Close the file.
      outputFile.close();
      //System.out.println("Data written to the file: " + filename);

	
		//System.out.print(filename);
	}// end of main
}