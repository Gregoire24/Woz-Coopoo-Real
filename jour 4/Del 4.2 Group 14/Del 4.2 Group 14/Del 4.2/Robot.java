/**
 * Décrivez votre classe Robot ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Robot {
    private String name;
    private int xPosition;
    private int yPosition;
    
    private final static int MIN_NAME_LENGTH = 3;
    private final static int MIN_POSITION = -5;
    private final static int MAX_POSITION = 5;
    
    private static int numberOfUnnamedRobots = 0;

    private CanvasRobot canvasRobot;
    
    private String colourBody;
    
    public Robot(String nom, String color)
    {
        nom = nom.trim();
        if(nom.length() >= MIN_NAME_LENGTH)
        {
            name = nom;
        } else {
            name = "iRobot " + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;
        }
        xPosition = 0;
        yPosition = 0;
        colourBody = color;
        canvasRobot = new CanvasRobot(color);
        draw();
    }
    
    public Robot(String nom, int xPosition, int yPosition, String color) {
        nom = nom.trim();
        if (nom.length() >= MIN_NAME_LENGTH) {
            name = nom;
        } else {
            name = "iRobot" + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;
        }
        
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) {
            this.xPosition = xPosition;
        } else {
            this.xPosition = 0;
            System.err.println("xPosition must be in the range -5..+5. The X position has been set to 0.");
        }

        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION) {
            this.yPosition = yPosition;
        } else {
            this.yPosition = 0;
            System.err.println("yPosition must be in the range -5..+5. yPosition has been set to 0.");
        }
        colourBody = color.toUpperCase();
        canvasRobot = new CanvasRobot(color);
        draw();
    }

    private void draw()
    {
        canvasRobot.drawRobot(this.xPosition, this.yPosition);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String nom) {
        nom = nom.trim();
        if(nom.length() >= MIN_NAME_LENGTH)
        {
            this.name = nom;
        }
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        if(xPosition >= MIN_POSITION && xPosition <= MAX_POSITION)
        {
            this.xPosition = xPosition;
            draw();
        }
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        if(yPosition >= MIN_POSITION && yPosition <= MAX_POSITION)
        {
            this.yPosition = yPosition;
            draw();
        }
    }
    
    public String getColourBody()
    {
        return colourBody;
    }
    
    public void setColourBody(String newColour)
    {
        colourBody = newColour;
        draw();
    }
    
    public void move(){
        xPosition +=1;
        yPosition +=1;
        draw();
    }
}