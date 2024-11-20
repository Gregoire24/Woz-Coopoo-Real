// 

public class Robot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int xPosition;
    private int yPosition;
    
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MIN_POSITION = 0;
    private static final int MAX_POSITION = 10;

    private static int numberOfUnnamedRobots = 0;
    
    private CanvasRobot canvasRobot;
    
    private String colourBody;
    

    //Start GetterSetterExtension Source Code
    public Robot (String name, String colourBody) {
        if (name.trim().length() >= MIN_NAME_LENGTH) this.name = name.trim();
        else {
          numberOfUnnamedRobots ++;   
          this.name = "iRobot" + numberOfUnnamedRobots;
        }
        //this.colourBody = colourBody.toUpperCase();
        if (contain(colourBody.toUpperCase())) {
            this.colourBody = colourBody.toUpperCase();
        } else {
            this.colourBody = "BLUE";
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
        //this.colourBody = colourBody.toUpperCase();
        if (contain(colourBody.toUpperCase())) {
            this.colourBody = colourBody.toUpperCase();
        } else {
            this.colourBody = "BLUE";
        }
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(xPosition,yPosition);
    }
    /**GET Method Propertie nom*/
    public String getName(){
        return this.name;
    }//end method getNom

    /**SET Method Propertie nom*/
    public void setName(String name){
        name.trim();
        if (name.length() >= MIN_NAME_LENGTH) this.name = name;
    }//end method setNom

    /**GET Method Propertie xPos*/
    public int getXPosition(){
        return this.xPosition;
    }//end method getXPos

    /**SET Method Propertie xPos*/
    private void setXPosition(int xPosition){
        if (xPosition >= MIN_POSITION && xPosition <= MAX_POSITION) this.xPosition = xPosition;
    }//end method setXPos

    /**GET Method Propertie yPos*/
    public int getYPosition(){
        return this.yPosition;
    }//end method getYPos

    /**SET Method Propertie yPos*/
    private void setYPosition(int yPosition){
        if (yPosition >= MIN_POSITION && yPosition <= MAX_POSITION)this.yPosition = yPosition;
    }//end method setYPos

    /**SET Method Propertie colourBody*/
    public void setColourBody(String colourBody){
        this.colourBody = colourBody.toUpperCase();
    }//end method setColourBody

    /**GET Method Propertie colourBody*/
    public String getColourBody(){
        return this.colourBody;
    }//end method getColourBody
    
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


}//End class