import java.util.Scanner;
import java.text.DecimalFormat;

public class shopping_cart_program_new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currency = '₹';
        double grandTotal = 0;
        DecimalFormat df = new DecimalFormat("#.##"); // For proper decimal formatting

        System.out.println("===== WELCOME TO THE SHOPPING CART =====");
        System.out.println("Enter your items one by one (type 'done' when finished)\n");

        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("How many of '" + item + "' would you like: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
                System.out.print("How many of '" + item + "' would you like: ");
            }
            int quantity = scanner.nextInt();

            System.out.print("Enter price per '" + item + "': ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid price!");
                scanner.next(); // Clear invalid input
                System.out.print("Enter price per '" + item + "': ");
            }
            double price = scanner.nextDouble();

            // Clear the newline character
            scanner.nextLine();

            double itemTotal = price * quantity;
            grandTotal += itemTotal;

            System.out.println("\nAdded " + quantity + " " + item + "(s) at " + currency +
                    df.format(price) + " each = " + currency + df.format(itemTotal));
            System.out.println("Current total: " + currency + df.format(grandTotal) + "\n");
        }

        System.out.println("\n===== FINAL RECEIPT =====");
        System.out.println("GRAND TOTAL: " + currency + df.format(grandTotal));
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
