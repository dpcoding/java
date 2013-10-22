import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Te-Feng (Dylan) Pan
 * CS 162 - Lab 7B: Recursive Shapes
 * This class displays a drawing panel and a set of check
 * boxes that allow the user to select shapes. The selected
 * shapes are recursicely drawn on the drawing panel .
 */

public class RecursiveShapes extends JApplet
{
   // The following will reference an array of check boxes.
   private JCheckBox[] checkBoxes;
   
   // The titles array contains titles for the check boxes.
   private String[] titles = { "Circles", "Rectangle", "Oval" };

   // The following will reference a panel to contain
   // the check boxes.                               
   private JPanel checkBoxPanel;
   
   // The following will reference an instance of the
   // DrawingPanel class. This will be a panel to draw on.
   private DrawingPanel drawingPanel;
   
   /**
    * init method 
    */
      
   public void init()
   {
      // Build the check box panel.
      buildCheckBoxPanel();
      
      // Create the drawing panel.
      drawingPanel = new DrawingPanel(checkBoxes);
		
		// Set the preferred size of the panel.
      setPreferredSize(new Dimension(600, 600));
		
      // Add the check box panel to the east region and
      // the drawing panel to the center region.
      add(checkBoxPanel, BorderLayout.EAST);
      add(drawingPanel, BorderLayout.CENTER);
   }
   
   /**
    * The buildCheckBoxPanel method creates the array of
    * check box components and adds them to a panel. 
    */
   
   private void buildCheckBoxPanel()
   {
      // Create the panel.
      checkBoxPanel = new JPanel();
      checkBoxPanel.setLayout(new GridLayout(7, 1));

      // Create the check box array.
      checkBoxes = new JCheckBox[3];

      // Create the check boxes and add them to the panel.
      for (int i = 0; i < checkBoxes.length; i++)
      {
         checkBoxes[i] = new JCheckBox(titles[i]);
         checkBoxes[i].addItemListener(new CheckBoxListener());
         checkBoxPanel.add(checkBoxes[i]);
      }
   }

   /**
    * A private inner class that responds to changes in the
    * state of the check boxes.
    */    

   private class CheckBoxListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
         drawingPanel.repaint();
      }
   }
}