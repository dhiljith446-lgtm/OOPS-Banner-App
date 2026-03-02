public class OopsBannerApp {
    public static void main(String[] args) {
        
        // UC5: Array initialization with String.join() in ONE statement
        String[] banner = {
            String.join("", "*********", "     ", "*********", "     ", "*********"),
            String.join("", "*       ", "     ", "*       ", "     ", "*       "),
            String.join("", "*       ", "     ", "*       ", "     ", "*       "),
            String.join("", "*   *** ", "     ", "*   *** ", "     ", "*   *** "),
            String.join("", "*     * ", "     ", "*     * ", "     ", "*     * "),
            String.join("", "*     * ", "     ", "*     * ", "     ", "*     * "),
            String.join("", "******* ", "     ", "******* ", "     ", "******* ")
        };
        
        // Enhanced for loop
        System.out.println("\n=== OOPS BANNER (UC5) ===\n");
        for (String line : banner) {
            System.out.println(line);
        }
    }
}