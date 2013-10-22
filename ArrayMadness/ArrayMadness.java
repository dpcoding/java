import java.util.Scanner;

public class ArrayMadness
{
	public static void main(String[] args)
	{
		int[] array;
		int arraySize;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How big shall we make the array?");
		arraySize = keyboard.nextInt();
		
		array = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++)
		{
			System.out.println("Input number " + (i+1) + ":");
			array[i] = keyboard.nextInt();
		}
		
		for (int i = 0; i < arraySize; i++)
		{
			System.out.println("Number " + (i + 1) + ": " + array[i]);
		}	
	}
}