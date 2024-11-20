// Classe TurtleProject
public class Turtle {
    
    private int x;
    private int y;
    private String name;
    private boolean trace;
    private int direction;
    
    public Turtle(String name)
    {
        x = 0;
        y = 0;
        direction = 3;
        trace = true;
    }
    
    public void goForward() {
        if (direction ==0)
            {x=x+1;}
        if (direction ==1)
            {y=y+1;}
        if (direction ==2)
            {x=x-1;}
        if (direction ==3)
            {y=y-1;} 
    }

    public void turn()
    {
     direction = (direction + 1) %4;  
    }
    
    public void draw()
    {
     trace = true;   
    }
    
    public void unDraw()
    {
     trace = false;   
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public boolean getTrace() {
        return trace;
    }
    
    public int getDirection()
    {
     return direction;   
    }
}


