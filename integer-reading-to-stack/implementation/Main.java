package implementation;

import java.util.Stack;

/**
 * Main class to handle user interactions and manage Stack operations.
 * It provides a menu interface for adding, removing, and displaying
 * elements sorted or unsorted.
 * <p>
 * Please refer to the Readme.txt regarding how to run the program
 * or generate the documentation
 * </p>
 * <p>
 * This program also follows the Single responsibility, encapsulation,
 * and guidelines regarding variables and class naming convention.
 * </p>
 * <p>
 * It reuses code from the Stack Collection and use the sorting methods
 * from the Collections as well
 * </p>
 *
 * @author Idriss Cissoko
 * @version 1.0
 * @since 2025-02-18
 * 
 */
public class Main {

    /**
     * The entry point of the program.
     * It initializes the stack and user input manager, then
     * processes user input based on menu selections until the user chooses to exit.
     * 
     * @param args default parameter for the main method (not used in this program).
     */
    public static void main(String[] args) {
        MyStack myList = new MyStack();
        UserInputManagement inputManager = new UserInputManagement();

        while (true) {
            MenuOptionsDisplay.displayMenu();
            String choice = inputManager.readString();

            switch (choice) {
                case "A":
                    System.out.print("Enter a number to add to stack: ");
                    int num1 = inputManager.readInteger();
                    myList.addToStack(num1);
                    System.out.println(num1 + " added to the stack");
                    break;

                case "R":
                    // get removed number from stack
                    int popped = myList.removeFromStack();
                    if (popped != 0) {
                        System.out.println(popped + " removed from the stack");
                    }

                    break;

                case "DO":
                    SortStack sorter = new SortStack();
                    Stack<Integer> sortedStack = sorter.ascendingSort(myList);
                    System.out.println("The sorted stack is " + sortedStack);
                    break;

                case "DU":
                    Stack<Integer> unOrderedStack = myList.getStack();
                    System.out.println("Unsorted List is: " + unOrderedStack);
                    break;

                case "Q":
                    System.out.println("Exiting program...");
                    inputManager.closeScanner();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
