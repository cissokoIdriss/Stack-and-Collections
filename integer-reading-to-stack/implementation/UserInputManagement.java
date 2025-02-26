package implementation;

import java.util.Scanner;

/**
 * This class reads the input from the user using a Scanner.
 */
public class UserInputManagement {
    private final Scanner scanner;

    /**
     * Default constructor initializes a single Scanner instance.
     */
    public UserInputManagement() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Reads an integer from user input.
     * Only valid integers are accepted.
     * 
     * @return userInt The integer entered by the user.
     */
    public int readInteger() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.next(); // handle the invalid input
        }
        int userInt = scanner.nextInt();
        return userInt;
    }

    /**
     * Reads a string from user input.
     * 
     * @return userString The string entered by the user.
     */
    public String readString() {
        String userString = scanner.next().toUpperCase();
        return userString;
    }

    /**
     * Closes the scanner when the program ends.
     */
    public void closeScanner() {
        scanner.close();
    }
}
