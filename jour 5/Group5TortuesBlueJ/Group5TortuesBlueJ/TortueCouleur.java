 /* Cours de POO - �l�ments de correction
 * GIRARD PATRICK
 * Date : 10 sept. 2005
 *
 * Ici, on a choisi d'impl�menter les couleurs par une cha�ne et de mettre une valeur par d�faut
 * � noir ; on met �galement les couleurs en majuscules, en contr�lant leurs valeurs. Si la valeur
 * est incorrecte, la tortue �crit en noir.
 */
    public class TortueCouleur extends TortueG{
    // Attributs
    // Couleurs
    private static final String lesCouleurs[] = { "BLACK", "RED", "BLUE", "FGREEN", "YELLOW" };
    private String couleur;
    // Abscisse de la tortue
    private int x;
    // Ordonn�e de la tortue
    private int y;
    // Orientation de la tortue
    private int direction;
    // Dessin ou pas 
    private boolean trace = true;
    
    // Constructeur
    public TortueCouleur() {
        direction=3;
        afficherTortue();
    }

    // Constructeur avec couleur
    public TortueCouleur(String coul) {
        //    this();
        couleur = rendCouleur(coul);
        afficherTortue();
    }
    
    public void setCouleur(String coul){
        couleur = rendCouleur(coul);
    }
    
    public String getCouleur() {
        return couleur;
    }
    
    // Toutes les primitives issues de la mod�lisation UML

    public void tourner() {
        direction = (direction + 1) % 4;
        this.afficheInformation();
    }
    
    
    
    public void tracer() {
        trace = true;
    }
    
    public void nePasTracer() {
        trace = false;
    }
    
    public boolean enTrace() {
        return trace;
    }
    
    // Quelques primitives suppl�mentaires

    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toUpperCase();
        return coul;
    }
    
    private void afficheInformation() {
        if (trace) {
            System.out.println("Je suis en " + "x:" + x + " y:" + y);
            System.out.println("J'avance vers " + direction);
            System.out.println("En ecrivant avec cette couleur " + couleur);
        }
    }
    
    public int getPositionX() {
        return x;
    }
    
    public int getPositionY() {
        return y;
    }
    
    /**
     * Affichage de la tortue
     */
    public void afficherTortue() {
        switch(direction) {
            case 0:
                CanvasTortue.tortueEst(x, y);
                break;
            case 1:
                CanvasTortue.tortueSud(x, y);
                break;
            case 2:
                CanvasTortue.tortueOuest(x, y);
                 break;
            case 3:
                CanvasTortue.tortueNord(x, y);
        }
    }
}