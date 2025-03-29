package Problems;
import java.util.Scanner;

/**
 * This program finds the minimum element in an array.
 * It reads an integer `n` from the user, then an array of `n` elements,
 * and determines the smallest element in the array.
 *
 * Time complexity: O(n), where n is the size of the array.
 * The algorithm iterates through the entire array once to find the minimum element.
 */
public class Problem1 {
    public static void run(Scanner scanner) {

        // Read the size of the array
        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the minimum element in the array
        int mini = findMinimum(arr, n);

        // Print the minimum element
        System.out.println("Minimum element: " + mini);

    }

    /**
     * This method finds the minimum element in the given array.
     *
     * @param arr The array of integers.
     * @param n The size of the array.
     * @return The minimum element in the array.
     */
    private static int findMinimum(int[] arr, int n) {
        int mini = arr[0]; // Initialize minimum with the first element
        for (int i = 1; i < n; i++) {
            if (mini > arr[i]) {
                mini = arr[i]; // Update minimum if a smaller element is found
            }
        }
        return mini;
    }
}