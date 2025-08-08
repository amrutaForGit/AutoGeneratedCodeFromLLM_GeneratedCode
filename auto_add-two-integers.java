// Importing required classes
import java.util.Scanner;

public class NumberAddition1 {

    public static void main(String[] args) {
        
        // Creating a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        // Prompt the user for the second number
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        
        // Adding the numbers and storing the result in sum.
        int sum = num1 + num2;
        
        // Displaying the result to the user
        System.out.println("The sum of the numbers is: " + sum);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}