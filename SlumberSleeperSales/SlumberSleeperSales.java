import java.util.Scanner;   		// Needed for Scanner
import java.io.*;           		// Needed for File and IOException
import java.text.DecimalFormat; 	// Needed for price format

/**
 * Lab 6B: SlumberSleeperSales.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/16/2013
 * -------------------------------
 * The Stores' daily sales report files: S1.txt, S2.txt, S3.txt.
 * Price error file name would be ErrorStore#.txt, if the price error occours. 
 * ToDo: now it only writes the first error price in Error file and also only 
 * reads/writes once.
 */
 
public class SlumberSleeperSales
{
   public static void main(String[] args) throws IOException
   {
		String filePath; //this is for my computer file path to Lab 6 folder
		filePath = "C:/Users/Dylan/Documents/CS 161J/Lab6/"; //setting up to the lab folder.

		String filename, errorFile;
		double sum, price;
		int count;
		double max;
		double min;
		double dailySum = 0;
		
		//Create DecimalFormat object for formating $22,345.99
		DecimalFormat d = new DecimalFormat("###,##0.00");	
		//Create a Scanner object for keyboardeyboard input.
		Scanner keyboard = new Scanner(System.in);
		//get filename for each store
		for (int i = 1; i <= 3 ; i++)
		{
			System.out.print("Enter filename " + i + ": ");
	      filename = keyboard.nextLine();
			// Make sure the file exists.
	      File file = new File(filePath + filename);
	      while (!file.exists())
	      {
	         // Display an error message and ask for filename again.
	         System.out.println("The file " + filename + " does not exist.");
	         System.out.print("Please re-enter the filename " + i + ": ");
	      	filename = keyboard.nextLine();
				file = new File(filePath + filename);// add this so it reads and checks again.
				//keyboard.nextLine();
	      }
			//System.out.println("Yes, we found filename" + i + " " + filename + ", you entered.");
			System.out.println();
			// Open the file.
			Scanner outputFile = new Scanner(new FileReader(filePath + filename)); //page 308 Not working with just (filePath + filename)
	
			System.out.println("Slumber Sleeper Stores Daily Report");//Store report heading
			System.out.println("Store " + i);
			
			sum = 0; //assign those to 0 for each store
			count = 0;
			max = 0;
			min = 3457;// assign to the highest possible valid price
			// Read lines from the file until no more are left.
      	while (outputFile.hasNext())
      	{	
				// Read the next price.
		   	price = outputFile.nextDouble();
				if (price >= 20 && price <= 3456)
				{
					sum += price; 
					// Display the price read.
					System.out.println("$" + d.format(price));
					count++;					
					//check max and min
					if	(price < min)
					 	min = price;	
					if(price > max)
						max = price;			
				}//end if
				else
				{
					// Create error file, ErrorStore#.txt, with file path to lab 6 folder
					errorFile = filePath + "ErrorStore" + i + ".txt"; 
					// Make sure the file exists.
					File efile = new File(errorFile);
					if (!efile.exists())
					{	
						//Create a FileWriter object if error file does not exist 
						FileWriter fwriter = new FileWriter(efile, true);
						// Open the error report file.
	      			PrintWriter inputFile = new PrintWriter(fwriter);
						// Write the price to the file.
         			inputFile.println(price);
						//close error file
						inputFile.close();
					}
					else
					{
						/*********************
						Can only write the first error price to the file 
						**********************/
						// Open the error report file.
		      		PrintWriter inputFile = new PrintWriter(errorFile);
						// Write the price to the file.
         			inputFile.println(price);						
						//close error file
						inputFile.close();
					}				
					//System.out.println(errorFile);// just check if path is right.									
				}// end else											
				//System.out.println("Error price written to the file.");						
			}// end while
			dailySum += sum; // Add each store valid total sales and initialized to 0 on the top for sum of 3 stores		
			System.out.println("Total: $" + d.format(sum)); 
			System.out.println("Average: $" + d.format(sum/count) + ", Lowest: $" + d.format(min) + ", Highest: $" + d.format(max));
			System.out.println();
			
			// Close the sales file.
      	outputFile.close();
		}// end of for
		
		System.out.println("Slumber Sleeper Stores");
		System.out.println("Daily Average Sales $" + d.format(dailySum/3) + 
									", Total Sales: $" + d.format(dailySum));
		System.out.println();					
		//error report heading
		System.out.print("Slumber Sleeper Stores Daily Error Report");
		for(int i = 1; i <= 3 ; i++)
		{
			// print Store#:
			System.out.print("\nStore " + i + ": ");
			// Make sure the file exists.
			errorFile = filePath + "ErrorStore" + i + ".txt";
      	File error = new File(errorFile);			
      	if(error.exists())
			{
				// Read price in error file
				Scanner errorOutput = new Scanner(error);//page 308. new Scanner(new FileReader(errorFile));	Both work		
				while(errorOutput.hasNext())
	      	{	
					/*********************
					Can only read/print the first error price from file 
					**********************/
					// Read the next price.
			   	price = errorOutput.nextDouble();			
					System.out.print(price + ", ");
				}
				//Close the file.
      		errorOutput.close();				
			}
			else
			{
				System.out.print("No Errors.");
			}
			
			//keyboard.nextLine();
		}//end for
		
	}// end of main
}