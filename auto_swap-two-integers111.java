public class Main {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        
        // Displaying numbers before swap
        System.out.println("Integer values before swap: num1 = " + num1 + ", num2 = " + num2);

        // Using a third integer tempVal to hold num1
        int tempVal = num1;
        
        // Assigning value of num2 to num1
        num1 = num2;
        
        // Assigning value of tempVal (which is original value of num1) to num2
        num2 = tempVal;
        
        // Displaying numbers after swap
        System.out.println("Integer values after swap: num1 = " + num1 + ", num2 = " + num2);
    }
}