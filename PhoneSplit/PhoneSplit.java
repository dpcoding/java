import java.util.StringTokenizer;

public class PhoneSplit
{
	public static void main(String[] args)
	{
		String phoneNumber = "541.556.9598, (719)391-8738, 303 258 8594";
		
		StringTokenizer st = new StringTokenizer(phoneNumber.trim(), ",. ()-");
		
		while (st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}