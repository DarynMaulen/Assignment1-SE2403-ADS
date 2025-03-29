package Problems;
import java.util.Scanner;

/**
 * This program checks if a given string consists only of digits.
 * It also measures the execution time of the check.
 *
 * Time complexity: O(n), where n is the length of the string.
 * The algorithm iterates through each character once, resulting in linear time complexity.
 */
public class Problem8 {
    public static void run(Scanner scanner) {

        // Read input string
        System.out.println("Enter the string: ");
        String s = scanner.next();

        // Measure execution time
        long startTime = System.nanoTime();
        boolean result = isDigit(s);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println(result ? "Yes" : "No");
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method checks whether a given string consists only of digits.
     *
     * @param s The input string.
     * @return True if the string contains only digits, otherwise false.
     */
    public static boolean isDigit(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Return false if a non-digit character is found
            }
        }
        return true; // Return true if all characters are digits
    }
}