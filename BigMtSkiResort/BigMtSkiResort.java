import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * CS 162J - Te-Feng (Dylan) Pan
 * Lab 6A: Big Mountain Ski Resort.
 * This application processes the end-of-day Ski Lift ticket sales at the Big Mountain Ski Resort
 * and calculates gross and net profits.
 */

public class BigMtSkiResort extends JFrame
{
    private JPanel inputPanel;
    private JPanel controlPanel;

    private JLabel fullPriceLabel;
    private JLabel fullSoldLabel;
    private JLabel halfPriceLabel;
    private JLabel halfSoldLabel;
    private JLabel grossLabel;
    private JLabel netLabel;

    private JTextField fullPrice;
    private JTextField fullSold;
    private JTextField halfPrice;
    private JTextField halfSold;
    private JTextField grossProfit;
    private JTextField netProfit;

    private JButton calculate;
    private JButton clear;

    private final int WIDTH = 500;
    private final int HEIGHT = 300;

    public BigMtSkiResort()
    {
        super("Big Mountain Ski Resort");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
		  //BorderLayout(int horizontalGap, int verticalGap)
        setLayout(new BorderLayout(15,15));

        setSize(WIDTH, HEIGHT);
		  //GridLayout(int rows, int cols, int hgap, int vgap)
        inputPanel = new JPanel(new GridLayout(0,2,5,10));
        controlPanel = new JPanel(new GridLayout(0,2,5,10));

        fullPriceLabel = new JLabel("Price of Full-day Ticket:");
        fullPrice = new JTextField();
        fullSoldLabel = new JLabel("Full-day Tickets Sold:");
        fullSold = new JTextField();

        halfPriceLabel = new JLabel("Price of Half-day Ticket:");
        halfPrice = new JTextField();
        halfSoldLabel = new JLabel("Half-day Tickets Sold:");
        halfSold = new JTextField();

        grossLabel = new JLabel("GROSS PROFIT:");
		  grossProfit = new JTextField();
        grossProfit.setEditable(false);
		  
        netLabel = new JLabel("NET PROFIT:");      
        netProfit = new JTextField();
        netProfit.setEditable(false);

        calculate = new JButton("Calculate");
        calculate.addActionListener(new CalcButtonListener());
		  
        clear = new JButton("Clear");
        clear.addActionListener(new ClearButtonListener());

        inputPanel.add(fullPriceLabel);
        inputPanel.add(fullPrice);
        inputPanel.add(fullSoldLabel);
        inputPanel.add(fullSold);
        inputPanel.add(halfPriceLabel);
        inputPanel.add(halfPrice);
        inputPanel.add(halfSoldLabel);
        inputPanel.add(halfSold);

        controlPanel.add(grossLabel);
        controlPanel.add(netLabel);
        controlPanel.add(grossProfit);
        controlPanel.add(netProfit);
		  
        controlPanel.add(calculate);
        controlPanel.add(clear);

        add(inputPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
       
        setVisible(true);
    }

    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                DecimalFormat dollar = new DecimalFormat("$##,##0.00");

                double fullP = Double.parseDouble(fullPrice.getText());
                double fullS = Double.parseDouble(fullSold.getText());
                double halfP = Double.parseDouble(halfPrice.getText());
                double halfS = Double.parseDouble(halfSold.getText());

                double gProfit = (fullP * fullS) + (halfP * halfS);
                double nProfit = gProfit - (gProfit * 0.15);

                grossProfit.setText(dollar.format(gProfit));
                netProfit.setText(dollar.format(nProfit));
            } 
				catch (NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(null, "Please input a dollar amount in each field. Enter 0 when appropriate.",
                                                "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ClearButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            fullPrice.setText(null);
            halfPrice.setText(null);
            fullSold.setText(null);
            halfSold.setText(null);
            grossProfit.setText(null);
            netProfit.setText(null);
        }
    }

    public static void main(String[] args)
    {
        new BigMtSkiResort();
    }
}
