import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Reads a file where the user's hands were one key to far to the right.
 * Outputs to standard output what the user intended to type.
 *
 */
public class Typo {
    // The map from mistyped characters to the intended characters.
    private static Map<Character, Character> corrections = new HashMap<>();
    
    private static void initCorrections() {
        // ============== TODO:  You need to initialize this map. ==============
        
        // Hint: Use the method corrections.put(,) to setup character changes.
        //       Comment out the following line after you're done.
        
        System.out.println ("The initCorrections method is not implemented yet.");
        
        // =====================================================================
    }
    
    public static void main (String[] args) {
        
        // Initialize the HashMap
        System.out.println("Welcome to the Typo Correction System.");
        initCorrections();
        
        // Get the file name.  Exit if none was provided.
        if (args.length == 0) {
            System.out.println("Please enter a file name when you run the program");
            return;
        }
        
        // Read and correct the file.
        try (Scanner in = new Scanner (new File (args[0]))) {
            while (in.hasNext()) {
                String notCorrected = in.nextLine();
                System.out.println ("Before:  " + notCorrected);
                String corrected = correct (notCorrected);
                System.out.println ("After:   " + corrected);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + args[0] + " could not be found.");
        }
    }

    /**
     * Correct one line by shifting the characters one to the left on the keyboard.
     * @param line the line that was mis-typed
     * @return the corrected line
     */
    private static String correct(String line) {
        // ============== TODO:  You need to implement this method. ==============
        
        // Hint: Create a new string using the StringBuilder class.
        //       Comment out the following placeholder code after you're done.
        
        return line;
        
        // =====================================================================
    }
}
