import java.util.Scanner;

public class BankAccount
{
	private int pin;
	private double balance;
	
	public BankAccount(int id, double startBalance) throws NegativePINException, NegativeBalanceException
	{
		if (id < 0)
		{
			throw new NegativePINException(id);
		}
		if (startBalance < 0)
		{
			throw new NegativeBalanceException(startBalance);
		}
		balance = startBalance;		
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		BankAccount acct;
		boolean getUserInfo = true;
		while (getUserInfo)
		{
			System.out.println("Please enter your PIN: ");
			int pin = keyboard.nextInt();
			
			System.out.println("Please enter the startingBalance: ");
			double startBal = keyboard.nextDouble();
			
			try
			{
				acct = new BankAccount(pin, startBal);
				getUserInfo = false;
			}
			catch (BankAccountException e)
			{
				System.out.println(e.getMessage());
			}			
		}	
	}	
}	