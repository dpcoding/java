/**
 *	Author: Dylan Pan 
 *	Last Modified: 03/8/2013
 *	This simple app writes data to a specified file.
 */
 
import java.util.Scanner;
import java.io.*;

public class FileExample
{
	public static void main(String[] args) throws IOException
	{
		int date = 21;
		PrintWriter file = new PrintWriter("test.txt");
		file.println("Hello, World!");
		file.println("Today is Febrary " + date + ".");
		file.close();
	}
}