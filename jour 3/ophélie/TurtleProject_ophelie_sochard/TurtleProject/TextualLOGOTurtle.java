
/** 
 * Full version (object-oriented) of the turtle
 * 
 * @author Patrick Girard
 * @version 10/08/2010
 */
public class TextualLOGOTurtle
{
    
    private TextualLOGOTurtle() {
        // This is only to prevent instantiating an object
    }

    public static void main (String[] args) {
        Turtle myTurtle = new Turtle();
        
        // User choice
        int choice;
        
        do {
            System.out.print("Order the turtle - <1> Go forward <2> Turn <3> Draw <4> UnDraw <0> End :");
            choice = Keyboard.readInt();
            switch (choice) {
                case 0: 
                        break;
                case 1: 
                        myTurtle.goforward();
                case 2: 
                        myTurtle.turn();
                case 3:  
                        myTurtle.draw();
                case 4: 
                        myTurtle.undraw();
                default: System.out.println("Unknown command");
            }
            // à compléter
            // printTurtle( , , , );
        } while (choice!=0);
        System.out.println("Bye bye...");
    }
    
    // Print the position of the turtle
    private static void printTurtle(int x, int y, int d, boolean t) {
        System.out.print("The turtle is in x:" + x + ", y:" + y +
                        ", and oriented to : " + d);
        if (t)
            System.out.println(" - The turtle draws");
        else
            System.out.println(" - The turtle does not draw");
    }

}
