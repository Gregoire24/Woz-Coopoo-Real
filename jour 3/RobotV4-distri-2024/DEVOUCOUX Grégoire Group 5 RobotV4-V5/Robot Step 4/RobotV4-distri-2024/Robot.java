/**
 * Robot class with protected attributes and rules enforcement.
 *
 * @author (votre nom)
 * @version (11.09.2024)
 */
public class Robot {
    // Instance variables
    private int xPosition;
    private int yPosition;
    private String name;
    private CanvasRobot canvasRobot;
    private String colourBody;

    // Static field to keep track of unnamed robots
    private static int numberOfUnnamedRobots = 0;  // Initialize to 0

    // Define constants
    public static final int MIN_NAME_LENGTH = 3;
    public static final int MIN_POSITION = -5;
    public static final int MAX_POSITION = 5;

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

    // Constructor with name, x, and y parameters
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

    // Getter and Setter for name with validation
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
    
    /*public void setName(String name) {
        if (name != null && name.trim().length() >= MIN_NAME_LENGTH) {
            this.name = name.trim();  // Trim leading/trailing whitespaces
        } else {
            // Increment the number of unnamed robots and assign default name
            numberOfUnnamedRobots++;
            this.name = "iRobot" + numberOfUnnamedRobots;
        }
    }*/

    // Getter and Setter for xPosition with validation
    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) {
            this.xPosition = xPosition;
        } else {
            this.xPosition = 0;  // Set to default if invalid
        }
    }

    // Getter and Setter for yPosition with validation
    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION) {
            this.yPosition = yPosition;
        } else {
            this.yPosition = 0;  // Set to default if invalid
        }
    }
    
    private void draw()
    {
        canvasRobot.drawRobot(this.xPosition, this.yPosition);
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
}
