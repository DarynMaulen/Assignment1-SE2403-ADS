package Problems;
import java.util.Scanner;

/**
 * This program calculates the average of an array of numbers.
 * It reads an integer `n` from the user, then an array of `n` elements,
 * and computes the average value of the elements.
 *
 * Time complexity: O(n), where n is the size of the array.
 * The algorithm iterates through the entire array once to compute the sum.
 */
public class Problem2 {
    public static void run(Scanner scanner){

        // Read the size of the array
        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Compute the average of the array
        double average = calculateAverage(arr, n);

        // Print the result
        System.out.println("Average value: " + average);

    }

    /**
     * This method calculates the average of the given array.
     *
     * @param arr The array of integers.
     * @param n The size of the array.
     * @return The average value of the array elements.
     */
    private static double calculateAverage(int[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Accumulate sum
        }
        return sum / n; // Compute average
    }
}