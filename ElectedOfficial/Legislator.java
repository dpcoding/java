import java.text.DecimalFormat;

public class Legislator extends ElectedOfficial
{
	private String party;
	private int district;
	private double dailyPayRate, travelerDiemRate;
	
	public Legislator(String nam, String tit, int id, String beg, String end, String pty, int dst, double day, double diem)
	{
		super(nam, tit, id, beg, end);
		party = pty;
		district = dst;
		dailyPayRate = day;
		travelerDiemRate = diem;
	}
	
	public Legislator()
	{
		super("John Cook", "Superintendent of Public Instruction", 3, "January 10, 2009", "Incumbent");
		party = "Republican";
		district = 3;
		dailyPayRate = 533.33;
		travelerDiemRate = 555.00;
	}	 
	
	public String getParty()
	{
		return party;
	}
	
	public int getDistrict()
	{
		return district;
	}
	
	public double getDailyPayRate()
	{
		return dailyPayRate;
	}
	
	public double getTravelerDiemRate()
	{
		return travelerDiemRate;
	}
	
	public void setParty(String pty)
	{
		party = pty;
	}
	
	public void setDistrict(int dst)
	{
		district = dst;
	}
	
	public void setDailyPayRate(double day)
	{
		dailyPayRate = day;
	}
	
	public void setTravelerDiemRate(double diem)
	{
		travelerDiemRate = diem;
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
				"\nDistrict: " + getDistrict() +
				"\nDaily Pay: " + dollar.format(getDailyPayRate()) +
				"\nTraveler Diem Rate: " + dollar.format(getTravelerDiemRate()) + "\n";
	}
}