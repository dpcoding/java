import javax.swing.*;		// needed for JPanel, JLabel
//import javax.swing.event.*;
import java.awt.event.*;  // needed for actionlistener
import java.awt.*;

public class ImageWindow extends JFrame
{
	private JPanel buttonPanel;
	private JPanel imagePanel;
	private JLabel imageLabel;
	private JButton imageButton;

	public ImageWindow()
	{
		super("My First Icons!");
		
		//setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buttonPanel = new JPanel();
		imagePanel = new JPanel();
		
		
		ImageIcon picture = new ImageIcon("bio-cycle.jpg");
		
		imageLabel = new JLabel("Nothing is here");
		imageLabel.setIcon(picture);
		
		imageButton = new JButton("Click to see picture");
		imageButton.addActionListener(new PictureButtonListener()); 
		
		buttonPanel.add(imageButton);
		imagePanel.add(imageLabel);
		
		add(imagePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private class PictureButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ImageIcon picture = new ImageIcon();
			imageLabel.setIcon(picture);
			imageLabel.setText(null);
			
			pack();
		}	
	}
	
	public static void main(String[] args)
	{
		new ImageWindow();
	}
}