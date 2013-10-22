public class Bank
{
	private double[] accounts;
	private final int NUM_ACCOUNTS = 10;
	
	public Bank()
	{
		accounts = new double[NUM_ACCOUNTS];
		
		for(int i = 0; i < NUM_ACCOUNTS; i++)
		{
			accounts[i] = 500;
		}
	}
	
	public void printBalances()
	{
		for(double balance: accounts)
		{
			System.out.println(balance);
		}
	}
	
	public void resizeAccounts()
	{
		accounts = new double[2 * NUM_ACCOUNTS];
	}	
	
	public static void main(String[] args)
	{
		int[] pins, needles;
		
		pins = new int[5];
		needles = new int[5];
		
		for (int i = 0; i < 5; i++)
		{
			needles[i] = pins[i];
		}	
	
		Bank boa = new Bank();
		boa.printBalances();
		boa.resizeAccounts();
		boa.printBalances();
	}	
}	