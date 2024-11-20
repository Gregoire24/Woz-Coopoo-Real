import java.util.ArrayList;

/**
 * The MediaLibrary class provides a facility to store CD and video 
 * objects. A list of all CDs and videos can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @author Patrick Girard
 * @version 31/08/2016
 */
public class MediaLibrary
{
    private ListOfItems items;

    /**
     * Construct an empty MediaLibrary.
     */
    public MediaLibrary()
    {
        items = new ListOfItems();
    }

    /**
     * Add an item to the MediaLibrary.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        items.list();
    }
}
