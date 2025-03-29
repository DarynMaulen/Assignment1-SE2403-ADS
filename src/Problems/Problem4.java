package Problems;
import java.util.Scanner;

/**
 * This program calculates the factorial of a given number.
 * It uses a recursive approach and also measures the execution time.
 *
 * Time complexity: O(n), where n is the input number.
 * The recursive algorithm iterates through all numbers from n to 1,
 * resulting in linear time complexity.
 */
public class Problem4 {
    public static void run(Scanner scanner) {

        // Read the input number
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Measure the execution time
        long startTime = System.nanoTime();
        int result = findFactorial(n);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method calculates the factorial of a given number.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * findFactorial(n - 1); // Recursive call
    }
}