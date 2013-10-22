import java.io.*;
import java.util.Scanner;
import java.util.Arrays;	// added this for sorting/binarySearch arrays

/**
 * This program uses the TheaterTicket class
 */
// TODO: array size, binaryFind (sort) from my method. 
public class TheaterTicketTester
{
	public static void main(String[] args) throws IOException
	{
		String filename;
		String sID;
		String again; 
		
		//int[] studentNum = new int[6];
		
		// Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
		
		String filePath; //this is for my computer file path to Lab 6 folder
		filePath = "C:/Users/Dylan/Documents/CS 162J/Lab1/"; //setting up to the lab folder.
		
		System.out.print("Please enter the filename (sn.txt): ");
      filename = keyboard.nextLine(); // variable filename can also be decleared here by add data type
		
		// Make sure the file exists.
      File file = new File(filePath + filename);
      while (!file.exists())
      {
         // Display an error message and ask for filename again.
         System.out.println("The file \"" + filename + "\" does not exist.");
         System.out.print("Please re-enter the filename: ");
      	filename = keyboard.nextLine();
			file = new File(filePath + filename); // added this (no File) so it checks filename again.
      }
		
		// Open the file
		Scanner inputFile = new Scanner(file);
		// read the file contents into the array
		final int SIZE = 6;
		int index = 0;
		String[] studentNum = new String[SIZE]; //changed to String 
		
		while (inputFile.hasNext() && index < studentNum.length)
		{
			studentNum[index] = inputFile.nextLine();
			index++;
			//System.out.println(studentNum[index]);
		}
		System.out.println("Yep, we got the file you entered.\n");
		//System.out.println();
		
		// continue searching until 'N' or 'n' is entered.
		do
		{
			// Get student ID from input
			System.out.print("Enter the student ID (########): ");
			sID = keyboard.nextLine();
			//System.out.print("You Entered ID#: " + sID);
			
			//System.out.println(studentNum);
			
			//Sort the array
			Arrays.sort(studentNum); 
						
			/* // Print out the sorted array
			for (int i = 0; i < studentNum.length; i++)
			{
				System.out.println(studentNum[i]);
			}*/
			
			//boolean result = binaryFind(studentNum, sID);
			
			if (Arrays.binarySearch(studentNum, sID) >= 0)
			{
				System.out.println("The Student ID# " + sID + " you entered is a valid ID.");
			}
			else
			{
				System.out.println("The Student ID you entered is not a valid ID.");
			}
			
			// Consume the remaining newline
			keyboard.nextLine();
			
			// Ask if the user wants to search again
			System.out.print("Do you want to search again? (Y or N): ");
			again = keyboard.nextLine();
			
		}while (again.charAt(0) == 'y' || again.charAt(0) == 'Y');	
		
		// Close the file.
		inputFile.close();
	}


}