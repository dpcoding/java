import javax.swing.*;

public class WindowExamples
{
	public static void main(String[] args)
	{
		final int WINDOW_WIDTH = 480;
		final int WINDOW_HEIGHT = 440;
		
		JFrame window = new JFrame("My First Window");
		
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Display the window
		window.setVisible(true);
	}
}