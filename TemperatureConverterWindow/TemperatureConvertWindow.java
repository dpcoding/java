import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  // needed for actionlistener

public class TemperatureConvertWindow extends JFrame
{
	private final int WINDOW_WIDTH = 480;
	private final int WINDOW_HEIGHT = 440;
	private JPanel panel;            	// A panel container
   private JLabel messageLabel;      	// A message to display
   private JTextField celciusInput; 	// To hold user input
   private JButton convert;       		// Performs calculation
	
	public TemperatureConvertWindow()
	{
	 	super ("My Temperature Convert Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		// Display the window
		setVisible(true);
	}
	
	private void buildPanel()
	{
		panel = new JPanel();
		messageLabel = new JLabel("Please enter a temperature in Celcius: ");
		celciusInput = new JTextField(8);
		convert = new JButton("Convert to Fahrenheit");
		
		convert.addActionListener(new ConvertButtonListener());
		
		panel.add(messageLabel);
		panel.add(celciusInput);
		panel.add(convert);
	}
	
	public class ConvertButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double fahrenheit;
			String text;
			//double celciusInput;
			
			text = celciusInput.getText();
			
			fahrenheit = Double.parseDouble(text) * 1.8 + 32;
			
			JOptionPane.showMessageDialog(null, text + " degrees in celcius is " + fahrenheit + " degrees fahrenheit");
		}
	}
	
	public static void main(String[] args)
	{
		TemperatureConvertWindow myTempWindow = new TemperatureConvertWindow();
	}
}