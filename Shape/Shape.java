public abstract class Shape
{
	private int id;
	protected double length, width;
	
	public Shape(int identifier, double l, double w)
	{
		id = identifier;
		length = l;
		width = w;
	}
	
	public abstract double getArea();

	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}		
	
	public static void main(String[] args)
	{
		Triangle tri = new Triangle(1, 5, 6);
		Rectangle rect = new Rectangle(2, 6, 7);
		Square sq = new Square(3, 3);
		
		Shape[] shapes = new Shape[4];
		
		System.out.println("Square Area: " + sq.getArea());
		
	}
}	