/**
 * Lab 4A: CarOrder.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/8/2013
 * -------------------------------
 * This class holds all values and 
 * It calculates the weekly pay. 
 *	The main class is in CarOrderTest class
 */

public class CarOrder
{
   // Fields
	private String buyer;    
	private String carType;       
	private double cost, totalTax, totalCost; 
	private int quantity;
	private boolean taxStatus;
	
	private final double TAX = 0.0625;
   
   /**
    *  The constructor accepts arguments for
    *  all fields.
    */
   
	public CarOrder(String buy, String t, double c, int q, boolean status)
   {
      buyer = buy;
      carType = t;
      cost = c;
      quantity = q;
      taxStatus = status;
   }
	
	/**
    *  These are methods accepts an argument for
    *  the car order's buyer name and so on 
    */
   
   public void setBuyer(String buy)
   {
      buyer = buy;
   }

	public void setCarType(String t)
   {
      carType = t;
   }

	public void setCost(double c)
   {
      cost = c;
   }
	
	public void setQuantity(int q)
   {
      quantity = q;
   }
	
	public void setTaxStatus(boolean status)
   {
      taxStatus = status;
   }
	
	/**
    * The getBuyer method returns the name of
    * the car order's buyer.
    */
   
   public String getBuyer()
   {
      return buyer;
   }
	
	public String getCarType()
   {
      return carType;
   }

	public double getCost()
   {
      return cost;
   }

	public int getQuantity()
   {
      return quantity;
   }
	
	public double getTax()
	{
		return totalTax;
	}
	
	public double getSaleTax()
	{
		if (getQuantity() > 10 || getQuantity() < 20)
		{
			totalTax = (cost * quantity * .95) * TAX;
		}
		else if (getQuantity() > 20)
			totalTax = (cost * quantity * .9) * TAX;
		
		return totalTax;
	}
	
	public double getTotalCost()
	{
		if (getQuantity() > 10 || getQuantity() < 20)
			totalCost = (cost * quantity * .95) + totalTax;
		else if (getQuantity() > 20)
			totalCost = (cost * quantity * .9) + totalTax;
			
		return totalCost;
	}
	// (getTaxStatus() ? "Y" : "N")
	public boolean getTaxStatus()
   {
		if (!taxStatus)
			return false;
		else
		{			
			return true;
		}
   }
	/*
	public String printHeading()
	{
		System.out.println("Buyer\tCar\tCost\tQuantity\tTax Status");
		System.out.println("-------------------------------------------");
	}*/

	
}