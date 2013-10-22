import java.io.*;

/**
 * CS 162J - Te-Feng (Dylan) Pan
 * Lab 4A: Chemistry Experiments Data Validation.
 */
 
public class ChemValidationMain
{
	public static void dataValidation(int[][] data) throws DataNegativeException, DataMaxException
	{
		int[] dataMax = {35, 55, 72, 75, 45, 100};
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] < 0)
				{
					throw new DataNegativeException(data[i][j]);
				}
				
				if (data[i][j] > dataMax[i])
				{
					throw new DataMaxException(data[i][j], dataMax[i]);
				} 
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException
   {
		  int[][] test = new int[5][7];      
        boolean endOfFile = false; // End of file flag

        FileInputStream fileStream = new FileInputStream("Lab4AData.dat");
        DataInputStream dataStream = new DataInputStream(fileStream);

        while (!endOfFile)
        {
            try
            {
                for (int i = 0; i < test.length; i++)
                {
                    for (int j = 0; j < test[i].length; j++)
                    {
                        test[i][i] = dataStream.readInt();
                    }
                }
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
        }

		boolean testingData = true;

		while(testingData)
		{
			try
			{
				dataValidation(test);
			}			
			catch (ChemValidationException e)
			{
				System.out.println(e.getMessage());
            testingData = false;
			}
      }
	}
}
