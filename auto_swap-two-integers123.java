public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Print original values
        System.out.println("Original values: a = " + a + " b = " + b);
        
        // Swap the values
        int tempVal = a;
        a = b;
        b = tempVal;

        // Print swapped values
        System.out.println("Swapped values: a = " + a + " b = " + b);
    }
}