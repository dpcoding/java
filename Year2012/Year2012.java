/**
 * Lab 5B: Year2012.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/14/2013
 * -------------------------------
 * The testing program is Year2012Tester.java
 */
  
 public class Year2012
 {
 	private int month, dayOfYear, numDays; 
	private int dayOfWeek;	
	
 	//default constructor
 	public Year2012()
	{
	
	}
	// constructor taks one arg
	public Year2012(int m)
	{
		month = m;
	}
	// constructor taks two args
	public Year2012(int m, int d)
	{
		month = m;
		dayOfYear = d;
	}
	
	// These are get methods, and each returns one argument 
	public String getMonthName(int month)
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

	public int getDaysInMonth(int month)
	{
        int year = 2012;
        int numDays = 0;

        switch (month) 
		  {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                //System.out.println("Invalid month.");
                break;
        }
		  //Comment out so you will not re-print in for loop in main when adding total days
        //System.out.println("Number of Days = " + numDays);
			return numDays;
	}
 
 	public int getDayOfYear(int month, int numDays)
	{
		int count = 1;
		while (count < month)
		{			
			dayOfYear += getDaysInMonth(count);
			count++;
		}
		dayOfYear += numDays;
		return dayOfYear;
	}
 
 	public String getDayOfWeek(int totalDays)
	{
		// Gosh...I think too much
		//if (!(totalDays % 7 == 0))
			dayOfWeek = totalDays % 7;
		//else
			//dayOfWeek = totalDays;
			
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
 }