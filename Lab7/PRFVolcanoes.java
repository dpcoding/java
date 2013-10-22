/**
 * Lab 7B: PRFVolcanoeses.java
 * Author: Te-Feng (Dylan) Pan
 * Last Modified: 03/17/2013
 * -------------------------------
 * Objectives: Understand passing Objects - making & using an equals, 
 * toString, compareTo methods, plus a copy constructor.
 * Please see Lab requirements.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Reports information of various volcanoes from around the world.
 */
public class PRFVolcanoes
{

	private String name, country, type;
	private int height, eruptYear;
	
	/**
	 * Constructor for PRFVolcanoes.
	 */
	public PRFVolcanoes(String nam, String cty, String typ, int hgt, int yr)
	{
		name = nam;
		country = cty;
		type = typ;
		height = hgt;
		eruptYear = yr;
	}
	
	/**
	 * Copy constructor for PRFVolcanoes.
	 */
	public PRFVolcanoes(PRFVolcanoes volc)
	{
		name = "Santa Maria";
		country = "Guatemala";
		type = "Strato";
		height = 12375;
		eruptYear = 2011;
	}
	
	/**
	 * Returns name of volcano.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns country/continent of volcano.
	 */
	public String getCountry()
	{
		return country;
	}
	
	/**
	 * Returns type of volcano.
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Returns height of volcano.
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * Returns last eruption year of volcano.
	 */
	public int getYear()
	{
		return eruptYear;
	}
	
	/**
	 * Prints out information about volcanoes with formatting
	 */
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("#,###");
		return this.getName() + " " + this.getCountry() + " " + formatter.format(this.getHeight()) +
			" " + this.getYear() + " " + this.getType();
	}
	
	/**
	 * Tests if volcanoes are equal
	 */
	public boolean equals(PRFVolcanoes volc)
	{
		if (volc.getName().equals(this.getName()) && volc.getCountry().equals(this.getCountry()) &&
			volc.getHeight() == this.getHeight())
			return true;
		else
			return false;	
	}
	
	/**
	 * Compares the height of two volcanoes
	 */
	public int compareTo(PRFVolcanoes volc)
	{
		if (this.getHeight() < volc.getHeight())
			return -1;
		else if (this.getHeight() == volc.getHeight())
			return 0;
		else// if (this.getHeight() > volc.getHeight())
			return 1;	
	}
	
	/**
	 * Tests all of this nifty volcano stuff.
	 */
	public static void main(String[] args)
	{
		String nameInput, countryInput, typeInput;
		int yearInput, heightInput;
		Scanner keyboard = new Scanner(System.in);
		
		//First volcano
		System.out.println("Enter first volcano name:");
		nameInput = keyboard.nextLine();
		System.out.println("Enter country/continent:");
		countryInput = keyboard.nextLine();
		System.out.println("Enter height in feet:");
		heightInput = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter year of last eruption:");
		yearInput = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter type/shape of volcano:");
		typeInput = keyboard.nextLine();
		PRFVolcanoes volc1 = new PRFVolcanoes(nameInput, countryInput, typeInput, heightInput, yearInput);
		
		//Second volcano
		System.out.println("Enter second volcano name:");
		nameInput = keyboard.nextLine();
		System.out.println("Enter country/continent:");
		countryInput = keyboard.nextLine();
		System.out.println("Enter height in feet:");
		heightInput = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter year of last eruption:");
		yearInput = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter type/shape of volcano:");
		typeInput = keyboard.nextLine();
		PRFVolcanoes volc2 = new PRFVolcanoes(nameInput, countryInput, typeInput, heightInput, yearInput);
		
		if (!volc1.equals(volc2))
		{
			if (volc1.compareTo(volc2) == -1)
				System.out.println(volc1.getName() + " is shorter than " + volc2.getName() + "!\n");
			else if (volc1.compareTo(volc2) == 0)
				System.out.println(volc1.getName() + " is the same height as " + volc2.getName() + "!\n");
			else if (volc1.compareTo(volc2) == 1)
				System.out.println(volc1.getName() + " is taller than " + volc2.getName() + "!\n");
		}
		else
			System.out.println("The volcanoes are equal!\n");
			
		System.out.println("Name Location Current Height Last Eruption Type/Shape");
		System.out.println(volc1);
		System.out.println(volc2 + "\n");			
		
		//Third volcano
		PRFVolcanoes volc3 = new PRFVolcanoes(volc1);
		
		if (!volc1.equals(volc3))
		{
			if (volc1.compareTo(volc3) == -1)
				System.out.println(volc1.getName() + " is shorter than " + volc3.getName() + "!\n");
			else if (volc1.compareTo(volc3) == 0)
				System.out.println(volc1.getName() + " is the same height as " + volc3.getName() + "!\n");
			else if (volc1.compareTo(volc3) == 1)
				System.out.println(volc1.getName() + " is taller than " + volc3.getName() + "!\n");
		}
		else
			System.out.println("The volcanoes are equal!\n");
			
		System.out.println("Name Location Current Height Last Eruption Type/Shape");
		System.out.println(volc1);
		System.out.println(volc3);	
		
	}
}