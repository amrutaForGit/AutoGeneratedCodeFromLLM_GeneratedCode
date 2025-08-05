public class Main
{
    public static void main(String[] args) {
        // Initialize two integer variables
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before Swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Call to the function swap() to swap the integer values
        swap(num1, num2);
    }
    
    public static void swap(int num1, int num2){
        // Use a temporary variable to hold the value of num1
        int tempVal = num1;
        
        // Assign the value of num2 to num1
        num1 = num2;
        
        // Assign the value of the temporary variable to num2
        num2 = tempVal;
        
        System.out.println("After Swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}