import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
 * Draws robots on a canvas.
 * 
 * @author Patrick Girard 
 * @version August 2012
 */
public class CanvasRobot
{
    static private Canvas canvas = Canvas.getCanvas(); 
    static private Random randomGenerator;
    
    private int n = 0;
    private int lo = 30;
    private int la = 31;
    private int plo = 8;
    private int pla = 10;
    private int tlo = 26;
    private int tla = 13;
    private int qla = 4;
    private int milieu = 240;
    static private String couleurTete = "red";
    static private String couleurCorps = "blue";
    static private String couleurPattes = "black";
    static private String couleurOeil = "blue";
    private Integer corps;
    private Integer brasG;
    private Integer brasD;
    private Integer jambeG;
    private Integer jambeD;
    private Integer tete;
    private Integer oeilD;
    private Integer oeilG;

    /**
     * CanvasRobot Constructor - Creates a new graphical robot, which can be drawn. 
     * The robot is not drawn at this time (no coordinates)
     * 
     */
    public CanvasRobot ( )
    {
        // The random generator is instanciated if necessary
        if (randomGenerator == null) randomGenerator = new Random();
        // The different objects of the robot are instanciated, to allow the process of identification 
        // of graphical objects in the canvas. 
        corps = new Integer(randomGenerator.nextInt());
        brasG = new Integer(randomGenerator.nextInt());
        brasD = new Integer(randomGenerator.nextInt());
        jambeG = new Integer(randomGenerator.nextInt());
        jambeD = new Integer(randomGenerator.nextInt());
        tete = new Integer(randomGenerator.nextInt());
        oeilD = new Integer(randomGenerator.nextInt());
        oeilG = new Integer(randomGenerator.nextInt());
    }
    /**
     * Draws a robot onto the canvas - No verification on the coordinates. 
     * If the robot was already drawn, it is erased (thanks to Canvas)
     *
     * @param  x,y  robot position
     */
    public void drawRobot(int x, int y, String color)
    {
        int xp = x*50 ;
        int yp = y*50 ;
        canvas.draw(brasG, couleurPattes, new Rectangle(xp, yp+15, 
                                     plo, pla));
        canvas.draw(brasD, couleurPattes, new Rectangle(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(jambeG, couleurPattes, new Rectangle(xp+10, yp+40, 
                                     plo, pla));
        canvas.draw(jambeD, couleurPattes, new Rectangle(xp+la-8, yp+40, 
                                     plo, pla));
        canvas.draw(tete, couleurTete, new Rectangle(xp+14, yp, 
                                     tla, tlo));
        canvas.draw(oeilG, couleurOeil, new Ellipse2D.Double(xp+16, yp+2, 
                                     qla, qla));
        canvas.draw(oeilD, couleurOeil, new Ellipse2D.Double(xp+21, yp+2, 
                                     qla, qla));
        canvas.draw(corps, color, new Rectangle(xp+5, yp+10, 
                                     la, lo));
                                     
    }
}
