import Problems.*;
import java.util.Scanner;

public class MainMenu {
    public static void ShowMenu(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n=== Java Assignment - Choose a Problem ===");
            System.out.println("1. Find Minimum Value");
            System.out.println("2. Calculate Average");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Factorial Calculation");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Power Calculation");
            System.out.println("7. Reverse Sequence");
            System.out.println("8. Digit Checker");
            System.out.println("9. Binomial Coefficient");
            System.out.println("10. Greatest Common Divisor (GCD)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1: Problem1.run(scanner); break;
                case 2: Problem1.run(scanner); break;
                case 3: Problem1.run(scanner); break;
                case 4: Problem1.run(scanner); break;
                case 5: Problem1.run(scanner); break;
                case 6: Problem1.run(scanner); break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 0 and 10");
            }
        }
        scanner.close();}
}
