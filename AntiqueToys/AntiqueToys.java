import java.util.Scanner;

public class AntiqueToys
{
	private String description, maker;
	private int yearMade; 
	private double value;
	
	public AntiqueToys(String des, String m,  int year, double val)
	{
		description = des;
		maker = m;
		yearMade = year;
		value = val;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getMaker()
	{
		return maker;
	}

	public int getYearMade()
	{
		return yearMade;
	}

	public double getValue()
	{
		return value;
	}
	
	public void setDescription(String des)
	{
		description = des;
	}
	
	public void setMaker(String m)
	{
		maker = m;
	}

	public void setYearMade(int year)
	{
		yearMade = year;
	}

	public void setValue(double val)
	{
		value = val;
	}

	public void printAntiques()
	{
		System.out.println("Description Maker  Year Made Value");
		System.out.println("-------------------------------------");
		//System.out.println();
	}	
	
}