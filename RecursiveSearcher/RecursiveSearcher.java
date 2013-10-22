import java.io.*;

/** 
 * CS 162J - Lab 7A Recursive Searcher.
 * @author Te-Feng (Dylan) Pan
 * Last edit: 6/7/2013
 * This program reads a series of integers from this binary file and 
 * creates a non-ordered array of int's.
 * The helper methods which recursively will find and return: 
 * 1) the smallest number, 
 * 2) the largest number, & 
 * 3) the sum of the numbers.  
 * Display each of these, followed by the complete array.
 */

public class RecursiveSearcher
{
    /* not recursion methods 
    public static int smallestNumber(int[] arr)
    {
    	int lowest = arr[0];
		for (int i = 1; i < arr.length; i++) // assign i = 1 so it won't compare first.
		{
			if (arr[i] < lowest)// change > to < to find the lowest (and will need to change variable name.
				lowest = arr[i];
		}
		return lowest;
    }
    
    public static int largestNumber(int[] arr)
    {
    	int highest = arr[0];
		for (int i = 1; i < arr.length; i++) // assign i = 1 so it won't compare first.
		{
			if (arr[i] > highest)// change > to < to find the lowest (and will need to change variable name.
				highest = arr[i];
		}
		return highest;
    } */
	
	/*public static int numberSum(int[] arr)
    {
    	int total = 0;   // Accumulator
		for (int i = 0; i < arr.length; i++)
		{
				total += arr[i];
		}
		return total;
    }*/
	
	// recursion methods
	public static int smallestNumber(int[] arr)
    {
    	
    	return smallest(arr, arr.length - 1);
    }
    
    public static int smallest(int[] list, int low) 
    {
    	if (low == 0) 
    	{
    		return list[0];
    	}
    	return Math.min(smallest(list, low - 1), list[low]);
    }

    public static int largestNumber(int[] arr)
    {
    	return largest(arr, arr.length - 1);
    }
    
    public static int largest(int[] list, int high) 
    {
    	if (high == 0) 
    	{
    		return list[0];
    	}
    	return Math.max(largest(list, high - 1), list[high]);
    }
    
    public static int arraySum(int[] arr)
    { 
    	return arrayRecSum(arr, 0, arr.length); 
    }
    
    public static int arrayRecSum(int[] arr, int low, int high) 
    { 

        if (low == high) 
           { return 0; }
        else  // low < high
           { return arrayRecSum(arr, low, high-1) + arr[high-1]; }
    }

    public static void main(String[] args) throws IOException
    {
    	//int count = 0;
    	//int number;
        boolean endOfFile = false; // End of file flag
        /* need to find out how to count the array */
        // Open the file as a binary file
        /*FileInputStream fileStream = new FileInputStream("Lab7ANumbers.dat");
        DataInputStream dataStream = new DataInputStream(fileStream);
        
        while (!endOfFile)
    	{	
        	try
            {
        		int[] numbers = new int[20]; // To hold a number and 
                for (int i = 0; i < numbers.length; i++)
            	{	//read to the array
            		numbers[i] = dataStream.readInt();
            		count++;
            	}
        		//read to count the number of int's in the file
        		//number = dataStream.readInt();
        		//count++;
            }
        	catch (EOFException e)
            {
                endOfFile = true;
            }	
    	}
        dataStream.close();*/
        
        FileInputStream fileStream1 = new FileInputStream("Lab7ANumbers.dat");
        DataInputStream dataStream1 = new DataInputStream(fileStream1);
        
        while (!endOfFile)
        {
            try
            {     	
            	// need to use arrayList to solve array size issue
                int[] numbers = new int[16]; // To hold a number and 
                for (int i = 0; i < numbers.length; i++)
            	{	//read to the array
            		numbers[i] = dataStream1.readInt();
            		//count++;
            	}
                
                System.out.println("The smallest number in the file: " + smallestNumber(numbers));
                System.out.println("The largest number in the file: " + largestNumber(numbers));
                System.out.println("The Sum of numbers in the file: " + arraySum(numbers));
                System.out.println("The values in the (Lab7ANumbers.dat) binary file: ");
                for (int i = 0; i < numbers.length; i++)
            	{
                	System.out.print(numbers[i] + ", ");
                }  
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception e)
            {
            	System.out.println(e.getMessage());
            }
        }        
        dataStream1.close();
    }
}
