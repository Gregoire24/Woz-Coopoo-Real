import java.util.ArrayList;

/**
 * Write a description of class ListOfCD here.
 * 
 * @author Patrick Girard
 * @version 31/08/2016
 */
public class ListOfCD
{
    private ArrayList<CD> theList;

    /**
     * Construct an empty list.
     */
    public ListOfCD()
    {
        theList = new ArrayList<CD>();
    }

    /**
     * Add a CD to the list.
     * @param theCD The CD to be added.
     */
    public void add(CD theCD)
    {
        theList.add(theCD);
    }


    /**
     * Print a list of all currently stored CDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(CD cd : theList) {
            cd.print();
            System.out.println();   // empty line between items
        }
    }
}
