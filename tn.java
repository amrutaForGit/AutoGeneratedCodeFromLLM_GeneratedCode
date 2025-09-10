```java
// Java code to add two numbers

public class AddTwoNumbers {
    
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args)
    {
        // Create an instance of AddTwoNumbers class
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        // Declare two integers to add
        int num1 = 5;
        int num2 = 7;
        
        // Method call to add the numbers and print the result
        System.out.println("The sum is: " + addTwoNumbers.add(num1, num2));
    }
}
```