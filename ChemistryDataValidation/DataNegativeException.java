public class DataNegativeException extends ChemValidationException
{
	public DataNegativeException()
	{
		super("Error: Negative result");
	}
	
	public DataNegativeException(int result)
	{
		super("Data = " + result + " No negative data allowed.");
	}	
}
