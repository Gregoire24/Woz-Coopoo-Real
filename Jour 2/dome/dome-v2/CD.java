/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @author Patrick Girard
 * @version 31/08/2016
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * @return The artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }

    /**
     * Print details of this CD to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("    artist: " + artist);
        System.out.println("    tracks: " + numberOfTracks);
    }
}
