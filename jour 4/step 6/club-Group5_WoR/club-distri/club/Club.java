/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public int numberOfMembersInMonth(int monthNumber) {
    int count = 0; // Variable pour compter le nombre de membres dans le mois donné

    // Itérer à travers tous les membres
    for (Membership members : members) {
        // Vérifier si le mois de souscription correspond au mois spécifié
        if (monthNumber == members.getMonth()) {
            count++;
        }
    }

    return count;
}
}

