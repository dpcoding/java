import java.util.StringTokenizer;


public class StringWork
{
	public static void main(String[] args)
	{
		/*Character c = new Character('h');
		System.out.println(c);*/
		
		/*char c = 'H';
		if (Character.isDigit(c))
			System.out.println("This is a digit.");
		if (Character.isLetter(c))
			System.out.println("This is a letter.");
		if (Character.isWhitespace(c))
			System.out.println("This is a white space.");*/
			
		/*String str = "3x8";
		
		char first = str.charAt(0);
		if (!Character.isDigit(first))
			System.out.println("Error!!!");
		if (str.charAt(1) != 'x')
			System.out.println("Error!!"); */
		
		/*String name = "Paul Wilkins";
		
		if (name.startsWith("Paul"))
			System.out.println(name + "starts with Paul"); */
			
		/*
		String[] classList = {"Banana", "Chris", "Patty", "Peter","Rubert",
									 "Erica", "Paul", "Steve"};
		
		for (int i = 0; i < classList.length; i++)
		{
			if (classList[i].startsWith("Pa"))
				System.out.println(classList[i]);
			
			if (classList[i].regionMatches(3, "Rodert", 3, 1))
				System.out.println(classList[i]);
				
			System.out.println(classList[i] + " " + classList[i].indexOf("na"));// indexOf returns -1 if not found or index
			
		}*/
			
		/*int index = classList[0].indexOf("na");
		System.out.println(index);
		while (index != -1)
		{
			index = classList[0].indexOf("na", index + 1);
			System.out.println(index);
		}*/
		
		/*
		// using substring()
		String name = "Paul Wilkins";
		
		int space = name.indexOf(" ");
		System.out.println(name.substring(space + 1));*/
		
		/*String team = "   Paul,Bob,Endwr,Marin,Joe     ";
		
		StringTokenizer st = new StringTokenizer(team.trim(), ",");
		
		while (st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		
		String[] tokens = (team.trim()).split(",");
		for (int i = 0; i < tokens.length; i++)
		{
			System.out.println(tokens[i]);
		}*/
		
		/*
		String phone = ("(415)555-5555, 541-1234-5678");
		StringTokenizer st = new StringTokenizer(phone.trim(), "-");
		String[] tokens = (phone.trim()).split("[-, ()]");
		for (int i = 0; i < tokens.length; i++)
		{
			System.out.println(tokens[i]);
		}*/
		
		/*StringBuilder builder = new StringBuilder("New");
		builder.append(" City");
		builder.insert(4, "York ");// York in between
		builder.replace(4, 13, "Mexico");// York City to Mexico
		
		
		String city = "New City";
		city = city.substring(0, 3) + " York" + city.substring(3);
		
		System.out.println(builder);//System.out.println(city);*/
		
		/* More info at Page 537 */
		StringBuilder str = new StringBuilder("I'm really really really excited!");
		System.out.println("Old String: " + str);
		
		String find = "really";	
		String replace = "very";
		//String strReplace = str.replace(find, replace);
		
		int index = str.indexOf(find);// get the index of the string to be found
		while (index != -1)// index will be -1 if the specified string not found
		{
			str.replace(index, index + find.length(), replace);
			index = str.indexOf(find);// get the index and whie loop keep searching from the current index.
		}
		System.out.println("New Replaced: " +str);
		
	}// end main
}