import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/*	Steps:
	1. declare component variables
	2. create components
	3. add commponents to panel
	4. define listener
	5. add listener to component
*/
public class TemperatureConverterWindow extends JFrame
{
	private final int WINDOW_WIDTH = 640;
	private final int WINDOW_HEIGHT = 480;
	private JPanel panel;
	private JLabel instruction;
	private JTextField celciusInput;
	private JButton convert;
	private JButton blueButton;
	private JButton greenButton;

	public TemperatureConverterWindow()
	{
		super("My Temp Convert Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel()
	{
		panel = new JPanel();
		
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		//panel.setLayout(new BorderLayout());
		
		instruction = new JLabel("Please enter a temperture in Celcius: ");
		celciusInput = new JTextField(8);
		convert = new JButton("Convert to Fahrenheit");
		blueButton = new JButton("Blue");
		greenButton = new JButton("Green");
		
		// Add an action listener to the button
		celciusInput.addActionListener(new GenericListener());
		convert.addActionListener(new ConvertButtonListener());
		blueButton.addActionListener(new ColorListener());
		greenButton.addActionListener(new ColorListener());
		//convert.setForeground(Color.YELLOW);
		//convert.setBackground(Color.BLUE);
		
		panel.add(instruction);
		panel.add(celciusInput);
		panel.add(convert);
		panel.add(blueButton);
		panel.add(greenButton);
	}
	
	private class ColorListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//if (e.getSource() == blueButton)
			
		}
	}
	
	private class ConvertButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double fahrenheit;
			String text;
			
			text = celciusInput.getText();
			
			fahrenheit = Double.parseDouble(text) * 1.8 + 32;
			
			JOptionPane.showMessageDialog(null, text + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit");	
		}
	}
	
	private class GenericListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		
		}
	}
	
	
	public static void main(String[] args)
	{
		TemperatureConverterWindow myWindow = new TemperatureConverterWindow();
	}
}
