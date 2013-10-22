import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame
{
    private final int WINDOW_WIDTH = 640;
    private final int WINDOW_HEIGHT = 240;
    private JPanel panel;
    private JPanel panel2;
    private JButton button;
    private JLabel instruction;
    private JCheckBox foreground;
    private JCheckBox background;
    private JComboBox cBox;
    private JTextField field;
//    private JScrollPane scroll;

    public CheckBoxExample()
    {
        super("Check Box Example");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        panel2 = new JPanel();
        button = new JButton("I'm a Button!");
        panel2.add(button);

        panel2.setBorder(BorderFactory.createMatteBorder(5, 10, 5, 10, new Color(0,100,0)));

        setLayout(new FlowLayout());

        add(panel);
        add(panel2);

        setVisible(true);
    }

    private void buildPanel()
    {
        panel = new JPanel();

        //panel.setBorder(BorderFactory.createTitledBorder("A Title"));

        //instruction = new JLabel("These checkboxes control the color");
        foreground = new JCheckBox("Blue Foreground");
        background = new JCheckBox("Green Background");
        String[] names = {"Alice", "Bob", "Charlie", "Denise", "Evan", "Francis", "George"};
        cBox = new JComboBox(names);
        field = new JTextField(20);
        field.setEditable(false);
        cBox.setEditable(true);

        foreground.addItemListener(new ColorListener());
        background.addItemListener(new ColorListener());
        cBox.addActionListener(new BoxListener());

//        panel.add(instruction);
        panel.add(foreground);
        panel.add(background);
        panel.add(cBox);
//        panel.add(scroll);
        panel.add(field);

    }

    private class BoxListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String selection = (String) cBox.getSelectedItem();
            field.setText(selection);
        }
    }

    /*private class NameListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            Object[] names = list.getSelectedValues();
            String display = "";
            for (int i = 0; i < names.length; i++)
            {
                display += names[i] + " ";
            }
            field.setText(display);
        }
    }*/

    private class ColorListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            if (e.getSource() == foreground)
            {
                if (foreground.isSelected())
                {
                    instruction.setForeground(Color.BLUE);
                    foreground.setForeground(Color.BLUE);
                    background.setForeground(Color.BLUE);
                }
                else
                {
                    instruction.setForeground(Color.BLACK);
                    foreground.setForeground(Color.BLACK);
                    background.setForeground(Color.BLACK);
                }
            }
            else if (e.getSource() == background)
            {
                if (background.isSelected())
                {
                    panel.setBackground(Color.GREEN);
                    foreground.setBackground(Color.GREEN);
                    background.setBackground(Color.GREEN);
                }
                else
                {
                    panel.setBackground(Color.LIGHT_GRAY);
                    foreground.setBackground(Color.LIGHT_GRAY);
                    background.setBackground(Color.LIGHT_GRAY);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        new CheckBoxExample();
    }
}