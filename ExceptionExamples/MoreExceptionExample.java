import java.util.*;
import java.io.*;

public class MoreExceptionExample
{
	public static void main(String[] args)
	{
					   //01234
		String str = "hello";
		MoreExceptionExample.breakThings(str);
	}
	
	public static void breakThings(String str)
	{
		System.out.println(str.charAt(1));//If enter 5, StringIndexOutOfBoundsException: String index out of range: 5
	}
}