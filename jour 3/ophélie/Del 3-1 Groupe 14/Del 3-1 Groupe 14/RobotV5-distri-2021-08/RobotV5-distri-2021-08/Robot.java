public class Robot {
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MIN_POSITION = -5;
    private static final int MAX_POSITION = 5;
    private static int numberOfUnnamedRobots = 1;


    private String name;
    private int xPosition;
    private int yPosition;
    private CanvasRobot canvasRobot; 
    
    private String colourBody;
    
    public Robot(String name, String colourBody) {
        // Vérification du nom et ajout du numéro si nécessaire
        if (name.trim().length() >= MIN_NAME_LENGTH) {
            this.name = name.trim();
        } else {
            this.name = "iRobot" + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;
        }
        this.xPosition = 0;
        this.yPosition = 0;
        this.colourBody=colourBody;
        canvasRobot = new CanvasRobot(this.colourBody);
        draw();
    }

    public Robot(String name, int xPosition, int yPosition, String colours) {
        this.colourBody=colours; 
        // Vérification du nom et ajout du numéro si nécessaire
        if (name.trim().length() >= MIN_NAME_LENGTH) {
            this.name = name.trim();
        } else {
            this.name = "iRobot" + numberOfUnnamedRobots;
            numberOfUnnamedRobots++;
        }

        // Vérification des positions
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
        canvasRobot = new CanvasRobot(this.colourBody);
        draw();
    }
    
    public void draw()
    {
        canvasRobot.drawRobot(xPosition, yPosition);
    }
    
    public String getName() {
        return name;
    }

    public static int getNumberOfUnnamedRobots() {
        return numberOfUnnamedRobots;
    }

    public void setName(String name) {
        // Vérification de la longueur du nom
        if (name.trim().length() >= MIN_NAME_LENGTH) {
            this.name = name.trim();
        } else {
            System.err.println("Name must have at least 3 characters");
        }
    }

    public int getXPosition() {
        return xPosition;
    }

    private void setXPosition(int xPosition) {
        // Vérification de la plage de la position X
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) {
            this.xPosition = xPosition;
            draw();
        } else {
            System.err.println("xPosition must be in the range -5..+5.");
        }
    }

    public int getYPosition() {
        return yPosition;
    }

    private void setYPosition(int yPosition) {
        // Vérification de la plage de la position Y
        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION) {
            this.yPosition = yPosition;
            draw();
        } else {
            System.err.println("yPosition must be in the range -5..+5.");
        }
    }
    
    public void setColourBody(String colourBody){
        this.colourBody= colourBody;
        draw();
    }
    
    public String getColourBody(){
        return colourBody;
    }
    
    public void move(){
        xPosition +=1;
        yPosition +=1;
        draw();
    }
}
