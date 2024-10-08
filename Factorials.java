import java.math.BigInteger;
// Import BigInteger class to handle large numbers

class Factorials {
    public static void main(String[] args) {
        // Loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Print the factorial of the current number
            System.out.println(i + "! = " + factorial(i));
        }
    }

    // Recursive method to calculate factorial
    private static BigInteger factorial(int n) {
        // Base case: if n is 0 or 1, return 1 (as 0! and 1! are both 1)
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            // Recursive case: n! = n * (n-1)!
            // Multiply n (converted to BigInteger) by the factorial of (n-1)
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
