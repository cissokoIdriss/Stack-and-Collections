package implementation;

/**
 * This class is responsible for displaying the possible options of the program
 * 
 */
public class MenuOptionsDisplay {

    /**
     * default constructor to create an instance of the menu Option
     */
    MenuOptionsDisplay() {
    }

    /**
     * This method prints the different options available to the user
     * on the command line
     */
    public static void displayMenu() {
        System.out.println("\nPlease select your operation using the following letters:");
        System.out.println("A: Add a number to the stack");
        System.out.println("R: Remove an element from the stack");
        System.out.println("DO: Display your sorted list of numbers");
        System.out.println("DU: Display your unsorted list of numbers");
        System.out.println("Q: Quit the program");
        System.out.print("\nEnter your choice now: ");
    }
}
