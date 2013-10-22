/**
 * Lab 7A: Year2012.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/14/2013
 * -------------------------------
 * This programm asks/validates month(mm) and date(dd)from user input
 * and prints out month in String (January, etc) and date of the month
 * ordinal year date, day of the week, and 4 different date forms. 
 * The testing programm is Year2012Tester.java
 */
  
 public class Year2012
 {
 	private static int month, date, year; 
	//private int dayOfWeek;	
	private static int dayOfYear, dayOfWeek;
	private static String monthString;
	
 	//default constructor
 	public Year2012()
	{
	
	}
	// constructor takes one arg
	public Year2012(int m)
	{
		month = m;
	}
	// constructor takes two args
	public Year2012(int m, int d)
	{
		month = m;
		dayOfYear = d;
	}
	
	// These are get methods, and each returns one argument 
	public static String getMonthName(int month)
	{
	  String monthString;
	  switch (month) 
	  {
		case 1:  
			monthString = "January";
			break;
		case 2:  
			monthString = "February";
		   break;
		case 3:  
			monthString = "March";
		   break;
		case 4:  
			monthString = "April";
		   break;
		case 5:  
			monthString = "May";
		   break;
		case 6:  
			monthString = "June";
		   break;
		case 7:  
			monthString = "July";
		   break;
		case 8:  
			monthString = "August";
		   break;
		case 9:  
			monthString = "September";
		   break;
		case 10: 
			monthString = "October";
		   break;
		case 11: 
			monthString = "November";
		   break;
		case 12: 
			monthString = "December";
		   break;
		default: 
			monthString = "Invalid month";
		   break;
	  }
	  //System.out.println(monthString);
	return monthString;
	}

	public static int getDaysInMonth(int month)
	{
        year = 2012;
        int date = 0;

        switch (month) 
		  {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                date = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                date = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    date = 29;
                else
                    date = 28;
                break;
            default:
                //System.out.println("Invalid month.");
                break;
        }
		  //Comment out so you will not re-print in for loop in main when adding total days
        //System.out.println("Number of Days = " + date);
			return date;
	}
 
 	public static int getDayOfYear(int month, int date)
	{
		int count = 1;
		while (count < month)
		{			
			dayOfYear += getDaysInMonth(count);
			count++;
		}
		dayOfYear += date;
		return dayOfYear;
	}
 
 	public static String getDayOfWeek(int totalDays)
	{
		dayOfWeek = totalDays % 7;		
		// 01/01/12 = Sunday
		String day = "SUNDAY";
			
		switch (dayOfWeek)
		{
			case 1:
				day = "SUNDAY";
				break;
			case 2:
				day = "MONDAY";
				break;
			case 3:
				day = "TUESDAY";
				break;
			case 4:
				day = "WEDNESDAY";
				break;
			case 5:
				day = "THRUSDAY";
				break;
			case 6:
				day = "FRIDAY";
				break;
			case 0:
				day = "SATURDAY";
				break;
		}
		return day;
	}// end of getDayOfWeek()	
	
	//-----  Additional static methods for Lab 7a ---------------
	public static String LongDateForm(int month, int date)
	{
		String longDay = getMonthName(month) + " " + date + ", " + year;
		return longDay;
	}
	
	public static String ShortDateForm(int month, int date)
	{
		/*String aString ="123456789";
		String cutString = aString.substring(0, 4);
		// Output is: "1234"
		NEED to format to JUL instead of JULY
		*/
		String shortDay = date + " " + getMonthName(month) + " " + year;
		shortDay = shortDay.toUpperCase();
		return shortDay;
	}
	
	public static String USForm(int month, int date)
	{
		String usDay = date + "/" + month + "/" + year;
		return usDay;
	}
	
	public static String EuroForm(int month, int date)
	{
		String usDay = month + "/" + date + "/" + year;
		return usDay;
	}

 }