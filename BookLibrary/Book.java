import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Te-Feng (Dylan) Pan
 * CS 162J Lab 6B : Book Library
 * This class stores information about a book.
 */
 
public class Book implements Serializable
{
    private String title,     // Title of the book
            author,    // Author's last name
            publisher, // Name of publisher
            iSBN;

    /**
     * This constructor accepts arguments for the title, author, and publisher.
     */
    public Book(String textTitle, String auth, String pub, String bknum)
    {
        title = textTitle;
        author = auth;
        publisher = pub;
        iSBN = bknum;
    }

    /**
     * Copy constructor
     */
    public Book(Book object2)
    {
        title = object2.title;
        author = object2.author;
        publisher = object2.publisher;
        iSBN = object2.iSBN;
    }

    /**
     * The set method sets each field.
     */
    public void set(String textTitle, String auth, String pub, String bknum)
    {
        title = textTitle;
        author = auth;
        publisher = pub;
        iSBN = bknum;
    }

    /**
     * get method retrieves a field
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * The overriding toString method returns book information.
     */
    public String toString()
    { String str = " Title: " + title      
            + "\n Author: " + author
            + "\n Publisher: " + publisher
            + "\n ISBN: " + iSBN;
        return str;
    }
}