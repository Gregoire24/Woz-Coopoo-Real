
/**
 * Write a description of class TortueRapide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TortueRapide
{
    // Position de la tortue
    private int x;
    private int y;
    
    // Direction de la tortue
    private int direction;
    
    // Mode de la tortue
    private boolean trace;
    
    // Vitesse de la tortue
    private int vitesse;

    
    /**
     * Constructor for objects of class Tortue
     */
    public TortueRapide()
    {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
        vitesse = 1;
        afficherTortue();
    }

    /**
     * MŽthode permettant ˆ la tortue d'avancer dans la direction fixŽe
      */
    public void avancer()
    {   int ox, oy;
        ox=x;
        oy=y;
        for (int v=vitesse; v>0; v--)
            switch(direction) {
                case 0:
                    if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                    x++;
                    break;
                case 1:
                    if (trace) CanvasTortue.ecrisVertical(x, y, "black");
                    y++;
                    break;
                case 2:
                    x--;
                    if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                    break;
                case 3:
                    y--;
                    if (trace) CanvasTortue.ecrisVertical(x, y, "black");
            }
        afficherEtat();
        if (trace) afficherSegment(ox,oy,x,y);
    }
    
    /**
     * MŽthode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    public void tourner()
    {
        direction++;
        if (direction == 4) direction = 0;
        afficherEtat();
    }
    
    /**
     * Affichage de l'Žtat de la tortue
     */
    public void afficherEtat()
    {
        System.out.println("La tortue est en x:" + x + ", y:" + y +
                            ", et en direction : " + direction + 
                            " de " + vitesse + " cases");
        if (trace)
            System.out.println("La tortue trace");
        else
            System.out.println("La tortue ne trace pas");
        // Affichage graphique
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
    
    /**
     * MŽthode utilitaire d'affichage de segment
     *
     * @param  ox oy   coordonnŽes initiales du segment
     * @param  x y   coordonnŽes finales du segment
     */
    public void afficherSegment(int ox, int oy, int x, int y)
    {
        System.out.println("segment (" + ox + "," + oy + "),(" +
                            x + "," + y + ")" );
       
    }
    
    /**
     * MŽthode permettant de tracer ou non
     * Remarque : cette implŽmentation n'est pas correcte : elle ne garantit pas 
     * un appel correct des mŽthodes ; on peut appeler deux fois de suite 
     * tracer(true) par exemple
     *
     * @param  mode   boolŽen reprŽsentant le mode de trace (vrai ou faux)
      */
    public void tracer(boolean mode)
    {
        trace = mode;
        afficherEtat();
    }
    
    /**
     * Premire implŽmnetation : paramŽtrer avancer
     *
     * @param  v   vitesse de la tortue (par dŽfaut 1)
     */
    public void avancer(int v)
    {
        int ox, oy;
        ox=x;
        oy=y;
        
        for (int vit=vitesse; v>0; v--)
            switch (direction) {
            case 0: x+=v; if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
            break;
            case 1: y+=v; if (trace) CanvasTortue.ecrisVertical(x, y, "black");
            break;
            case 2: x-=v; if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
            break;
            case 3: y-=v;
            if (trace) CanvasTortue.ecrisVertical(x, y, "black");
        } 
        afficherEtat();
        if (trace) afficherSegment(ox,oy,x,y);
    }
    
    /**
     * Deuxime implŽmentation : changer la vitesse
     *
     * @param  v   nouvelle vitesse
     */
    public void setVitesse(int v)
    {
         vitesse = v;
         afficherEtat();
    }
    
    public void accelerer()
    {
        vitesse++;
    }
    
    public void ralentir()
    {
        if (vitesse>0) vitesse--;
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
