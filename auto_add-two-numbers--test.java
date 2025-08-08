// Importing required classes
import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args) {
        // Creating a scanner object to get input from user
        Scanner input = new Scanner(System.in);
        
        // Asking user for the first number input
        System.out.print("Enter first number: ");
        int A = input.nextInt();

        // Asking user for the second number input
        System.out.print("Enter second number: ");
        int B = input.nextInt();

        // Adding the two numbers
        int C = A + B;

        // Displaying the sum
        System.out.println("The sum of the two numbers is: " + C);

        // Closing the scanner object to avoid memory leak
        input.close();
    }
}