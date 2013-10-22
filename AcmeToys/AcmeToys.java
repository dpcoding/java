import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 * Te-Feng (Dylan) Pan 
 * CS 162J - Lab 2 Problem B: Acme Toys.
 *  
 */
public class AcmeToys
{
    public static String getMonth(int mon)
	 
    {
        String month = "";

        switch (mon)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        DecimalFormat dollar = new DecimalFormat("$###,##0.00");
        File file = new File("SalesData.txt");
        Scanner inputFile = new Scanner(file);
        String line;
        double total = 0;

        System.out.println("Acme Daily Sales\nRegion Store Sales Date ");

        while (inputFile.hasNext())
        {
            line = inputFile.nextLine();

            StringTokenizer st = new StringTokenizer(line.trim(), "-,/");

            while (st.hasMoreTokens())
            {
                int region = Integer.parseInt(st.nextToken());
                int store = Integer.parseInt(st.nextToken());
                double sales = Double.parseDouble(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int day = Integer.parseInt(st.nextToken());
                int year = Integer.parseInt(st.nextToken());
                total += sales;
                System.out.println(region + " " + store + " " + dollar.format(sales) + " " + getMonth(month) + " " + day + ", " + year);
                System.out.println("Region 10 " + dollar.format(total) + "\n");
            }
        }
        System.out.println("Total Sales: " + dollar.format(total));

    }
}