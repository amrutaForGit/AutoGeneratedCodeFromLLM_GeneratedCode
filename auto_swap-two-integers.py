```java
public class Main {
    public static void main(String[] args) {
        // Initialize two integers, a and b
        int a = 5;
        int b = 10;

        // Output the initial values of a and b
        System.out.println("Before swapping");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        // Swap a and b using a third integer
        int tempVal = a;  // Store the value of a in tempVal
        a = b;           // Assign the value of b to a
        b = tempVal;     // Assign the value of tempVal to b

        // Output the swapped values of a and b
        System.out.println("After swapping");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
```