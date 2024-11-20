import java.time.LocalDate;

// Version avec le numéro de SS
public class PatientV5
{
    private String nom, prenom;
    
    private LocalDate dateDeNaissance;
    private int age;
    
    public PatientV5(String nom, String prenom, int jour, int mois, int annee, SexeV1 sexe){
        this.nom = nom; 
        this.prenom = prenom;
        this.dateDeNaissance = LocalDate.of(annee, mois, jour);
        this.sexe = sexe;
    }
    
    private SexeV1 sexe;
    
    private String numeroSS;
    
    public String getNumeroSS(){
        return numeroSS;
    }
    
    public void setNumeroSS(String numeroSS) {
        if (numeroSS.length() == 15)
            if (((numeroSS.charAt(0)=='1') && (sexe == SexeV1.MASCULIN)) 
             || ((numeroSS.charAt(0)=='2') && (sexe == SexeV1.FEMININ)))
                 this.numeroSS = numeroSS;
    }

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
