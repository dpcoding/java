public class TwoDeeArrays
{
	public static void main(String[] args)
	{
		int [][] grades;
		grades = new int[15][5];
		
		for (int row = 0; row < 15; row++)
		{
			for (int col = 0; col < 5; col++)
			{
				grades[row][col] = 100;
			}
		}
		
		for (int row = 0; row < 15; row++)
		{
			for (int col = 0; col < 5; col++)
			{
				System.out.print(grades[row][col] + " ");
			}
			System.out.println();
		}		
	}
}