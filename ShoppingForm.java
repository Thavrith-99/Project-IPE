import java.util.Scanner;

public class ShoppingForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Online Shopping Form");
        System.out.println("Please enter the following details:");
        
        System.out.print("Product Name: ");
        String productName = scanner.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Price per item: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Shipping Address: ");
        String address = scanner.nextLine();
        
        System.out.println("\nThank you for your order!");
        System.out.println("Order Details:");
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + (quantity * price));
        System.out.println("Shipping to: " + address);
        
        scanner.close();
    }
}
