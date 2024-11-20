
/**
 * Décrivez votre classe Robot ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Robot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int xPosition = 50;
    private int yPosition = 100;
    
    /**
     * Constructeur d'objets de classe Robot
     */
    public Robot(String name, int xPosition, int yPosition)
    {
        this.name = name;
    }
    
    public void setName(String name, String newName) 
    {
        this.name = name;
        if (name.length > 3) name = newName;
        else{
            return;
        }
    }
    
    public String getName()
    {
        return (name);
    }
    
    public void setXPosition(int xPosition)
    {
        this.xPosition = xPosition;
    }
    
    public int getXPosition()
    {
        return (xPosition);
    }
    
    public void setYPosition(int yPosition)
    {
        this.yPosition = yPosition;
    }
    
    public int getYPosition()
    {
        return (yPosition);
    }
    
    /**
     * Move the robot horizontally by 'distance' pixels.
     */
    /**public void moveHorizontal(int distance)
    {
        if (xPosition > 0) xPosition += distance;
        else{
            return;
            }
        
    }
    
    /**
     * Move the robot vertically by 'distance' pixels.
     */
    /**public void moveVertical(int distance)
    {
        
        yPosition += distance;
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
   // public int sampleMethod(int y)
    //{
        // Insérez votre code ici
     //   return x + y;
    //}
}
