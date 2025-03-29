package Problems;
import java.util.Scanner;

/**
 * This program checks whether a given number is prime or composite.
 * It reads an integer `n` from the user and determines if `n` is a prime number.
 *
 * Time complexity: O(√n), where n is the input number.
 * The algorithm iterates up to the square root of `n` to check for divisibility.
 */
public class Problem3 {
    public static void run(Scanner scanner) {

        // Read the input number
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        // Check if the number is prime
        String result = isPrime(n) ? "Prime" : "Composite";
        System.out.println(result);

    }

    /**
     * This method checks if a given number is prime.
     *
     * @param n The number to check.
     * @return True if the number is prime, false if composite.
     */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, number is prime
    }
}