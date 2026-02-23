/**
 * OOPS Banner Application - Use Case 3
 * ASCII art using String.join() for memory efficiency
 * 
 * @author Your Name
 * @version 3.0
 */
public class OOPSBannerApp {
    
    public static void main(String[] args) {
        // Line 1: Top of letters
        System.out.println(String.join("", 
            "  ___    ___    ___    ___    ___  "));
        
        // Line 2: Upper middle
        System.out.println(String.join("", 
            " / _ \\  ", "/ _ \\  ", "/ _ \\  ", "/ _ \\  ", "/ _ \\ "));
        
        // Line 3: Middle
        System.out.println(String.join("", 
            "| (_) |", " (_) |", " (_) |", " (_) |", " (_) |"));
        
        // Line 4: Bottom
        System.out.println(String.join("", 
            " \\___/  ", "\\___/  ", "\\___/  ", "\\___/  ", "\\___/ "));
    }
}