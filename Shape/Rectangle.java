public class Rectangle extends Shape implements Drawable, Comparable
{
	public Rectangle(int newID, double l, double w)
	{
		super(newID, l, w);
	}	
	
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(1, 4, 6);
		System.out.println(rect.getArea());
	}
}