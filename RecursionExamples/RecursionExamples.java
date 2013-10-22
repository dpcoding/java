public class RecursionExamples
{
	//Base version for checking the number
	public static int triangle(int n)
	{
		int total = 0;
		for (int i = 1; i <= n; i++)
		{
			//System.out.println("*");
			total += i;
		}
		return total;
	}
	 
	public static int recTriangle(int n)
	{
		if (n == 1) return 1;// base case
		return n + recTriangle(n - 1);//if n + recTriangle(n), it will repeatly on n
	}
	
	public static int fibonacci(int n)
	{
		if (n < 2) return 1;// Base case
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int power(int m, int n) 
	{
		if (n == 0) return 1;// Base case
		return power(m, n - 1) * m;   
	}
	
	// Another complex version of power
	public static int powerRec(int m, int n) 
	{
		if (n == 0) return 1;// Base case
		int recurse = power(m,n/2);
		if (n % 2 == 1)// Needed for numbers that are odd when divided	
			return m * recurse * recurse;  
		else
			return recurse * recurse; 
	}
	
	// this method helps user easily 
	public static int find(int[] array, int target)
	{
		return recBinarySearch(array, target, 0, array.length - 1);
	}
	
	public static int recBinarySearch(int[] array, int target, int low, int high)
	{
		if (low > high)
			return -1; //Base case; if not found, return -1
		int mid = (low + high) / 2;
		if (array[mid] == target)// if mid is the answer return mid
			return mid;
		if (array[mid] > target)// if mid > target, 
			return recBinarySearch(array, target, low, high - 1);
		else
			return recBinarySearch(array, target, mid + 1, high);
	} 
	
	//Using the method to call the following reverseString() for easy user input
	/*public static String printReverse(String str)
	{
		return reverseString(str);
	}
	
	public static String reverseString(String str)
	{	
		if (str.length() <= 1)
	       return str; // Base case
		if (str.length() != 0)
			str = reverseString(str.substring(1)) + str.charAt(0);
		return str;
	}*/
	
	//This prints out o
	/*public static String printReverse(String str)
	{
		return reverseString(str);
	}*/
	
	public static void reverseString(String str)
	{	
		if (str == null || str.length() == 0)// or, str.equals(""))
		{
			System.out.print("\n");
	       return; // Base case
		}
		System.out.print(str.charAt(str.length()-1));
		if (str.length() != 0)
			reverseString(str.substring(0,str.length()-1));
	}
	
	private static int count;
	public static void towersOfHanoi(int n)
	{	
		count = 0;
		recTowersOfHanoi(n, 'A', 'C', 'B');
	}
	
	private static void recTowersOfHanoi(int n, char start, char end, char mid)
	{	
		if (n == 0) return;
		recTowersOfHanoi(n - 1, start, mid, end);
		count++;
		System.out.println("Move disc " + n + " from " + start + " to " + end + " - Move Count: " + count);		
		recTowersOfHanoi(n - 1, mid, end, start);
	}
	
	public static void main (String[] args)
	{	
		int[] array = { 4, 5, 8, 10, 23, 34, 37, 45, 48, 51, 60, 67 };
		//System.out.println(find(array, 45)); // This will print out the index of the target location in array
		//recBinarySearch(array, 8, 0, array,length - 1);// this makes harder for user to use the method
		
		//System.out.println(triangle(4));
		//System.out.println(recTriangle(4));
		//System.out.println(fibonacci(4));
		
		//System.out.println(power(2, 4));
		//System.out.println(powerRec(2, 5));
		
		//String str = "Hello world!";
		//System.out.println("You are printing the word(s) of \"" + str + "\" backward.");
		//System.out.println("The result: " + printReverse(str));
		
		//reverseString("Paul");
		//reverseString("Dylan");
		
		//Tower of Hanoi testing
		System.out.println("------------ Tower of Hanoi --------------");
		towersOfHanoi(4);
		System.out.println("------------  	 The End    --------------");
		
		System.out.println("\nDone!");
	}
}