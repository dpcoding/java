import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program creates three instances(objects) of the AntiqueToys
 * class, store the values in each. Two objects' arguments are passed to the constructor
 * one is geting from user input.
 * Todo: $ format
 */



public class TestingToy
{
		
	public static void main(String[] args)
	{ 
		String description, maker;
		int yearMade; 
		double value;
		
		// can't and don't know how to make it work for $ sign.
		DecimalFormat c = new DecimalFormat("$00.00");
		
		// a reference object
		AntiqueToys anti;
		
		//Ccrate a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the antique?\n");
		description = keyboard.nextLine();
		
		System.out.print("Who made it?\n");
		maker = keyboard.nextLine();
		
		System.out.print("What year was it made in?\n");
		yearMade = keyboard.nextInt();
		
		System.out.print("How much value does it worth?\n");
		value = keyboard.nextDouble(); 
		
		anti = new AntiqueToys(description, maker, yearMade, value);
		
			
		AntiqueToys anti1 = new AntiqueToys("Electric Train", "Lionel", 1934, 495);
		AntiqueToys anti2 = new AntiqueToys("Handcar Coin Bank", "J&E Stevens", 1883, 2195);
		
		/*anti.setDescription("Electric Train");
		anti.setMaker("Lionel");
		anti.setYearMade(1934);
		anti.setValue(495.0);*/

		System.out.println("Description   	   Maker    	  Year Made   Value");
		System.out.println("--------------------------------------------------------");
		System.out.printf("%12s %10s %12d %12.2f\n", anti1.getDescription(), anti1.getMaker(), anti1.getYearMade(), anti1.getValue());
		//System.out.printf("%12.2f", Currency.format(anti1.getValue()));
		System.out.printf("%12s %12s %7d %12.2f\n", anti2.getDescription(), anti2.getMaker(), anti2.getYearMade(), anti2.getValue());
		System.out.printf("%12s %12s %12d %12.2f\n", anti.getDescription(), anti.getMaker(), anti.getYearMade(), anti.getValue());
		//System.out.print(Currency.format(value));
	}
}