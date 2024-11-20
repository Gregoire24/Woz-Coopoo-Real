import java.util.ArrayList;

/**
 * Write a description of class ListOfDVD here.
 * 
 * @author Patrick Girard
 * @version 31/08/2016
 */
public class ListOfDVD
{
    private ArrayList<DVD> theList;

    /**
     * Construct an empty list.
     */
    public ListOfDVD()
    {
        theList = new ArrayList<DVD>();
    }

    /**
     * Add a DVD to the list.
     * @param theDVD The DVD to be added.
     */
    public void add(DVD theDVD)
    {
        theList.add(theDVD);
    }

    /**
     * Print a list of all currently stored DVDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of DVDs
        for(DVD dvd : theList) {
            dvd.print();
            System.out.println();   // empty line between items
        }
    }
}
