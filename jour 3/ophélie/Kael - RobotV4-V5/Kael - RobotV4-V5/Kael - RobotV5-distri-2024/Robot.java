public class Robot
{
    private String name;
    private int xPosition;
    private int yPosition;

    private static int numberOfUnnamedRobots = 0;
    
    private CanvasRobot canvasRobot;
    
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MIN_POSITION = 0;
    private static final int MAX_POSITION = 10;
    
    private String colourBody;
    
    public Robot (String name, String colourBody) {
        if (name.trim().length() >= MIN_NAME_LENGTH) this.name = name.trim();
        else {
          numberOfUnnamedRobots ++;   
          this.name = "iRobot" + numberOfUnnamedRobots;
        }
        
        if (contain(colourBody.toUpperCase())) {
            this.colourBody = colourBody.toUpperCase();
        } else {
            this.colourBody = "RED";
        }
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(xPosition,yPosition);
    }
    
    public Robot (String name, int xPosition, int yPosition, String colourBody) {
        if (name.trim().length() >= MIN_NAME_LENGTH) this.name = name.trim();
        else {
          numberOfUnnamedRobots ++;   
          this.name = "iRobot" + numberOfUnnamedRobots;  
        }
        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION) {this.yPosition = yPosition;}
        else {this.yPosition = 0;}
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) {this.xPosition = xPosition;}
        else {this.xPosition = 0;}
        
        if (contain(colourBody.toUpperCase())) {
            this.colourBody = colourBody.toUpperCase();
        } else {
            this.colourBody = "RED";
        }
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(xPosition,yPosition);
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        name.trim();
        if (name.length() >= MIN_NAME_LENGTH) this.name = name;
    }

    public int getXPosition(){
        return this.xPosition;
    }

    private void setXPosition(int xPosition){
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) this.xPosition = xPosition;
    }

    private void setYPosition(int yPosition){
        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION)this.yPosition = yPosition;
    }
    
    public int getYPosition(){
        return this.yPosition;
    }

    public void setColourBody(String colourBody){
        this.colourBody = colourBody.toUpperCase();
    }

    public String getColourBody(){
        return this.colourBody;
    }
    
    private boolean contain (String text) {
        for (Colour color : Colour.values()) { 
            if (color.name().equals(text)) return true;
        }
        return false;
    }
    
    public void move(){
        if (yPosition < MAX_POSITION && xPosition < MAX_POSITION){
            yPosition++;
            xPosition++;
        }
        canvasRobot.drawRobot(xPosition,yPosition);
    }


}