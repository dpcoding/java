public class NegativePINException extends BankAccountException
{
	public NegativePINException()
	{
		super("Error: PIN must not be negative");
	}
	
	public NegativePINException(int pin)
	{
		super("Error: PIN must not be negative (Your entry: " + pin + ")");
	}	
}