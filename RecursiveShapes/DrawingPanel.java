import javax.swing.*;
import java.awt.*;

/**
 * Te-Feng (Dylan) Pan
 * CS 162 - Lab 7B: Recursive Shapes
 * This class creates a panel that example shapes are
 * drawn on. the main is in RecursiveShapes.java
 */

public class DrawingPanel extends JPanel
{
   private JCheckBox[] checkBoxArray; // Check box array
   
   /**
    * Constructor
    */
      
   public DrawingPanel(JCheckBox[] cbArray)
   {
      // Reference the check box array.
      checkBoxArray = cbArray;
      
      // Set this panel's background color to white.
      setBackground(Color.WHITE);
      
      // Set the preferred size of the panel.
      setPreferredSize(new Dimension(400, 400));
   }
   
   /**
    * paintComponent method
    */
   
   public void paintComponent(Graphics g)
   {
      // Call the superclass paintComponent method.
      super.paintComponent(g);
      
      // Draw the selected shapes.
      if (checkBoxArray[0].isSelected())
      {
    	  	g.setColor(Color.BLACK);
         drawCircles(g, 10, 5, 300);
      }
      if (checkBoxArray[1].isSelected())
      {
    	  	g.setColor(Color.GREEN);
         drawRect(g, 10, 100, 150);
      }
      if (checkBoxArray[2].isSelected())
      {
         g.setColor(Color.BLUE);
         drawOval(g, 150, 75, 150);
      }
      /*if (checkBoxArray[3].isSelected())
      {
         g.setColor(Color.BLACK);
         g.drawOval(40, 155, 75, 50);
      }  
      if (checkBoxArray[4].isSelected())
      {
         g.setColor(Color.BLUE);
         g.fillOval(200, 125, 75, 50);
      }
      if (checkBoxArray[5].isSelected())
      {
         g.setColor(Color.BLACK);
         g.drawArc(200, 40, 75, 50, 0, 90);
      }
      if (checkBoxArray[6].isSelected())
      {
         g.setColor(Color.GREEN);
         g.fillArc(100, 155, 75, 50, 0, 90);
      }*/
   }
   
   private void drawCircles(Graphics g, int n, int topXY, int size)
   {  
      if (n > 0)
      {
         g.drawOval(topXY, topXY, size, size);
         drawCircles(g, n - 1, topXY + 15, size - 30);
      }
   }
   
   private void drawRect(Graphics g, int n, int topXY, int size)
   {  
      if (n > 0)
      {
         g.drawRect(topXY, topXY, size, size);
         drawRect(g, n - 1, topXY + 10, size - 30);
      }
   }
	
	private void drawOval(Graphics g, int n, int topXY, int size)
   {  
      if (n > 0)
      {
         g.drawOval(topXY, topXY, size, size);
         drawOval(g, n - 1, topXY + 10, size - 50);
      }
   }
}
