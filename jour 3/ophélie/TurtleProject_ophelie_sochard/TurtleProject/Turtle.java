
/**
 * Décrivez votre classe Turtle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Turtle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private int y;
    private int direction;
    private boolean trace;

    public  Turtle (){
        x=0;
        y=0;
        direction=3;
        trace= true;
    }
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public boolean getTrace() {
        return trace;
    }
    
    public void draw(){
        trace=true;
    }
    
    public void undraw(){
        trace=false;  
    }
    
    public void turn(){
        direction= (direction+1) %4;
    }
    
    public void goforward(){
        if (direction ==0)
            {x=x+1;}
        if (direction ==1)
            {y=y+1;}
        if (direction ==2)
            {x=x-1;}
        if (direction ==3)
            {y=y-1;}    
            
    }
}
