import java.time.LocalDate;
import java.time.DateTimeException;

// Version avec un constructeur mieux protégé
public class PatientV9
{
    // Attributs obligatoires
    private String nom, prenom;
    private LocalDate dateDeNaissance;
    private int age;
    private SexeV2 sexe;
        
    public PatientV9(String nom, String prenom, int jour, int mois, int annee, SexeV2 sexe){
        boolean correct;

        // test des nom et prenom ;
        correct = nomCorrect(nom) && nomCorrect(prenom);

        // test de la date
        LocalDate date;
        try {
            date = LocalDate.of(annee, mois, jour);
            if (LocalDate.now().getYear() <= date.getYear()) correct = false;
        } catch(DateTimeException e) {
            correct = false;
        }
        
        if (correct) {
            this.nom = nom.toUpperCase(); // Capîtalisation
            this.prenom = prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase();
            this.dateDeNaissance = LocalDate.of(annee, mois, jour);
            this.sexe = sexe;
         } else {
            this.nom = null;
            this.prenom = null;
            this.dateDeNaissance = null;
            this.sexe = SexeV2.INDEFINI;
         }
        
    }
    
    // Attributs non obligatoires
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
        String temp = numeroSS.trim();
        if (temp.length() == 15)
            if (temp.matches("[0-9]{15}"))
                if (((numeroSS.charAt(0)=='1') && (sexe == SexeV2.MASCULIN)) 
                 || ((numeroSS.charAt(0)=='2') && (sexe == SexeV2.FEMININ)))
                    if (Integer.parseInt(temp.substring(1,3)) 
                             == dateDeNaissance.getYear())
                        if (Integer.parseInt(temp.substring(3,5)) 
                                == dateDeNaissance.getMonthValue())
                            this.numeroSS = temp;
    }

    public SexeV2 getSexe(){
        if (this.nom == null)
            return null;
        else
            return sexe;
    }

    public LocalDate getDateDeNaissance(){
        return dateDeNaissance;
    }
    
    public int getAge(){
        try {
            return LocalDate.now().getYear() - dateDeNaissance.getYear();
        } catch(NullPointerException e) {
            return 0;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getPresentation() {
        return  "Je m’appelle " + prenom + " " + nom +
                ", je suis " + (sexe == SexeV2.FEMININ? "une femme, " : "un homme, ") +
                "je suis né" + (sexe == SexeV2.FEMININ? "e" : "") + " le " + 
                dateDeNaissance + " et j’ai donc " + getAge() + " ans. " + 
                "Le reste de mes données personnelles n’est pas divulguable";
    }
    
    // Utilitaires de la classe
    private static boolean nomCorrect(String nom) {
        // vérification des caractères autorisés
        if (!nom.matches("[a-zA-Z -]+")) return false;
        
        // contient un ou des tirets
        if (nom.contains("-") && (!nom.matches("^[a-zA-Z]+(-[a-zA-Z]+)*"))) return false;
        // contient un ou des blancs
        if (nom.contains(" ") && (!nom.matches("^[a-zA-Z]+( [a-zA-Z]+)*"))) return false;

        return true;
    }
    
}
