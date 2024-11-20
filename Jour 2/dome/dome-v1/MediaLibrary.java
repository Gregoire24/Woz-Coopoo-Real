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
    private ListOfCD cds;
    private ListOfDVD dvds;

    /**
     * Construct an empty MediaLibrary.
     */
    public MediaLibrary()
    {
        cds = new ListOfCD();
        dvds = new ListOfDVD();
    }

    /**
     * Add a CD to the Mediatheque.
     * @param theCD The CD to be added.
     */
    public void addCD(CD theCD)
    {
        cds.add(theCD);
    }

    /**
     * Add a DVD to the MediaLibrary.
     * @param theDVD The DVD to be added.
     */
    public void addDVD(DVD theDVD)
    {
        dvds.add(theDVD);
    }

    /**
     * Print a list of all currently stored CDs and DVDs to the
     * text terminal.
     */
    public void list()
    {
       cds.list();
       dvds.list();
    }
}
