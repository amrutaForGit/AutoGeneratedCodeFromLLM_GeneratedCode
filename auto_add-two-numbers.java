// Import the necessary libraries
import java.util.Scanner;

public class NumberAddition {
    // Define the main method
    public static void main(String[] args) {
        
        // Create a Scanner object to read the numbers
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        // Read the first number and store it in A
        int A = in.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        // Read the second number and store it in B
        int B = in.nextInt();

        // Add the two numbers and store the result in C
        int C = A + B;

        // Print the result
        System.out.println("The sum of " + A + " and " + B + " is " + C + ".");

        // Close the scanner
        in.close();
    }
}