import java.io.*;

/**
 * Static functions for a simple usage of the keyboard
 * 
 * @author Patrick Girard 
 * @version 09/08/2010
 */
public class Keyboard
{
      public static String readString () {
        String l = null;
    	try {
    		InputStreamReader in = new InputStreamReader (System.in);
    		BufferedReader inputs = new BufferedReader (in);
    		l = inputs.readLine();
    	}  catch (IOException err) {
    	  System.exit(0);
    	}
    	return l;
      }
      public static int readInt () {
    	String s = readString();
    	int n = Integer.parseInt(s);
    	return n;
      }
      public static double readDouble () {
    	String s = readString();
    	double d = Double.parseDouble(s);
    	return d;
      }
}
