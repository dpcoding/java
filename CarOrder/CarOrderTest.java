import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program uses the CarOrder class to
 * calculate and print report.
 * ToDo: second buyer name for keyboard input
 */
 
public class CarOrderTest
{
	public static void main(String[] args)
	{
		String buyer;    
		String carType;       
		double cost, totalTax; 
		int quantity;
		boolean taxStatus = false;		
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// commet out for easy testing
		// Get the buyer's name.
		System.out.print("Enter the buyer's name: ");
		buyer = keyboard.nextLine();
		
		// Get the car type.
		System.out.print("Enter car type: ");
		carType = keyboard.nextLine();
		
		// Get the car price.
		System.out.print("Enter the cost: ");
		cost = keyboard.nextDouble();
		
		// Get the number of cars.
		System.out.print("Enter the quantity: ");
		quantity = keyboard.nextInt();
		
		// Get the tat status.
		System.out.print("Enter tax status: ");
		taxStatus = keyboard.nextBoolean();
					
		// Create an instance of the CarOrder class,
		// passing the data that was entered as arguments
		// to the constructor.
		
		// those two objects, car and car1 for getting input from keyboard 
		CarOrder speedy = new CarOrder(buyer, carType, cost, quantity, taxStatus);
		
		// commet out for easy testing
		// Get the buyer's name.
		System.out.print("Enter the buyer's name: ");
		buyer = keyboard.nextLine();
		keyboard.nextLine();
		
		// Get the car type.
		System.out.print("Enter car type: ");
		carType = keyboard.nextLine();
		
		// Get the car price.
		System.out.print("Enter the cost: ");
		cost = keyboard.nextDouble();
		
		// Get the number of cars.
		System.out.print("Enter the quantity: ");
		quantity = keyboard.nextInt();
		
		// Get the tat status.
		System.out.print("Enter tax status (true or false): ");
		taxStatus = keyboard.nextBoolean();
		
		CarOrder zip = new CarOrder(buyer, carType, cost, quantity, taxStatus);
		
		
		//create DecimalFormat object for formating $22,345 
		DecimalFormat d = new DecimalFormat("#,##0");
		DecimalFormat d2 = new DecimalFormat("#,##0.00");
		
		//CarOrder speedy = new CarOrder("Speedy Rental", "Mini Cooper", 22150, 15, true); // getting from keyboard
    	//CarOrder zip = new CarOrder("Zip Car Co.", "Ford Fusion", 27495, 6, true);// getting from keyboard
		CarOrder state = new CarOrder("State Motor Pool", "Toyota Sienna", 28295, 10, false);
		CarOrder it = new CarOrder("IT Delivery Co.", "Sprinter Van", 32380, 25, true);
		
		System.out.println("Buyer\t\t\tCar\t\tCost\t\tQuantity\tTax Status");
		System.out.println("-------------------------------------------------------------------------------------");
		
		// those two print outs for getting input from keyboard
		/*System.out.println(car.getBuyer() + "\t" + car.getCarType() + "\t$" + d.format(car.getCost()) +
							"\t" + car.getQuantity() + "\t" + car.getTaxStatus()); 
		System.out.println(car1.getBuyer() + "\t" + car1.getCarType() + "\t$" + d.format(car1.getCost()) +
							"\t" + car1.getQuantity() + "\t" + car1.getTaxStatus()); */
		//	will need to comment next two out for getting input from user			
		System.out.println(speedy.getBuyer() + "\t\t" + speedy.getCarType() + "\t$" + d.format(speedy.getCost()) +
								"\t\t" + speedy.getQuantity() + "\t\t" + (speedy.getTaxStatus() ? "Y" : "N"));
		System.out.println(zip.getBuyer() + "\t\t" + zip.getCarType() + "\t$" + d.format(zip.getCost()) +
								"\t\t" + zip.getQuantity() + "\t\t" + (zip.getTaxStatus()? "Y" : "N"));
		System.out.println(state.getBuyer() + "\t" + state.getCarType() + "\t$" + d.format(state.getCost()) +
								"\t\t" + state.getQuantity() + "\t\t" + (state.getTaxStatus()? "Y" : "N"));
		System.out.println(it.getBuyer() + "\t\t" + it.getCarType() + "\t$" + d.format(it.getCost()) +
								"\t\t" + it.getQuantity() + "\t\t" + (it.getTaxStatus()? "Y" : "N"));
		
		System.out.println("\nChicago Car Wholesalers\n Oct. 30th, 2012\nNew Car Order Report\n");
		
		System.out.println("Buyer\t\t\tCar\t\tCost per Car\tQuantity\tCost\t\tSales Tax\tTotal Cost");
		System.out.print("------------------------------------------------------------------------------------------------------------------");
		
		System.out.print("\n" + speedy.getBuyer() + "\t\t" + speedy.getCarType() + "\t$" + d.format(speedy.getCost()) +
								"\t\t" + speedy.getQuantity() + "\t\t$" + d2.format(speedy.getCost()*.95 * speedy.getQuantity()) + 
								"\t$" + d2.format(speedy.getSaleTax()) + "\t$" + d2.format(speedy.getTotalCost()));
		System.out.print("\n" + zip.getBuyer() + "\t\t" + zip.getCarType() + "\t$" + d.format(zip.getCost()) +
								"\t\t" + zip.getQuantity() + "\t\t$" + d2.format(zip.getCost()*.95 * zip.getQuantity()) + 
								"\t$" + d2.format(zip.getSaleTax()) + "\t$" + d2.format(zip.getTotalCost()));
		System.out.print("\n" + state.getBuyer() + "\t" + state.getCarType() + "\t$" + d.format(state.getCost()) +
								"\t\t" + state.getQuantity() + "\t\t$" + d2.format(state.getCost()*.95 * state.getQuantity()) + 
								"\t$" + d2.format(state.getSaleTax()) + "\t$" + d2.format(state.getTotalCost()));
		System.out.print("\n" + it.getBuyer() + "\t\t" + it.getCarType() + "\t$" + d.format(it.getCost()) +
								"\t\t" + it.getQuantity() + "\t\t$" + d2.format(it.getCost()*.95 * it.getQuantity()) + 
								"\t$" + d2.format(it.getSaleTax()) + "\t$" + d2.format(it.getTotalCost()));
	}// end of main

}
