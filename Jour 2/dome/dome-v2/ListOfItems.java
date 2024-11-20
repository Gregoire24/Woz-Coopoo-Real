import java.util.ArrayList;

/**
 * Write a description of class ListOfItems here.
 * 
 * @author Patrick Girard
 * @version 31/08/2016
 */
public class ListOfItems
{
    private ArrayList<Item> theList;

    /**
     * Construct an empty list.
     */
    public ListOfItems()
    {
        theList = new ArrayList<Item>();
    }

    /**
     * Add a DVD to the list.
     * @param theDVD The DVD to be added.
     */
    public void add(Item theItem)
    {
        theList.add(theItem);
    }

    /**
     * Print a list of all currently stored Items to the
     * text terminal.
     */
    public void list()
    {
        // print list of DVDs
        for(Item item : theList) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
}
