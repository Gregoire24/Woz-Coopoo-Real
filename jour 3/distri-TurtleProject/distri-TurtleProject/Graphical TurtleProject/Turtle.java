/**
 * Décrivez votre classe Turtle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Turtle
{
    // variables d'instance
    private int x;
    private int y;
    private int direction;
    private boolean trace;
    private String color = "black";


    /**
     * Constructeur d'objets de classe Turtle
     */
    public Turtle()
    {
        // initialisation des variables d'instance
        x = 0;
        y = 0;
        direction = 3 ;
        trace = false;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getDirection(){
        return direction;
    }
    
    public boolean getTrace(){
        return trace;
    }
    
    public void draw(){
        trace = true;  
    }
    
    public void undraw(){
        trace = false;
    }
    
    public void turn(){
        direction = (direction + 1)%4;
        show();
    }
    
    public void goforward(){
        if (direction == 3){
            y--;
            if (trace) CanvasTurtle.drawLineSouth(x,y,color);
        }
        if (direction == 2){
            x--;
            if (trace) CanvasTurtle.drawLineEast(x,y,color);
        }
        if (direction == 1){
            y++;
            if (trace) CanvasTurtle.drawLineNorth(x,y,color); 
        }
        if (direction == 0){
            x++;
            if (trace) CanvasTurtle.drawLineWest(x,y,color);
        }
        show();
    }
    
        private void show(){
        switch(direction){
            case 0:CanvasTurtle.drawTurtleEast(x,y); break;
            
            case 1:CanvasTurtle.drawTurtleSouth(x,y); break;
            
            case 2:CanvasTurtle.drawTurtleWest(x,y); break;
            
            case 3:CanvasTurtle.drawTurtleNorth(x,y); break;
            
        }
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public String getColor(){
        return color;
    }
}
