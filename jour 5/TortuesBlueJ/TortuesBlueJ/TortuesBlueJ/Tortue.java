/**
 * La tortue du programme LOGO. Dans cet exemple, il n'y a pas les accesseurs des attributs.
 * On peut visualiser l'état, mais pas le reste.
 *
 * @author PG
 * @version 15/08/2006
 */
public class Tortue {
    // Position de la tortue
    private int x;
    private int y;

    // Direction de la tortue (0: droite, 1: bas, 2: gauche, 3: haut)
    private int direction;

    // Mode de la tortue (trace ou non)
    private boolean trace;

    /**
     * Constructeur de la classe Tortue
     */
    public Tortue() {
        // Initialise la position à (0, 0), la direction à 3 (haut), et le mode de trace à true
        x = 0;
        y = 0;
        direction = 3;
        trace = true;
    }

    /**
     * Accesseur de la direction
     *
     * @return la valeur de la direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Méthode permettant à la tortue d'avancer dans la direction fixée
     */
    public void avancer() {
        int ox = x;
        int oy = y;
        
        switch(direction) {
            case 0: // Droite
                x++;
                break;
            case 1: // Bas
                y++;
                break;
            case 2: // Gauche
                x--;
                break;
            case 3: // Haut
                y--;
                break;
        }
        
        afficherEtat();
        
        if (trace) {
            afficherSegment(ox, oy, x, y);
        }
    }

    /**
     * Méthode permettant de tourner dans le sens des aiguilles d'une montre
     */
    public void tourner() {
        direction++;
        if (direction == 4) {
            direction = 0;
        }
        afficherEtat();
    }

    /**
     * Affichage de l'état de la tortue
     */
    public void afficherEtat() {
        System.out.println("La tortue est en x:" + x + ", y:" + y + ", et en direction : " + direction);
        if (trace) {
            System.out.println("La tortue trace.");
        } else {
            System.out.println("La tortue ne trace pas.");
        }
    }

    /**
     * Méthode utilitaire d'affichage de segment
     *
     * @param ox coordonnées x initiales du segment
     * @param oy coordonnées y initiales du segment
     * @param x  coordonnées x finales du segment
     * @param y  coordonnées y finales du segment
     */
    private void afficherSegment(int ox, int oy, int x, int y) {
        System.out.println("segment (" + ox + "," + oy + "),(" + x + "," + y + ")");
    }

    /**
     * Méthode permettant de définir si la tortue trace ou non
     * 
     * @param mode booléen représentant le mode de trace (true ou false)
     */
    public void tracer(boolean mode) {
        trace = mode;
        afficherEtat();
    }
    
    public int getX() {
    return x;
    }

    public int getY() {
    return y;
    }
}
