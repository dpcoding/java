public class NegativeBalanceException extends BankAccountException
{
	public NegativeBalanceException()
	{
		super("Error: Negative balance");
	}
	
	public NegativeBalanceException(double balance)
	{
		super("Error: Negative balance " + balance);
	}	
}