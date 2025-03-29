package Problems;
import java.util.Scanner;

/**
 * This program calculates the greatest common divisor (GCD) of two numbers using recursion.
 * It also measures the execution time of the calculation.
 *
 * Time complexity: O(log(min(a, b))), since the Euclidean algorithm reduces the problem size significantly with each step.
 */
public class Problem10 {
    public static void run(Scanner scanner) {

        // Read input values for a and b
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = findGCD(a, b);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println(result);
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method calculates the greatest common divisor (GCD) using recursion.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) is a
        }
        return findGCD(b, a % b); // Recursive call using Euclidean algorithm
    }
}