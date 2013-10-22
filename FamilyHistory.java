// FamilyHistory.java
// Author: Te-Feng (Dylan) Pan
// Last Modified: 01/22/2013
// --------------------------
// This program reads in two people's names,
// city name, pet name, and animal type
// and prints them to the screen in a
// nicely story-formatted way.

import java.util.Scanner;

public class FamilyHistory
{
	public static void main(String[] args)
	{
		String lName, fName, city, animalType, petName;
		double height1, height2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter grandfather's last name:");
		lName = keyboard.nextLine();
		
		System.out.println("Please enter grandmather's first name:");
		fName = keyboard.nextLine();
		
		System.out.println("Please enter the city name they lived in:"); 
		city = keyboard.nextLine();
		
		System.out.println("Please enter the pet name:"); 
		petName = keyboard.nextLine();
		
		System.out.println("Please enter the animal type:"); 
		animalType = keyboard.nextLine();
		
		System.out.print(fName + " lived in a city named " + city + " many years ago. she had a " + animalType + "\n");
		System.out.print("named " + petName + ".\n");
		System.out.print(petName + " wandered away but was found by a fellow named Mr. " + lName + " who returned the\n");
		System.out.print(animalType + ".\n");
		System.out.print(fName + " was very happy that " + petName + " was home safely and that he brought\n");
		System.out.print("with him Mr. " + lName + ", with whom she lived happily ever after!");
	}
}

