import java.util.ArrayList;

public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<Note> notes;
    private boolean verif;

    public Notebook()
    {
        notes = new ArrayList<Note>();
        notes.add(new Note("Vide", null, ""));
        verif = false;
    }

    public void storeNote(Note note) {
        notes.add(note);
    }

    public int numberOfNotes()
    {
        return notes.size();
    }

    public void showNote(int noteNumber) {
        if (isValidNumber(noteNumber)) 
        {
            Note note = notes.get(noteNumber);
            System.out.println((noteNumber) + ":" 
            + note.getDateOfCreation().getDate()
            + note.getTitle()
            + note.getBody());
        }
    }
    
    public Note getNote(int noteNumber) {
        if (isValidNumber(noteNumber)) {
            return notes.get(noteNumber);
        }
        return null;
    }
    
    public void removeNote(int noteNumber)
    {
        if(isValidNumber(noteNumber)) {
            notes.remove(noteNumber);
        }
    }
    
    public void listNotes1() {
        System.out.println("ListeNotes");
        for (int i = 1; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println(1 + ": " + note.getDateOfCreation().getDate() +
                " - " + note.getTitle());
        }
    }  

    public void listNotes2(String theSubString) {
        System.out.println("ListeNotes");
        int index = 1;
        for (Note note : notes) {
            if (note.getTitle().contains(theSubString) || note.getBody().contains(theSubString)) {
            System.out.println(index + ": " + note);
            index++;
            }
        }
    } 

    public void listNotes3()
    {
        int i = 0;
        while(i < numberOfNotes()) {
            System.out.println(i + ": " + notes.get(i));
            i++;
        }
    }
    
    private boolean isValidNumber(int noteNumber)
    {
        boolean verif = false;
        if(noteNumber >= 0 && noteNumber < numberOfNotes()) {
            verif = true;
        } else {
            System.out.println("Ce numéro n'est pas valide");
            verif = false;
        }
        return verif;
    }

    public void find(String keyword) {
        System.out.println("ListeNotes with '" + keyword + "'");
        int index = 1;
        for (Note note : notes) {
            if (note.getTitle().contains(keyword) || note.getBody().contains(keyword)) {
                // || si au moins l'une des deux conditions est vraie
            System.out.println(note.getDateOfCreation().getDate() +
                    " - " + note.getTitle() + " // " + note.getBody());
            index++;
            }
        }
        if (index == 1) {
        System.out.println("No notes found containing '" + keyword + "'.");
        }
    }
    
        public void NWlistNotes1() {
        int index = 1;
        for (Note note : notes) {
            System.out.println(index + ": " + note);
            index++;
        }
    }

    public void NWlistNotes2() {
        for (int i = 1; i <= numberOfNotes(); i++) {
            System.out.println(i + ": " + notes.get(i - 1));
        }
    }

    public void NWlistNotes3() {
        int i = 1;
        for (Note note : notes) {
            System.out.println(i + ": " + note);
            i++;
        }
    }

    private boolean NWisValidNumber(int noteNumber) {
        if (noteNumber >= 1 && noteNumber <= numberOfNotes()) {
            return true;
        } else {
            System.out.println("Ce numéro n'est pas valide");
            return false;
        }
    }
    
    public Note NWgetNote(int noteNumber)
    {
        if (NWisValidNumber(noteNumber)) {
            return notes.get(noteNumber);
        }
        return null; 
    }

    
    public void NWremoveNote(int noteNumber){
        if(NWisValidNumber(noteNumber)) {
            notes.remove(noteNumber);
        }
    }
}

