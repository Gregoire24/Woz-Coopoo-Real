import java.time.LocalDate;

public class PatientV3
{
    private String nom, prenom;
    
    private LocalDate dateDeNaissance;
    private int age;

    public PatientV3(String nom, String prenom, int jour, int mois, int annee){
        this.nom = nom; 
        this.prenom = prenom;
        this.dateDeNaissance = LocalDate.of(annee, mois, jour);
    }
    
    public LocalDate getDateDeNaissance(){
        return dateDeNaissance;
    }
    
    public int getAge(){
        return LocalDate.now().getYear() - dateDeNaissance.getYear();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

}
