package MakeChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MakeChange {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0; // Variable to ho12ld the total cost of items
        String input; // To hold user input

        // Loop to accept item prices until the user inputs 'd'
        System.out.println("Enter the price of items (or 'd' when done):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("d")) {
                break; // Exit the loop if user inputs 'd'
            }
            try {
                double price = Double.parseDouble(input);
                totalCost += price; // Add the price to total cost
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'd' to finish.");
            }
        }

        // Prompt user for cash amount
        System.out.println("Enter the amount of cash given: ");
        double cashGiven = scanner.nextDouble();

        // Calculate the change
        double change = cashGiven - totalCost;

        // Check if cash given is less than the total cost
        if (change < 0) {
            System.out.println("Insufficient cash given. Please enter a larger amount.");
            return; // Exit the program
        }

        // Define denominations for change
        int[] denominations = {10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1}; // In cents
        String[] denominationNames = {"hundred dollar bill", "fifty dollar bill", "twenty dollar bill",
                "ten dollar bill", "five dollar bill", "one dollar bill",
                "quarter", "dime", "nickel", "penny"};

        // List to store the change breakdown
        List<String> changeList = new ArrayList<>();
        int remainingChange = (int) Math.round(change * 100); // Convert change to cents

        // Calculate the change in descending order of denominations
        for (int i = 0; i < denominations.length; i++) {
            int count = remainingChange / denominations[i]; // Count of this denomination
            remainingChange %= denominations[i]; // Remainder after taking this denomination

            if (count > 0) {
                String name = denominationNames[i];
                if (count > 1 && i == 9) {
                    name = "pennies";
                } else if (count > 1) {
                    name += "s";
                }
                changeList.add(count + " " + name); // Add the denomination and count to the list
            }
        }
        // Output the change
        System.out.println("The total change is: $" + String.format("%.2f", change));
        System.out.println("Change breakdown:");
        for (String item : changeList) {
            System.out.println(item);
        }

        scanner.close();
    }
}

