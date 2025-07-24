public class Main {
    public static void main(String[] args) {
        
        // Initial values	
        int x = 3;
        int y = 4;
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Call the swap function
        int[] swappedValues = swap(x, y);
        
        // Print the swapped values
        System.out.println("After swapping: x = " + swappedValues[0] + ", y = " + swappedValues[1]);
    }

    // Function to swap two integers
    public static int[] swap(int x, int y) {
        
        // Create a temporary variable and store the value of x
        int tempVal = x;
        
        // Replace the value of x with y
        x = y;
        
        // Replace the value of y with the temporary variable
        y = tempVal;
        
        // Return the swapped values
        return new int[]{x, y};
    }
}