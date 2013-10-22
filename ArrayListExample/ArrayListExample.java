import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(17);
		
		String word = (String) list.get(1);
		
		System.out.println(word);
	}
}	