/**
 * Robot class with protected attributes and rules enforcement.
 *
 * @author (Nisrine)
 * @version (11.09.2024)
 */
public class Robot {
    // Instance variables
    private int xPosition;
    private int yPosition;
    private String name;
    
    // Static field to keep track of unnamed robots
    private static int numberOfUnnamedRobots = 0;  // Initialize to 0

    // Define constants
    public static final int MIN_NAME_LENGTH = 3;
    public static final int MIN_POSITION = -5;
    public static final int MAX_POSITION = 5;

    // Constructor with only name parameter
    public Robot(String name) {
        setName(name);  // Validate name
        this.xPosition = 0;  // Default x position
        this.yPosition = 0;  // Default y position
    }

    // Constructor with name, x, and y parameters
    public Robot(String name, int x, int y) {
        setName(name);  // Validate name
        setXPosition(x); // Validate x position
        setYPosition(y); // Validate y position
    }

    // Getter and Setter for name with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= MIN_NAME_LENGTH) {
            this.name = name.trim();  // Trim leading/trailing whitespaces
        } else {
            // Increment the number of unnamed robots and assign default name
            numberOfUnnamedRobots++;
            this.name = "iRobot" + numberOfUnnamedRobots;
        }
    }

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
}
