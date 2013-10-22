import java.text.DecimalFormat;

public class Executive extends ElectedOfficial
{
	private String party;
	private double annualSalary;
	
	public Executive(String nam, String tit, int id, String beg, String end, String pty, double sal)
	{
		super(nam, tit, id, beg, end);
		party = pty;
		annualSalary = sal;
	}
	
	public Executive()
	{
		super("Barack Obama", "President", 0, "December 18, 2008", "Incumbent");
		party = "Democrat";
		annualSalary = 350000.00;
	}	
	
	public String getParty()
	{
		return party;
	}
	
	public double getAnnualSalary()
	{
		return annualSalary;
	}	
	
	public void setParty(String pty)
	{
		party = pty;
	}
	
	public void setAnnualSalary(double sal)
	{
		annualSalary = sal;
	}			
	
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("$###,##0.00");
		return "Name: " + getName() + 
				"\nTitle: " + getTitle() + 
				"\nID: " + getID() + 
				"\nTerm Begin: " + getTermBegin() + 
				"\nTerm End: " + getTermEnd() + 
				"\nParty: " + getParty() +
				"\nAnnual Salary: " + dollar.format(getAnnualSalary()) + "\n";
	}	
		
}