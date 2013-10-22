import java.util.*;

public class StringCompare
{
	public static void main(String[] args)
	{
  	    Scanner keyboard = new Scanner(System.in);
	    String input1, input2;

	    System.out.print("Enter a string: ");
	    input1 = keyboard.nextLine();

  	    System.out.print("Enter another string: ");
	    input2 = keyboard.nextLine();
		
	    if (input1.compareTo(input2) > 0)
	        System.out.println("The first string is lexciographically greater than, ie. alphabetically after the second string ");
	    else
	    { 
		 	if (input1.compareTo(input2) < 0 )
	    		System.out.println("The first string is lexciographically less than, ie. alphabetically before the second string");
	      else
	         System.out.println("The two strings are the same");
       }
	}
}