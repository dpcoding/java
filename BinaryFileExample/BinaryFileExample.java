import java.io.*;

public class BinaryFileExample
{
	public static void main(String[] args)
	{
		FileOutputStream fileStream = new FileOutputStream("dates.dat");
		DataOutputStream dataStream = new DataOutputStream(fileStream);
		
		dataStream.writeInt(345);
		dataStream.writeInt(456);
		dataStream.writeInt(-27);
		
		dataStream.close();
	}
	
	catch (IOException e)
	{
		System.out.println(e.getMessage());
	}
}		