package Problems;
import java.util.Scanner;

/**
 * This program calculates the binomial coefficient C(n, k) using recursion.
 * It also measures the execution time of the calculation.
 *
 * Time complexity: O(2^n), since the recursive approach has an exponential growth.
 * This implementation is not optimal for large values of n due to redundant calculations.
 */
public class Problem9 {
    public static void run(Scanner scanner) {

        // Read input values for n and k
        System.out.println("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the k: ");
        int k = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println(result);
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient value.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}