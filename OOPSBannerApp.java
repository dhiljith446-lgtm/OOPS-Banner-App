public class OopsBannerApp {
    
    // Static method for letter O pattern
    public static String[] getLetterO() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*   *** *",
            "*     * *",
            "*     * *",
            "******* *"
        };
    }
    
    // Static method for letter P pattern
    public static String[] getLetterP() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        };
    }
    
    // Static method for letter S pattern
    public static String[] getLetterS() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "        *",
            "        *",
            "*********"
        };
    }
    
    // Static method to combine letters with spaces
    public static String combineLines(String[] letter1, String[] letter2, String[] letter3) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            result.append(letter1[i])
                  .append("     ")
                  .append(letter2[i])
                  .append("     ")
                  .append(letter3[i])
                  .append("\n");
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        // Get patterns for O, P, S
        String[] O = getLetterO();
        String[] P = getLetterP();
        String[] S = getLetterS();
        
        // Combine and display
        System.out.println("\n=== OOPS BANNER (UC6 - Static Functions) ===\n");
        System.out.println(combineLines(O, P, S));
    }
}