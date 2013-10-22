import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Te-Feng (Dylan) Pan
 * CS 162J Lab 6B : Book Library
 * This class print information about selected book(s).
 */

public class BookLibrary extends JFrame
{
    private JList bookList;
    private JTextArea selectedBookList;
    private JButton button;
    private JPanel bookPanel;
    private JPanel selectionPanel;
    private JPanel buttonPanel;
    private Book[] books;
    private final int WINDOW_HEIGHT = 600;
    private final int WINDOW_WIDTH = 500;

    public BookLibrary() throws Exception
    {
        super("Welcome to the Eugene Library!");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        buildBookPanel();
        buildSelectedBookPanel();
        buildButtonPanel();

        add(bookPanel, BorderLayout.NORTH);
        add(selectionPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void buildButtonPanel()
    {
        // Create a panel to hold the button.
        buttonPanel = new JPanel();

        // Create the button.
        button = new JButton("Get Book Info");

        // Add an action listener to the button.
        button.addActionListener(new ButtonListener());

        // Add the button to the panel.
        buttonPanel.add(button);
    }

    private void buildSelectedBookPanel()
    {
        // Create a panel to hold the list.
        selectionPanel = new JPanel();

        // Create the list.
        selectedBookList = new JTextArea(25, 30);

        // Add the list to a scroll pane.
        JScrollPane selectedBookScrollPane =
                new JScrollPane(selectedBookList);

        // Add the scroll pane to the panel.
        selectionPanel.add(selectedBookScrollPane);
    }

    public static Book[] getBinaryFile() throws Exception
    {
        final int ITEMS = 5;  // Number of items

        // Create the stream objects to data files of Books objects.
        FileInputStream inStream = new FileInputStream("Books.dat");
        ObjectInputStream bookInputFile = new ObjectInputStream(inStream);

        // Create an array to hold objects.
        Book[] items = new Book[ITEMS];

        // Read the serialized objects from the file.
        for (int i = 0; i < items.length; i++)
        {
            items[i] = (Book) bookInputFile.readObject();
        }

        // Close the file.
        bookInputFile.close();

        return items;
    }

    public static String[] getTitles(Book[] books)
    {
        String[] titles = new String[books.length];

        for(int i = 0; i < books.length; i++)
        {
            titles[i] = books[i].getTitle();
        }
        return titles;
    }

    private void buildBookPanel() throws Exception
    {
        books = getBinaryFile();
        String[] bookTitles = getTitles(books);

        // Create a panel to hold the list.
        bookPanel = new JPanel();

        // Create the list.
        bookList = new JList(bookTitles);
        bookList.setFixedCellWidth(300);

        // Set the list to multiple interval selection mode.
        bookList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Set the number of visible rows to 5.
        bookList.setVisibleRowCount(5);

        // Add the list to a scroll pane.
        JScrollPane bookListScrollPane =
                new JScrollPane(bookList);

        // Add the scroll pane to the panel.
        bookPanel.add(bookListScrollPane);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent)
        {
            String end = selectedBookList.getText();

            if (bookList.getSelectedValue() == null)
                selectedBookList.replaceRange("No items selected", 0, end.length());
            else
            {
                // Get the items that were selected.
                int[] selections = bookList.getSelectedIndices();

                selectedBookList.replaceRange(books[selections[0]].toString() + "\n\n", 0, end.length());
                for (int i = 1; i < selections.length; i++)
                {
                    selectedBookList.append(books[selections[i]].toString() + "\n\n");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        new BookLibrary();
    }
}
