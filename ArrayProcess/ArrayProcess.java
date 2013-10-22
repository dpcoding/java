import java.util.Scanner;

public class ArrayProcess
{
	public static void main(String[] args)
	{
		int[] fiveThings = {12, 33, 1, 6, 144};
		int fiveTotal = 0;
		double fiveAverage;
		double[] threeThings;
		double threeTotal = 0;
		double threeAverage;
		threeThings = new double[5];
		char[] sevenThings = {'a', 'e', 'o', 'u', 'i', 'y', 'q'};
		String[] twoThings;
		twoThings = new String[2];
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input five numbers: ");
		for(int i = 0; i < 5; i++)
		{
			threeThings[i] = input.nextDouble();
			input.nextLine();
		}	
		
		System.out.println("Input two words: ");
		for(int i = 0; i < 2; i++)
		{
			twoThings[i] = input.nextLine();
		}
		
		for(int i = 0; i < 5; i++)
		{
			fiveTotal += fiveThings[i];
		}
		
		fiveAverage = fiveTotal / 5;
		System.out.println("Average of 5 integers: ");
		System.out.println(fiveAverage);
		
		for(int i = 0; i < 3; i++)
		{
			threeTotal += threeThings[i];
		}
		
		threeAverage = threeTotal / 3;
		System.out.println("Average of 3 numbers: ");
		System.out.println(threeAverage);
		
		System.out.println("Highest letter: ");
		System.out.println(findHighest(sevenThings));
		
		System.out.println("Lowest letter: ");
		System.out.println(findLowest(sevenThings));
		
	}
	
	public static char findHighest(char[] arr)
	{
		char highest = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > highest)
				highest = arr[i];
		}
		return highest;
	}	
	
	public static char findLowest(char[] arr)
	{
		char lowest = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < lowest)
				lowest = arr[i];
		}
		return lowest;
	}
}	