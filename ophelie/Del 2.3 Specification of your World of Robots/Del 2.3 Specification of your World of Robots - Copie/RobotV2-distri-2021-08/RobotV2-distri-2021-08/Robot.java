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
        }
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        if(yPosition >= MIN_POSITION && yPosition <= MAX_POSITION)
        {
            this.yPosition = yPosition;
        }
    }
}