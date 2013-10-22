public class Triangle extends Shape
{
	public Triangle(int newID, double l, double w)
	{
		super(newID, l, w);
	}
	
	public double getArea()
	{
		return .5 * getLength() * getWidth();
	}	
	
	public static void main(String[] args)
	{
		Triangle tri = new Triangle(1, 5, 6);
		
		System.out.println(tri.getArea());
	}
}