import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling, rev. Patrick Girard
 * @version 09-2021
 */
public class Notebook {
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook() {
        notes = new ArrayList<>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note) {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes() {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber) {
        if (isValidNumber(noteNumber)) {
            System.out.println(notes.get(noteNumber));
        }
    }

    /**
     * Remove a note from the notebook.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber) {
        if (isValidNumber(noteNumber)) {
            notes.remove(noteNumber);
            System.out.println("Note " + (noteNumber + 1) + " has been removed.");
        }
    }

    /**
     * List all notes using for-each loop.
     */
    public void listNotes1() {
        int index = 1; // Start numbering from 1
        for (String note : notes) {
            System.out.println(index + ": " + note);
            index++;
        }
    }

    /**
     * List all notes using traditional for loop.
     */
    public void listNotes2() {
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ": " + notes.get(i)); // Numbering from 1
        }
    }

    /**
     * List all notes using while loop.
     */
    public void listNotes3() {
        int i = 0;
        while (i < notes.size()) {
            System.out.println((i + 1) + ": " + notes.get(i)); // Numbering from 1
            i++;
        }
    }

    /**
     * Check if a note number is valid.
     * @param noteNumber The note number to check.
     * @return true if valid, false otherwise.
     */
    private boolean isValidNumber(int noteNumber) {
        return noteNumber >= 0 && noteNumber < notes.size();
    }

    /**
     * Check if a note number is valid (Natural Way).
     * @param noteNumber The note number to check.
     * @return true if valid, false otherwise.
     */
    public boolean NWisValidNumber(int noteNumber) {
        return isValidNumber(noteNumber - 1); // Adjust for natural numbering
    }

    /**
     * Find if a note exists in the notebook.
     * @param note The note to search for.
     * @return true if the note exists, false otherwise.
     */
    public boolean find(String note) {
        return notes.contains(note);
    }

    // Methods with 'NW' prefix for a more natural numbering system
    public void NWshowNote(int noteNumber) {
        if (NWisValidNumber(noteNumber)) {
            showNote(noteNumber - 1);
        } else {
            System.out.println("Invalid note number.");
        }
    }

    public void NWremoveNote(int noteNumber) {
        if (NWisValidNumber(noteNumber)) {
            removeNote(noteNumber - 1);
        } else {
            System.out.println("Invalid note number.");
        }
    }

    public void NWlistNotes1() {
        listNotes1(); // No changes needed since it's already natural
    }

    public void NWlistNotes2() {
        listNotes2(); // No changes needed since it's already natural
    }

    public void NWlistNotes3() {
        listNotes3(); // No changes needed since it's already natural
    }

    public boolean NWfind(String note) {
        return find(note);
    }

    public String NWgetNote(int noteNumber) {
        if (NWisValidNumber(noteNumber)) {
            return notes.get(noteNumber - 1);
        }
        return "Invalid note number.";
    }
}
