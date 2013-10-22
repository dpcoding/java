import java.util.Scanner;  // Needed for the Scanner class
//import java.text.DateFormat;
//import java.util.Date;
/**
 * For Lab 7A
 * This program uses the Year2012 class.
 * Tt asks user inputs, month(mm) and day(dd), from keyboar using Scanner class,
 * validates input values and displays results: Month, Date, Julian Date and Day of the Week.
 * It also prints four different date formats.
 */
 
public class Year2012Tester
{
	public static void main(String[] args)
   {
		int month;
		int date;
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
		date = input.nextInt();
		input.nextLine();
		
		while ( date <= 0 || date > mm.getDaysInMonth(month))
		{
			System.out.print("Invalid date. Please re-enter a date (dd): ");
			date = input.nextInt();
		} 

		// a new object takes two (mm and dd)
		Year2012 dy = new Year2012();
		totalDays = dy.getDayOfYear(month, date);
		dayOfWeek = dy.getDayOfWeek(totalDays);
		
		System.out.println();
		System.out.println("---------------- RESULTS -----------------");
		//System.out.println("The month you entered is: " + monthString);
		//System.out.println("The date in the month you entered is: " + date);
		System.out.println("Data entered: \t\t" + monthString + " " + date);	
		System.out.println("Ordinal year date: \t" +  totalDays);
		System.out.println("The day of the week: \t" + dayOfWeek);
		System.out.println("------------------------------------------");
		System.out.println("Long Date Form: \t" + dy.LongDateForm(month, date));
		System.out.println("Short Date Form: \t" + dy.ShortDateForm(month, date));
		System.out.println("US Date Form: \t\t" + dy.USForm(month, date));
		System.out.println("Euro Date Form: \t" + dy.EuroForm(month, date));
	}//end of main
}
