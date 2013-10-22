import java.util.*;
import java.io.*;

public class ExceptionExample
{
	public static void main(String[] args)
	{
		String filePath; //this is for my computer file path to Lab 6 folder
		filePath = "C:/Users/Dylan/Documents/CS 162J/InClassExamples/"; //setting up to the lab folder.
		
		System.out.println("-------- Testing File Not Found Exception ---------");
		try
		{
			File f = new File(filePath + "spam.txt");
			Scanner inputFile = new Scanner(f);
			
			System.out.println("File opened successfully. " + f);
			
			int total = 0;
			while (inputFile.hasNext())
			{
				try
				{
					total += inputFile.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("Nonnumeric data found..." + 
											 "Skipping entry. ");
					inputFile.nextLine();//This allows app to read next lines
				}
			}
			System.out.println("Total: " + total);
		}
		catch (FileNotFoundException e)
		{
			//System.out.println("File not found.");
			System.out.println(e.getMessage());
		}
		
		
		// Another example
		System.out.println("\n-------- Testing Number Format Exception ---------");
		String str = "Hello world";
		int number;
		
		try 
		{
			number = Integer.parseInt(str);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Error." + e.getMessage());
		}
		
		System.out.println("Done.");
	}// end main
}