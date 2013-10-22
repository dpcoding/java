import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class RadioButtonExample extends JFrame
{
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 500;
    private JPanel panel;
    private JLabel instruction;
    private JTextField tempInput;
    private JTextArea largeInput;
    private JScrollPane textAreaScroll;
    private JSlider fontSizeSlider;

    private JRadioButton toCelsius;
    private JRadioButton toFahrenheit;
    private JButton chooser;
    private ButtonGroup buttonGroup;
    private JFileChooser openChooser;

    // Menu Variables
    private JMenuBar myMenuBar;
    private JMenu fileMenu;
    private JMenu colorMenu;

    // File menu items
    private JMenuItem open;
    private JMenuItem newFile;
    private JMenuItem save;

    // Color menu items
    private JRadioButtonMenuItem blueRadio;
    private JRadioButtonMenuItem greenRadio;
    private JRadioButtonMenuItem redRadio;
    private ButtonGroup colorButtonGroup;
    private Font textAreaFont;

    public RadioButtonExample()
    {
        super("Temperature Converter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildMenuBar();

        buildPanel();

        add(panel);

//        pack();

        setVisible(true);
    }

    private void buildMenuBar()
    {
        myMenuBar = new JMenuBar();

        buildFileMenu();

//        buildColorMenu();

        myMenuBar.add(fileMenu);
//        myMenuBar.add(colorMenu);

        setJMenuBar(myMenuBar);
    }

    private void buildColorMenu()
    {
        colorMenu = new JMenu("Color");
        colorMenu.setMnemonic(KeyEvent.VK_C);

        blueRadio = new JRadioButtonMenuItem("Blue");
        blueRadio.setMnemonic(KeyEvent.VK_B);
        redRadio = new JRadioButtonMenuItem("Red");
        redRadio.setMnemonic(KeyEvent.VK_R);
        greenRadio = new JRadioButtonMenuItem("Green");
        greenRadio.setMnemonic(KeyEvent.VK_G);

        colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(blueRadio);
        colorButtonGroup.add(redRadio);
        colorButtonGroup.add(greenRadio);

        blueRadio.addActionListener(new ColorMenuListener());
        redRadio.addActionListener(new ColorMenuListener());
        greenRadio.addActionListener(new ColorMenuListener());

        colorMenu.add(redRadio);
        colorMenu.add(greenRadio);
        colorMenu.add(blueRadio);
    }

    private void buildFileMenu()
    {
        buildColorMenu();
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        newFile = new JMenuItem("New");
        newFile.setMnemonic(KeyEvent.VK_N);
        open = new JMenuItem("Open");
        open.setMnemonic(KeyEvent.VK_O);
        open.addActionListener(new OpenListener());
        save = new JMenuItem("Save");
        save.setMnemonic(KeyEvent.VK_S);

        fileMenu.add(colorMenu);
        fileMenu.addSeparator();
        fileMenu.add(newFile);
        fileMenu.add(open);
        fileMenu.add(save);
    }

    private void buildPanel()
    {
        panel = new JPanel();

        instruction = new JLabel("Please enter a temperature:");
        tempInput = new JTextField(20);
        toCelsius = new JRadioButton("Celsius");
        toFahrenheit = new JRadioButton("Fahrenheit");
        chooser = new JButton("Choose a color");
        openChooser = new JFileChooser();
        textAreaFont = new Font("Serif", Font.BOLD, 24);
        fontSizeSlider = new JSlider(JSlider.HORIZONTAL, 8, 48, 24);
        fontSizeSlider.setMajorTickSpacing(8);
        fontSizeSlider.setMinorTickSpacing(2);
        fontSizeSlider.setPaintTicks(true);
        fontSizeSlider.setPaintLabels(true);
        fontSizeSlider.addChangeListener(new FontSizeListener());

        largeInput = new JTextArea("Please type your last will and testaments here", 8, 30);
        largeInput.setLineWrap(true);
        largeInput.setWrapStyleWord(true);
        largeInput.setFont(textAreaFont);

        textAreaScroll = new JScrollPane(largeInput);
        textAreaScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(toCelsius);
        buttonGroup.add(toFahrenheit);

        toCelsius.addActionListener(new TemperatureListener());
        toFahrenheit.addActionListener(new TemperatureListener());
        chooser.addActionListener(new ColorChooserListener());
        toCelsius.setMnemonic(KeyEvent.VK_C);
        toFahrenheit.setMnemonic(KeyEvent.VK_H);
        toCelsius.setToolTipText("Convert temperature to Celsius");
        toFahrenheit.setToolTipText("Convert temperature to Fahrenheit");
        chooser.setMnemonic(KeyEvent.VK_I);

        panel.add(instruction);
        panel.add(tempInput);
        panel.add(toCelsius);
        panel.add(toFahrenheit);
        panel.add(chooser);
        panel.add(fontSizeSlider);
        panel.add(textAreaScroll);
    }

    private class TemperatureListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String input;
            double result = 0;

            input = tempInput.getText();

            if (e.getSource() == toCelsius)
            {
                result = (Double.parseDouble(input) - 32) * 5 / 9;
            }
            else if (e.getSource() == toFahrenheit)
            {
                result = Double.parseDouble(input) * 1.8 + 32;
            }

            String output = "" + result;
            tempInput.setText(output);

        }
    }

    private class OpenListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int status = openChooser.showOpenDialog(null);
            if(status == JFileChooser.APPROVE_OPTION)
            {
                File f = openChooser.getSelectedFile();
                String fileName = f.getPath();
                JOptionPane.showMessageDialog(null, "You selected " + fileName);
            }
        }
    }

    private class ColorChooserListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            Color c = JColorChooser.showDialog(null, "Please select a color:", Color.LIGHT_GRAY);
            chooser.setBackground(c);
        }
    }

    private class ColorMenuListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == redRadio)
            {
                panel.setBackground(Color.RED);
            }
            else if (e.getSource() == blueRadio)
            {
                panel.setBackground(Color.BLUE);
            }
            else if (e.getSource() == greenRadio)
            {
                panel.setBackground(Color.GREEN);
            }
        }
    }

    private class FontSizeListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent changeEvent)
        {
            int size = fontSizeSlider.getValue();
            textAreaFont = new Font("Serif", Font.PLAIN, size);
            largeInput.setFont(textAreaFont);
        }
    }

    public static void main(String[] args)
    {
        new RadioButtonExample();
    }
}