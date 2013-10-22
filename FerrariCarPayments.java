// FerrariCarPayments.java
// Author: Te-Feng(Dylan) Pan
// Last Modified: 01/22/2013
// --------------------------
// This program reads in an amount owed and monthly payments
// and prints out monthly interest paid, amount paid to principal
// and new balance to the screen.

import java.util.Scanner;
import java.text.DecimalFormat;
		
public class FerrariCarPayments
{
	public static void main(String[] args)
	{
		double monthlyPayment, outBalance, interest;
		interest = 0.0245;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the amount you owe:");
		outBalance = keyboard.nextDouble();
		
		System.out.println("Please enter your monthly payment amount:");
		monthlyPayment = keyboard.nextDouble();
		
		
		double monthlyInterestPaid = (interest / 12) * outBalance;
		//double.format("%.2f", monthlyInterestPaid);
		
		DecimalFormat doubleValue = new DecimalFormat("0.00");
		String formattedValue = doubleValue.format(monthlyPayment);
		
		double amountPaidPrincipal = monthlyPayment - monthlyInterestPaid;
		double newBalance = outBalance - amountPaidPrincipal;
		
		System.out.printf("The amount of the payment that goes to interest: %.2f\n", monthlyInterestPaid);
		System.out.printf("The amount of the payment that goes towards the amount owed: %.2f\n", amountPaidPrincipal);
		System.out.printf("The new balance owed: %.2f\n", newBalance);		
	}
}


