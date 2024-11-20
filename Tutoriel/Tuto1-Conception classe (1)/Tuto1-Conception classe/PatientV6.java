import java.time.LocalDate;

// Version avec taile et poids
public class PatientV6
{
    private String nom, prenom;
    
    private LocalDate dateDeNaissance;
    private int age;
    
    public PatientV6(String nom, String prenom, int jour, int mois, int annee, SexeV1 sexe){
        this.nom = nom; 
        this.prenom = prenom;
        this.dateDeNaissance = LocalDate.of(annee, mois, jour);
        this.sexe = sexe;
    }
    
    private SexeV1 sexe;
    
    private String numeroSS;
    
    private int taille;
    private double poids;
    
    public int getTaille(){
        return taille;
    }
    
    public void setTaille(int newTaille){
        if ((taille>=0) && (taille<250))
            taille = newTaille;
    }
    
    public double getPoids(){
        return poids;
    }
    
    public void setPoids(double newPoids){
        if ((poids>=0.0) && (poids<250.0))
            poids = newPoids;
    }
            
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
