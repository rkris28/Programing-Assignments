import java.util.Scanner; // Import the Scanner class for user input

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object for reading input

        try {
            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble(); // Read the first number

            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble(); // Read the second number

            // Prompt the user for the operation to perform
            System.out.print("Enter the operation (add, subtract, multiply, divide): ");
            String operation = scanner.next().toLowerCase(); // Read the operation and convert it to lowercase

            // Variable to hold the result of the operation
            double result;
            // Switch statement to determine which operation to perform
            switch (operation) {
                case "add":
                    result = num1 + num2; // Addition
                    System.out.println("Result: " + result);
                    break;
                case "subtract":
                    result = num1 - num2; // Subtraction
                    System.out.println("Result: " + result);
                    break;
                case "multiply":
                    result = num1 * num2; // Multiplication
                    System.out.println("Result: " + result);
                    break;
                case "divide":
                    // Check for division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero."); // Error message for division by zero
                    } else {
                        result = num1 / num2; // Division
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    // This case is executed if the operation is not recognized
                    System.out.println("Error: Invalid operation. Please enter add, subtract, multiply, or divide.");
                    break; // End of switch case
            }
        } catch (Exception e) {
            // This block catches any exception that occurs in the try block
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
    }
}
