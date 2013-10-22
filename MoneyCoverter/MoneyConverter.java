import javax.swing.*;
import java.awt.event.*;  // needed for actionlistener
/**
 * Te-Feng (Dylan) Pan 
 * CS 162J - Lab 5 Problem B: Money Converter
 * The user to enter an amount of money in dollars. 
 * Then it displays the equivalent amount in Euro's and then in British pounds. 
 * Use the Feb 10, 2012 conversion factor of 0.758 euro = 1 US dollar, 
 * and 0.635 GB pound = 1 US dollar. Test with a number different of dollar amounts, 
 * but turn in an execution showing conversions for $10, $35, and $75. 
 */
 
public class MoneyConverter extends JFrame
{
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	private JPanel panel;
	private JLabel instruction;
	private JTextField moneyInput;
	private JButton convert, clear;// adding another button
	
	private JRadioButton toEuro;
	private JRadioButton toPounds;
	private ButtonGroup buttonGroup;
	
	//private JLabel resultEuro;
	//private JLabel resultPounds;
	
	//Constructor
	public  MoneyConverter()
	{
		super("Money Converter");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel()
	{
		panel = new JPanel();
		
		instruction = new JLabel("Please enter an amount in dallors");
		moneyInput = new JTextField(30);
		toEuro = new JRadioButton("Convert to Euro");
		toPounds = new JRadioButton("Convert to British Pounds");
		convert = new JButton("Do Conversion");// adding button and text
		clear = new JButton("Clear"); // clear button
		//resultEuro = new JLabel("");
		//resultPounds = new JLabel("");
		
		moneyInput.setSize(100, 10);
		//moneyInput.setMargin(1.5);
		//moneyInput.setEditable(false);// set text box editable
		//moneyInput.setText("100.0");// set text in the text box
		
		//add a list of radiobutton
		buttonGroup = new ButtonGroup();
		//buttonGroup.add(toEuro);
		//buttonGroup.add(toPounds);
		
		// 
		/*toEuro.addActionListener(new TemperatureListener());
		toPounds.addActionListener(new TemperatureListener());*/
		
		convert.addActionListener(new TemperatureListener());
		clear.addActionListener(new ClearListener());
		
		// display to window
		panel.add(instruction);
		panel.add(moneyInput);
		//panel.add(toEuro);
		//panel.add(toPounds);
		panel.add(convert);
		panel.add(clear);
		//panel.add(resultEuro);
		//panel.add(resultPounds);
	}
	
	
	private class TemperatureListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input;
			//String convertFrom;
			//String convertTo;
			double resultE = 0;
			double resultP = 0;
			
			try
			{				
				input = moneyInput.getText();
				resultE = Double.parseDouble(input) * .758;
				resultP = Double.parseDouble(input) * .635;
				moneyInput.setText("$" + input + " = €" + resultE + " in Euro AND £" + resultP + " in Punds");
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Error." + ex.getMessage());
			}
		
			/*if (input < 0)
			{
				throw new NegativeNumberException("The amount of money cannot be a negative number.");
			}*/
			//if (e.getSource() == toEuro)
			//if (toEuro.isSelected())// check if toEuro is checked
			//{
				//resultE = Double.parseDouble(input) * .758;
				//toPounds.doClick();// click the other radio button
			//}
			//else if (e.getSource() == toPounds)
			//else if (toPounds.isSelected())
			//{
				//resultP = Double.parseDouble(input) * .635;
				//toEuro.doClick();
			//}
			
			//String output = "" + result;
			//moneyInput.setText(output);
			//showMessageDialog(null, input + " = " + resultEuro + "\n" + input + " = " + resultPounds);
			//moneyInput.setText("$" + input + " = €" + resultE + " in Euro AND £" + resultP + " in Punds");
			//resultEuro.setText(resultE);
			//resultPounds.setText(resultP);
		}
	}
	
	private class ClearListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			moneyInput.setText("");
		}
	}
	public class NegativeNumberException extends Exception
	{	
		public NegativeNumberException()
		{
			super("Negative, no, no.");
		}
		
		public NegativeNumberException(String input)
		{
			super("Negative, no, no. " + input);
		}
	}
	
	public static void main(String[] args)throws NegativeNumberException
	{
		 MoneyConverter myWindow = new  MoneyConverter();
	}
}