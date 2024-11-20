
/** 
 * Fully functional version (non object-oriented) of the turtle
 * 
 * @author Patrick Girard
 * @version 10/08/2010
 */
public class FunctionalTurtle
{
    
    private FunctionalTurtle() {
        // This is only to prevent instantiating an object
    }

    public static void main () {

        // The position of the turtle
        int x=0;
        int y=0;
        // The direction of the turtle (0=East, 1=South, 2=West, 3=North)
        int direction=3;
        // Drawing mode of the turtle
        boolean trace=true;

        // User choice
        int choice;
        
        do {
            System.out.print("Order the turtle - <1> Go forward <2> Turn <3> Draw <4> UnDraw <0> End :");
            choice = Keyboard.readInt();
            switch (choice) {
                case 0: break;
                case 1: switch (direction) {
                            case 0: x++; break;
                            case 1: y++; break;
                            case 2: x--; break;
                            case 3: y--;
                        }; break;
                case 2: direction++;
                        if (direction == 4) direction = 0;
                        break;
                case 3: trace=true;
                        break;
                case 4: trace=false;
                        break;
                default: System.out.println("Unknown command");
            }
            printTurtle(x,y,direction,trace);
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
