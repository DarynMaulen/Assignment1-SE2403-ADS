package Problems;
import java.util.Scanner;

/**
 * This program calculates the power of a number using recursion.
 * It computes a^n (a raised to the power of n) and measures execution time.
 *
 * Time complexity: O(n), where n is the exponent.
 * The recursive algorithm iterates n times, resulting in linear time complexity.
 */
public class Problem6 {
    public static void run(Scanner scanner) {

        // Read base and exponent
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the power: ");
        int n = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        int result = findPower(n, a);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print the result and execution time
        System.out.println(a + "^" + n + " is: " + result);
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method calculates the power of a number recursively.
     *
     * @param n The exponent.
     * @param a The base.
     * @return The result of a^n.
     */
    public static int findPower(int n, int a) {
        if (n == 0) {
            return 1; // Base case: a^0 = 1
        }
        return a * findPower(n - 1, a); // Recursive call
    }
}