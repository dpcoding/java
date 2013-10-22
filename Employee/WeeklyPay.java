import java.util.Scanner;  // Needed for the Scanner class
import java.text.DecimalFormat; 
/**
 * This program uses the Employee class to
 * calculate employee's weekly pay.
 */

public class WeeklyPay
{
	public static void main(String[] args)
   {
		String name;
		double payrate;
		double pay;
		double totalSales, totalsales1;
		String employeeCode;
		int hr;
		
		totalSales = 24600;
		//totalSales = 17900;
		
		//Create DecimalFormat object for formating $22,345.99
		DecimalFormat d = new DecimalFormat("#,##0.00");
		
		//Create a Scanner object for keyboardeyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		/* START commenting out for easy testing 
		// get total sales
		System.out.print("Enter weekly total sales: ");
		totalSales = keyboard.nextDouble();
		keyboard.nextLine();// needed for the \n For nextDouble Scanner
		
		// Get name.
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		
		// Get Code
		System.out.print("Enter employee code: ");
		employeeCode = keyboard.nextLine();
		     
		// Get hours
		System.out.print("Enter hours: ");
		hr = keyboard.nextInt();	
		keyboard.nextLine();
		
		// Get rate.
		System.out.print("Enter the payrate: ");
		payrate = keyboard.nextDouble();
		
		// Create an instance of the Employee
      // class and pass the data to the constructor.
		// new object for Scanner 
		Employee dylan = new Employee(name, payrate, employeeCode, hr, totalSales);// user input object
		
		END commenting out for easy testing AND output below*/
		
		// tring getting different weekly sales method
		Employee weekly = new Employee(55555); 
		
		//use this easy testing
		Employee emp = new Employee("Allen", 10.00, "B", 41, totalSales);	
		Employee emp2 = new Employee("Pat", 10.00, "B", 10, totalSales);	
		Employee emp3 = new Employee("Chris", 10.00, "S", 10, totalSales);
		
		//those are for wee2
		Employee emp4 = new Employee("Chris S", 10.00, "S", 10, weekly.getWeeklyTotalSales(totalSales));
		Employee emp5 = new Employee("Chris B", 10.00, "B", 41, weekly.getWeeklyTotalSales(totalSales));
		
		// Display the pay report for the week1.
      System.out.println("Week1 Total Sales: $" + d.format(emp.getTotalSales()));
      System.out.println("---------------------------------------");
		//System.out.println(dylan.getName() + "\t\t&" + d.format(dylan.getWeeklyPay()));// user input result
		System.out.println(emp.getName() + "\t\t&" + d.format(emp.getWeeklyPay()));
		System.out.println(emp2.getName() + "\t\t&" + d.format(emp2.getWeeklyPay()));
		System.out.println(emp3.getName() + "\t\t&" + d.format(emp3.getWeeklyPay()));
		System.out.println("Total Wages: \t$" + d.format(emp.getWeeklyPay() + emp2.getWeeklyPay() + emp3.getWeeklyPay()));
		
		// Display the pay report for the week2.
		System.out.println("\nWeek2 Total Sales: $" + d.format(weekly.getWeeklyTotalSales(totalSales)));
      System.out.println("---------------------------------------");
		System.out.println(emp.getName() + "\t\t&" + d.format(emp.getWeeklyPay()));
		System.out.println(emp2.getName() + "\t\t&" + d.format(emp2.getWeeklyPay()));
		System.out.println(emp4.getName() + "\t\t&" + d.format(emp4.getWeeklyPay()));
		System.out.println(emp5.getName() + "\t\t&" + d.format(emp5.getWeeklyPay()));
		System.out.println("Total Wages: \t$" + d.format(emp.getWeeklyPay() + emp2.getWeeklyPay() + emp4.getWeeklyPay()+ emp5.getWeeklyPay()));
	}// end of main
	
}