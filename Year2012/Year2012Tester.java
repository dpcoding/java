import java.util.Scanner;  // Needed for the Scanner class
/**
 * This program uses the Year2012 class.
 * Tt asks user inputs, month(mm) and day(dd), from keyboar using Scanner class,
 * validate input values and displays results: Month, Date, Julian Date and Day of the Week.
 */
 
public class Year2012Tester
{
	public static void main(String[] args)
   {
		int month;
		int numDays;
		int totalDays = 0;
		String monthString;
		String dayOfWeek;

		// Create a Scanner object for keyboardeyboard input.
		Scanner input = new Scanner(System.in);
		
		// Get month
		System.out.print("Enter a month(mm): ");
		month = input.nextInt();
		input.nextLine();
		
		// a new object takes month 
		Year2012 mm = new Year2012();
		// get mm and assign to monthString
		monthString = mm.getMonthName(month);


		while (month < 0 || month > 12)
		{
			System.out.print("Invalid month. Please re-enter a month(mm): ");
			month = input.nextInt();
		}		
				
		// Get date of the month entered
		System.out.print("Enter a date of the month(dd): ");
		numDays = input.nextInt();
		input.nextLine();
		
		while ( numDays <= 0 || numDays > mm.getDaysInMonth(month))
		{
			System.out.print("Invalid date. Please re-enter a date (dd): ");
			numDays = input.nextInt();
		} 
			
		// a new object takes two (mm and dd)
		Year2012 dy = new Year2012();
		totalDays = dy.getDayOfYear(month, numDays);
		dayOfWeek = dy.getDayOfWeek(totalDays);
		
		System.out.println();
		System.out.println("---------------- RESULTS -----------------");
		System.out.println("The month you entered is: " + monthString);
		System.out.println("The date in the month you entered is: " + numDays);
		System.out.println("Result Output: " + monthString + " " + numDays);	
		System.out.println("The ordinal year date is: " +  totalDays);
		System.out.println("The day of Week is: " + dayOfWeek);
		
	}//end of main
}
