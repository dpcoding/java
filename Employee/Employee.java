/**
 * Lab 4B: Employee.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/8/2013
 * -------------------------------
 * This class holds values for all values and 
 * It calculates the weekly pay. 
 *	main is in WeeklyPay class
 */

public class Employee
{
	private String name;
	private double payrate, pay, totalSales;
	private String employeeCode;
	private double hr;
	
	/**
    *  The constructor accepts arguments for all fields.
    */
	// this should take only name, payrate, employeeCode.
	public Employee(String n, double r, String code, double h, double sales)
	{
		name = n;
		payrate = r;
		employeeCode = code;
		hr = h;
		totalSales = sales;
	}
	
	// new constructor for weekly pay might not be needed
	public Employee(double sales)
	{
		totalSales = sales;	
	}
	
	/* These are set methods accepts an argument */
	public void setName(String n)
	{
		name = n;
	}
	
	public void setPayRate(double r)
	{
		payrate = r;
	}
	
	public void setCode(String c)
	{
		employeeCode = c;
	}
	
	public void setHour(int h)
	{
		hr = h;
	}
	
	public void setTotalSales(double sales)
	{
		totalSales = sales;
	}
	
	/* These are get methods returning arguments */
	public String getName()
	{
		return name;
	}
	
	public double getRate()
	{
		return payrate;
	}
	
	public String getCode()
	{
		/*if (employeeCode.equals("B"))
			employeeCode = "B";
		else
			employeeCode = "S";*/
		return employeeCode;
	}
	
	public double getHour()
	{
		return hr;
	}
	
	public double getTotalSales()
	{
		return totalSales;
	}
	
	// method for getting weekly sales
	public double getWeeklyTotalSales(double sales)
	{
		return totalSales;
	}

	/***************************************
	this method needs to take those variable, 
	(double salse, double hr, String code)
	to calculate different weekly pay */
	public double getWeeklyPay()
	{
		//employeeCode = c;
		
		double pay, overtimePay; // holds the pay
		final double B = 500;
		if (employeeCode.equals("B"))
		{
			if (hr > 40)
			{
				//cal pay for the first 40 hours
				pay = 40 * payrate;
				//cal overtime pay at 1.5 times payrate
				overtimePay = (hr - 40) * (payrate * 1.5);
				// add the overtime pay to the regular pay
				pay += overtimePay;
			}
			else
				pay = hr * payrate;
		}
		else //if (employeeCode.equals("S"))
		{
			if (totalSales > 22000)
			{
				pay = hr * payrate + B;
			}
			else
				pay = hr * payrate;
		}
		
		return pay;
	}
	

}