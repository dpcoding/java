public class ArrayAlgorithms
{
	public static void main(String[] args)
	{
		int[] scores1 = {99, 58, 74, 68, 81, 55};
		int[] scores2 = {99, 67, 74, 68, 81, 57, 88};
		
		if (arrayEqual(scores1, scores2) == true)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are different.");	
	}
	
	public static boolean arrayEqual(int[] arr1, int[] arr2)
	{
		boolean arraysEqual = true;
		
		if (arr1.length != arr2.length)
			arraysEqual = false;
			
		int i = 0;	
		while (arraysEqual && i < arr1.length)
		{
			if (arr1[i] != arr2[i])
				arraysEqual = false;
			i++;
		}
		
		return arraysEqual;
	}
	
	public static int findHighest(int[] arr)
	{
		int highest = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > highest)
				highest = arr[i];
		}
		return highest;
	}	
	
	/*public static int findLowest(int[] arr)
	{
		int lowest = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < lowest)
				lowest = arr[i];
		}
		return lowest;
	}*/
	
	public static boolean find(int[] arr, int value)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == value)
				return true;
		}
		return false;
	}
	
	public static boolean binaryFind(int[] arr, int value)
	{
		int low = 0;
		int high = arr.length - 1;
		while (high >= low)
		{
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
	
	public static void sort(int[] arr)
	{
	
		// outer loop
		for (int start = 0; start < arr.length; start++)
		{
			int lowest = arr[start];
			int lowestIndex = 0;
			
			// find lowest in remaining array
			for (int i = start + 1; i < arr.length; i++)
			{
				if (arr[i] < lowest)
					lowest = arr[i];
					lowestIndex = i;
			}
		}
		
		// swap lowest value with start position
		int temp = arr[start];
		arr[start] = arr[lowestIndex];
		arr[lowestIndex] = arr[temp];
	}	
}	