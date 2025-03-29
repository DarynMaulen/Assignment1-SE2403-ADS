package Problems;
import java.util.Scanner;

/**
 * This program calculates the Fibonacci number at a given position using recursion.
 * It also measures the execution time of the computation.
 *
 * Time complexity: O(2^n), where n is the input number.
 * The recursive approach leads to an exponential time complexity due to repeated calculations.
 */
public class Problem5 {
    public static void run(Scanner scanner) {

        // Read the input number
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = findFibonacci(n);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method calculates the Fibonacci number at position `n` using recursion.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The Fibonacci number at position `n`.
     */
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: Fibonacci(1) = 1
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2); // Recursive calls
    }
}