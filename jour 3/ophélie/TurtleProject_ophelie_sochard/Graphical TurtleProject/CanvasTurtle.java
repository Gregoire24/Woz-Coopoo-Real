import java.awt.*;
import java.awt.geom.*;

/**
 * A class to draw a turtle and lines
 * 
 * @author Patrick Girard 
 * @version 11/08/2020
 */
public class CanvasTurtle
{
    // instance variables - replace the example below with your own
    static private int n = 0;
    static private int lo = 40;
    static private int la = 30;
    static private int plo = 8;
    static private int pla = 5;
    static private int tlo = 16;
    static private int tla = 9;
    static private int qla = 3;
    static private int midth = 240;
    static private String headColor = "red";
    static private String bodyColor = "green";
    static private String pawColor = "blue";
    static private String tailColor = "blue";
    static private String body = "Body";
    static private String pawFL = "Front Left Paw";
    static private String pawFR = "Front Right Paw";
    static private String pawRL = "Rear Left Paw";
    static private String pawRR = "Rear Right Paw";
    static private String head = "Head";
    static private String tail = "Tail";
    
    private CanvasTurtle () { };
    
    /**
     * Draws a North oriented turtle
     *
     * @param  x,y  turtle position
     */
    public static void drawTurtleNorth(int x, int y)
    {
        int xp = x*50 + midth + 5;
        int yp = y*50 + midth;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(pawFL, pawColor, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(pawFR, pawColor, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(pawRL, pawColor, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(pawRR, pawColor, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(head, headColor, new Ellipse2D.Double(xp+15, yp-5, 
                                     tla, tlo));
        canvas.draw(tail, tailColor, new Ellipse2D.Double(xp+19, yp+lo, 
                                     qla, tlo));
        canvas.draw(body, bodyColor, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
                                     
    }
    /**
     * Draws a South oriented turtle
     *
     * @param  x,y  turtle position
     */
    public static void drawTurtleSouth(int x, int y)
    {
        int xp = x*50 + midth + 5;
        int yp = y*50 + midth;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(pawFL, pawColor, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(pawFR, pawColor, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(pawRL, pawColor, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(pawRR, pawColor, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(head, headColor, new Ellipse2D.Double(xp+15, yp+lo, 
                                     tla, tlo));
        canvas.draw(tail, tailColor, new Ellipse2D.Double(xp+19, yp-6, 
                                     qla, tlo));
        canvas.draw(body, bodyColor, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
                                     
    }
    
    /**
     * Draws an East oriented turtle
     *
     * @param  x,y  turtle position
     */
    public static void drawTurtleEast(int x, int y)
    {
        int xp = x*50 + midth;
        int yp = y*50 + midth + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(pawFL, pawColor, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(pawFR, pawColor, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(pawRL, pawColor, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(pawRR, pawColor, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(head, headColor, new Ellipse2D.Double(xp+lo, yp+15, 
                                     tlo, tla));
        canvas.draw(tail, tailColor, new Ellipse2D.Double(xp-6, yp+19, 
                                     tlo, qla));
        canvas.draw(body, bodyColor, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
                                     
    }
    
    /**
     * Draws a West oriented turtle
     *
     * @param  x,y  turtle position
     */
    public static void drawTurtleWest(int x, int y)
    {
        int xp = x*50 + midth;
        int yp = y*50 + midth + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(pawFL, pawColor, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(pawFR, pawColor, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(pawRL, pawColor, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(pawRR, pawColor, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(head, headColor, new Ellipse2D.Double(xp-5, yp+15, 
                                     tlo, tla));
        canvas.draw(tail, tailColor, new Ellipse2D.Double(xp+lo, yp+19, 
                                     tlo, qla));
        canvas.draw(body, bodyColor, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
                                     
    }

    /**
     * Draws a colored line towards the South
     *
     * @param  x1,y1   starting position (grid coordinates)
     */
    public static void drawLineSouth(int x1, int y1, String color)
    {
        String line = new String("Line" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + midth + 23;
        int yPosition = y1*50 + midth + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(line, color,
                        new Rectangle(xPosition, yPosition, la, lo));
    }


    /**
     * Draws a colored line towards the North
     *
     * @param  x1,y1   starting position (grid coordinates)
     */
    public static void drawLineNorth(int x1, int y1, String color)
    {
        String line = new String("Line" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + midth + 23;
        int yPosition = --y1*50 + midth + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(line, color,
                    new Rectangle(xPosition, yPosition, la, lo));
    }
    
    /**
     * Draws a colored line towards the East
     *
     * @param  x1,y1   starting position (grid coordinates)
     */
    public static void drawLineEast(int x1, int y1, String color)
    {
        String line = new String("Line" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + midth + 23;
        int yPosition = y1*50 + midth + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(line, color,
                    new Rectangle(xPosition, yPosition, lo, la));
    }
       
    /**
     * Draws a colored line towards the West
     *
     * @param  x1,y1   starting position (grid coordinates)
     */
    public static void drawLineWest(int x1, int y1, String color)
    {
        String line = new String("Line" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = --x1*50 + midth + 23;
        int yPosition = y1*50 + midth + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(line, color,
                    new Rectangle(xPosition, yPosition, lo, la));
    }
   
    public static void bad()
    {
        CanvasTurtle.drawTurtleNorth(1,-2);
        CanvasTurtle.drawLineSouth (1,-2, "red");
    }

    public static void ok()
    {
        CanvasTurtle.drawLineSouth (-1,-2, "green");
        CanvasTurtle.drawTurtleNorth(-1,-2);
    }
}
