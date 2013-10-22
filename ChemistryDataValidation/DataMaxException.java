public class DataMaxException extends ChemValidationException
{
	public DataMaxException()
	{
		super("Error: Result out of bounds");
	}
	
	public DataMaxException(int result, int dataMax)
	{
		super("Data: " + result + " Larger than Maximum Data Point: " + dataMax);
	}	
}
