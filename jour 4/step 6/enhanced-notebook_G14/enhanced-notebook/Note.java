public class Note
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String title;
    private SimpleDate dateOfCreation; 
    private String body;
    private static final int MAX_TITLE_LENGTH = 20;

    public Note (String title,SimpleDate dateOfCreation, String body) {
        // Remplacez le titre null par une chaîne vide
        if (title != null) {
        this.title = title;
        } else {
        this.title = "";
        }
        // Tronquer le titre s'il dépasse la longueur maximale
        if (this.title.length() > MAX_TITLE_LENGTH) {
            this.title = this.title.substring(0, MAX_TITLE_LENGTH);
        }
        this.dateOfCreation= dateOfCreation; 
        if (body != null) {
        this.body = body;
        } else {
        this.body = "";
        }
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String newTitle) {
        // Handle the case where newTitle is null
        if (newTitle != null) {
        this.title = newTitle;

        // Truncate the title if it exceeds the maximum length
            if (this.title.length() > MAX_TITLE_LENGTH) {
            this.title = this.title.substring(0, MAX_TITLE_LENGTH);
            }
            
        } else {
        // If newTitle is null, set title to an empty string
        this.title = "";
        }
    }

    public SimpleDate getDateOfCreation()
    {
        return dateOfCreation;
    }
    
    public String getBody()
    {
        return body;
    }
    
    public void setBody(String newbody)
    {
        if (newbody != null) {
        this.body = newbody;
        } else {
        this.body = "";
        }
    }
    
    public String toString()
    {
        String note= (this.dateOfCreation.getDate()+ " : "+ this.title);
        return note;
    } 
    }
