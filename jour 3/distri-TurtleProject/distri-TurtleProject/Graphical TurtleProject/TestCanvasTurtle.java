
/**
 * Test and example for the Turtle Canvas
 * 
 * @author Patrick Girard    
 * @version 11/08/2020 
 */
public class TestCanvasTurtle
{

    // to avoid instantiating the class
    private TestCanvasTurtle() {};
    
    public static void main()
    {
        CanvasTurtle.drawLineSouth (1,1, "black");
        CanvasTurtle.drawLineEast(1,1, "red");
        CanvasTurtle.drawLineSouth (2,1, "yellow");
        CanvasTurtle.drawLineEast(1,2, "magenta");
        CanvasTurtle.drawLineEast(3,3, "blue");
        CanvasTurtle.drawTurtleEast(4,3);
        CanvasTurtle.drawLineEast(-3,-3, "green");
    }
}
