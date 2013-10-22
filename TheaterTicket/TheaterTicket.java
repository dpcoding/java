/**
 * CS 162J 
 * Lab 1: TheaterTicket.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 04/17/2013
 * -------------------------------
 * This program prompts a filename and student IDs from user input
 * and verifies ID#s from unsorted valid IDs that are loaded from the file, sn.txt.
 * The testing program is TheaterTicketTester.java
 */

public class TheaterTicket
{
	private String filename; 
	
	/**
	 * No-arg constructor
	 */
	public TheaterTicket()
	{
		filename = "";
	}
	
	/**
	 * This constructor accepts a String argument 
	 * assigned to the filename
	 */
	public TheaterTicket(String f)
	{
		filename = f;
	}
	
	public static void sort(int[] arr)
	{
		for (int start = 0; start < arr.length; start++)
		{
			int lowest = arr[start];
			int lowestIndex = start;
			// inf lowest value in remaining array
			for (int i = start+1; i < arr.length; i++)
			{
				if (arr[i] < lowest)
				{
					lowest = arr[i];
					lowestIndex = i;
				}
			}
			// need this temp varible to store and make swaping with start position
			int temp = arr[start];
			arr[start] = arr[lowestIndex];
			arr[lowestIndex] = temp;
		}
	}	
	
	public static boolean binaryFind(int[] arr, int value)
	{
		int low = 0;
		int high= arr.length-1;
		
		while (high >= low)
		{
			// need to find the middle first
			int middle = (high + low) / 2;
			if (arr[middle] == value)
			{
				return true;
			}
			
			if (arr[middle] < value)
			{
				low = middle + 1;
			}
			
			if (arr[middle] > value)
			{
				high = middle - 1;
			}
		}
		return false;
	}
	/*
	public static int[] getArry()
	{
		int[] ;
		return array;
	}*/

	
}