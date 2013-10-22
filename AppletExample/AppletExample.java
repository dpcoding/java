import javax.swing.*;
import java.awt.*;

public class AppletExample extends JApplet
{
	public void init()
	{
		/*JLabel label = new JLabel("Hello");
		JButton myButton = new JButton("My Button");
		add(label);
		add(myButton);*/
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.RED);
		//g.drawLine(20, 20, 280, 280);
		
		g.drawRect(10, 10, 200, 200);
		
		g.setColor(Color.YELLOW);
		g.fillOval(250, 10, 100, 200);
		
		g.setColor(Color.GREEN);
		g.drawOval(250, 10, 100, 200);
		
		for (int i = 0; i < 8; i++)
		{
			g.setColor(new Color(0,0,i*31));
			g.fillArc(10, 10, 200, 200, i*45, 30);
		}
	}

}