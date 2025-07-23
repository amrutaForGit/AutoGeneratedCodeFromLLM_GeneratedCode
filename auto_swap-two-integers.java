```java
// This method swaps two integers using a third integer
public int[] swapIntegers(int num1, int num2) {
    // Declare the third integer tempVal
    int tempVal;

    // Store value of num1 in tempVal
    tempVal = num1;

    // Storing the value of num2 in num1, thus num1 gets the value of num2
    num1 = num2;

    // Now storing the temporary value (which holds the initial value of num1) in num2. So num2 gets the initial value of num1 and the swap is complete
    num2 = tempVal;

    // Return the swapped numbers
    return new int[] {num1, num2};
}
```