package Problems;
import java.util.Scanner;

/**
 * This program reads a sequence of numbers and prints them in reverse order using recursion.
 * It also measures the execution time of the reversal process.
 *
 * Time complexity: O(n), where n is the number of elements.
 * The recursive approach iterates through all elements once, resulting in linear time complexity.
 */
public class Problem7 {
    public static void run(Scanner scanner) {

        // Read the number of elements
        System.out.println("Enter the number of length of array: ");
        int n = scanner.nextInt();

        // Measure execution time
        long startTime = System.nanoTime();
        Reverse(n, scanner);
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1000000.0;

        // Print execution time
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    /**
     * This method reads numbers recursively and prints them in reverse order.
     *
     * @param n The number of elements to read.
     * @param scanner The Scanner object for input.
     */
    public static void Reverse(int n, Scanner scanner) {
        if (n == 0) {
            return; // Base case: stop when all elements are read
        }
        int num = scanner.nextInt();
        Reverse(n - 1, scanner); // Recursive call
        System.out.println(num + " "); // Print in reverse order
    }
}