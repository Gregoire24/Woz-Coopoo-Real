import java.time.LocalDate;

public class PatientV4
{
    private String nom, prenom;
    
    private LocalDate dateDeNaissance;
    private int age;
    
    public PatientV4(String nom, String prenom, int jour, int mois, int annee, SexeV1 sexe){
        this.nom = nom; 
        this.prenom = prenom;
        this.dateDeNaissance = LocalDate.of(annee, mois, jour);
        this.sexe = sexe;
    }

    private SexeV1 sexe;
    
    public SexeV1 getSexe(){
        return sexe;
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
