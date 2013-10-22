/**
 * IfVowels.java     
 * Demo comparing three chars for the highest value
 */

import java.util.Scanner;

public class IfVowels
{
   //  Compares each vowel in a string.
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char high, med, low;
		
      System.out.println ("Enter a string of 3 characters - watch for case differences :");
      String str = keyboard.nextLine();

      if ( str.charAt(0) > str.charAt(1) )     
         if (str.charAt(0) > str.charAt(2) ) 
           { high = str.charAt(0);
             if (str.charAt(1) > str.charAt(2) )
              {  med = str.charAt(1);
                 low = str.charAt(2);
				  } 
             else
              {  med = str.charAt(2);
                 low = str.charAt(1);
				  } 
			  }		 
          else 
           {  high = str.charAt(2);
              med = str.charAt(0);
              low = str.charAt(1);
			   }	  
      else 
        if (str.charAt(1) > str.charAt(2) ) 
           { high = str.charAt(1);
             if (str.charAt(0) > str.charAt(2) )
              {  med = str.charAt(0);
                low = str.charAt(2);
				  }
             else
              {  med = str.charAt(2);
                 low = str.charAt(0);
				  }	 
				}	 
         else 
           {  high = str.charAt(2);
              med = str.charAt(1);
              low = str.charAt(0);
			  }	   
        

      System.out.print ("The numbers in order from low to high are: ");
      System.out.print (low + " ");
      System.out.print (med + " "); 
      System.out.println (high ); 
   }
}
