import javax.swing.*;

public class SecondWindow extends JFrame
{
	public SecondWindow()
	{
	 	super ("My Second Window");
		final int WINDOW_WIDTH = 480;
		final int WINDOW_HEIGHT = 440;
		
		//JFrame window = new JFrame("My First Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Display the window
		setVisible(true);
	}
	public static void main(String[] args)
	{
		SecondWindow myWindow = new SecondWindow();
	}
}
	
	