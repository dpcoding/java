/**
 * File: TestBooleanInput.java
 * Description: demo's input of Boolean values 
 */
import java.util.*;

public class TestBooleanInput               
{  
 public static void main(String arg[])
 {
   Scanner keyboard = new Scanner(System.in);
   boolean okFlag;
	
  System.out.print("Enter a boolean value (false/true): ");
   okFlag = keyboard.nextBoolean();

  if (okFlag)
       System.out.println(" The flag is set to OK");
  else
      System.out.println("The flag is set to NOT OK");
 }
} 
