 

/* Cours de POO - Éléments de correction
 * GIRARD PATRICK
 * Date : 10 sept. 2005
 *
 * Ici, on a choisi d'implémenter les couleurs par une chaîne et de mettre une valeur par défaut
 * à noir ; on met également les couleurs en majuscules, en contrôlant leurs valeurs. Si la valeur
 * est incorrecte, la tortue écrit en noir.
 */
public class TortueCouleur {

// Attributs
    // Couleurs
    private static final String lesCouleurs[] = { "black", "red", "blue", "green", "yellow" };
    private String couleur = "black";
    // Abscisse de la tortue
    private int position_x;
    // Ordonnée de la tortue
    private int position_y;
    // Orientation de la tortue
    private int orientation;
    // Dessin ou pas 
    private boolean trace = true;
    
    // Constructeur
    public TortueCouleur() {
        orientation=3;
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
        afficherTortue();
    }
    public String getCouleur() {
        return couleur;
    }
    
    // Toutes les primitives issues de la modélisation UML

    public void tourner() {
        orientation = (orientation + 1) % 4;
        this.afficheInformation();
    }
    public void avancer() {
        switch(orientation) {
                case 0:
                    if (trace) CanvasTortue.ecrisHorizontal(position_x, position_y, couleur);
                    position_x++;
                    break;
                case 1:
                    if (trace) CanvasTortue.ecrisVertical(position_x, position_y, couleur);
                    position_y++;
                    break;
                case 2:
                    position_x--;
                    if (trace) CanvasTortue.ecrisHorizontal(position_x, position_y, couleur);
                    break;
                case 3:
                    position_y--;
                    if (trace) CanvasTortue.ecrisVertical(position_x, position_y, couleur);
            }
        afficherTortue();
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
    
    // Quelques primitives supplémentaires

    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toLowerCase();
        return coul;
    }
    private void afficheInformation() {
        if (trace) {
            System.out.println("Je suis en " + "x:" + position_x + " y:" + position_y);
            System.out.println("J'avance vers " + orientation);
            System.out.println("En ecrivant avec cette couleur " + couleur);
        }
    }
    public int getPositionX() {
        return position_x;
    }
    public int getPositionY() {
        return position_y;
    }
    /**
     * Affichage de la tortue
     */
    public void afficherTortue() {
        switch(orientation) {
            case 0:
                CanvasTortue.tortueEst(position_x, position_y);
                break;
            case 1:
                CanvasTortue.tortueSud(position_x, position_y);
                break;
            case 2:
                CanvasTortue.tortueOuest(position_x, position_y);
                 break;
            case 3:
                CanvasTortue.tortueNord(position_x, position_y);
        }
    }
}