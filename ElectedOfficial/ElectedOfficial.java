/*
 * CS 162J Lab 3 A: Elected Officials
 * Author: Te-Feng (Dylan) Pan
 */

public class ElectedOfficial
{
	protected String name, title, termBegin, termEnd;
	protected int employeeID;
	
	public ElectedOfficial(String nam, String tit, int id, String beg, String end)
	{
		name = nam;
		title = tit;
		employeeID = id;
		termBegin = beg;
		termEnd = end;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getID()
	{
		return employeeID;
	}
	
	public String getTermBegin()
	{
		return termBegin;
	}
	
	public String getTermEnd()
	{
		return termEnd;
	}
	
	public void setName(String nam)
	{
		name = nam;
	}
	
	public void setTitle(String tit)
	{
		title = tit;
	}
	
	public void setID(int id)
	{
		employeeID = id;
	}
	
	public void setTermBegin(String beg)
	{
		termBegin = beg;
	}
	
	public void setTermEnd(String end)
	{
		termEnd = end;
	}
	//override
	public String toString()
	{
		return "Name: " + getName() + 
				"\nTitle: " + getTitle() + 
				"\nID: " + getID() + 
				"\nTerm Begin: " + getTermBegin() + 
				"\nTerm End: " + getTermEnd() + 
				"\n";
	}						
	
	public static void main(String[] args)
	{
		Executive gov = new Executive("John Kitzhaber", "Governor", 0, "January 10, 2011", "Incumbent", "Democrat", 128000.00);
		ElectedOfficial sec = new ElectedOfficial("Ellen F. Rosenblum", "Attorney General", 1, "April 6, 2009", "February 1, 2013");
		Legislator sen = new Legislator("Bob Lee", "Senator", 2, "August 17, 2001", "January 10, 2009", "Republican", 6, 350.00, 500.00);
		Legislator rep = new Legislator();
		Judicial sup = new Judicial();
		Judicial jud = new Judicial("Nancy Jansons", "Senior Judge", 5, "January 3, 1995", "Incumbent", "County", 115000.00);
		
		System.out.println(gov);
		System.out.println(sec);
		System.out.println(sen);
		System.out.println(rep);
		System.out.println(sup);
		System.out.println(jud);
	}
}