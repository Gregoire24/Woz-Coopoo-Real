
/**
* La tortue du programme LOGO. Dans cet exemple, il n'y a pas les accesseurs des attributs.
* On peut visualiser l'?tat, mais pas le reste.
*
* @author PG
* @version 15/08/2006
*/
public class TortueV2 {
    // Position de la tortue
    public int x;
    public int y;
    public int vitesse;
    public String couleur = "black";
    // Direction de la tortue
    public int direction;

    // Mode de la tortue
    public boolean trace;

    /**
    * Constructor for objects of class Tortue
    */
    public TortueV2() {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
        vitesse=1;
    }

    /**
     * Accesseur de la direction
     *
     * @return     la valeur de la direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * M?thode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    public void tourner() {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherEtat();
    }

    public void afficherEtat() {
        System.out.println("La tortue est en x:" + x + ", y:" + y + ", et en direction : " + direction);
        if(trace)
            System.out.println("La tortue trace");
        else
            System.out.println("La tortue ne trace pas");
    }

    public void tracer(boolean mode) {
        trace = mode;
        afficherEtat();
    }
    
    public void afficherTortue() {
        switch(direction) {
            case 0:
                CanvasTortueV2.tortueEst(x, y);
        
                break;
            case 1:
                CanvasTortueV2.tortueSud(x, y);
                break;
            case 2:
                CanvasTortueV2.tortueOuest(x, y);
                 break;
            case 3:
                CanvasTortueV2.tortueNord(x, y);
        }
    }
    public void afficherSegment(int ox, int oy, int x, int y)
    {
        System.out.println("segment (" + ox + "," + oy + "),(" +
                            x + "," + y + ")" );
       
    }
    
    public void avancer()
    {   int ox, oy;
        ox=x;
        oy=y;
        for (int v=vitesse; v>0; v--)
            switch(direction) {
            case 0:
                x++;
                if (trace) CanvasTortueV2.ecrisHorizontal(x, y, couleur);
                break;
            case 1:
                y++;
                if (trace) CanvasTortueV2.ecrisVertical(x, y, couleur);
                break;
            case 2:
                x--;
                if (trace) CanvasTortueV2.ecrisHorizontal(x, y, couleur);
                break;
            case 3:
                y--;
                if (trace) CanvasTortueV2.ecrisVertical(x, y, couleur);
        }
        afficherEtat();
        afficherTortue();
        if(trace)
            afficherSegment(ox, oy, x, y);
    }
}