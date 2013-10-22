
import java.text.DecimalFormat;
import java.util.*;

public class BankBalance
{
    public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02;      //2% annually
    public static void main(String[] args)
    {
        double balance;
        Scanner keyboard =  new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("$#0.##");
        System.out.print("Enter your checking account balance: $");
        balance = keyboard.nextDouble( );
        System.out.printf("Original balance $ %.2f\n",balance);

        if (balance >= 0)
            balance = balance + (INTEREST_RATE * balance)/12;
        else
            balance = balance - OVERDRAWN_PENALTY;
 
        System.out.println("After adjusting for one month");
        System.out.println("of interest and penalties,");
		  System.out.println("your new balance is: " + fmt.format(balance));
		
        System.out.printf("your new balance is $ %.2f\n",balance );   // Using printf
    }
}

