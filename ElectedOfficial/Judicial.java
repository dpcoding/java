import java.text.DecimalFormat;

public class Judicial extends ElectedOfficial
{
	private String courtType;
	private double annualSalary;
	
	public Judicial(String nam, String tit, int id, String beg, String end, String typ, double sal)
	{
		super(nam, tit, id, beg, end);
		courtType = typ;
		annualSalary = sal;
	}
	
	public Judicial()
	{
		super("Antonin Scalia", "Justice", 4, "September 26, 1986", "Incumbent");
		courtType = "Supreme";
		annualSalary = 210000.00;
	}
	
	public String getCourtType()
	{
		return courtType;
	}
	
	public double getAnnualSalary()
	{
		return annualSalary;
	}	
	
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("$###,##0.00");
		return "Name: " + getName() + 
				"\nTitle: " + getTitle() + 
				"\nID: " + getID() + 
				"\nTerm Begin: " + getTermBegin() + 
				"\nTerm End: " + getTermEnd() + 
				"\nCourt Type: " + getCourtType() +
				"\nAnnual Salary: " + dollar.format(getAnnualSalary()) + "\n";
	}
		
}