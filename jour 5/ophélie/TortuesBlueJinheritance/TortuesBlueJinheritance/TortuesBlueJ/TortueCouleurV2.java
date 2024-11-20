public class TortueCouleurV2 extends TortueV2 {
    private static final String lesCouleurs[] = { "black", "red", "blue", "green", "yellow" };
    
       public TortueCouleurV2(String coul) {
        couleur = rendCouleur(coul);
    }
    
    public void setCouleur(String coul){
        couleur = rendCouleur(coul);
    }
    
    public String getCouleur() {
        return couleur;
    }
    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toLowerCase();
        return "NOIR";
    }
}