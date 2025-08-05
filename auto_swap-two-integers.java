// Initialize two integer variables
int num1 = 10;
int num2 = 20;

// Print the initial values of num1 and num2
System.out.println("Before Swap");
System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);

// Declare a temporary variable and store the value of num1 in it
int tempVariable = num1;

// Transfer the num2 value to num1
num1 = num2;

// Now transfer the tempVariable value to num2
num2 = tempVariable;

// Print the swapped values of num1 and num2
System.out.println("After Swap");
System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);