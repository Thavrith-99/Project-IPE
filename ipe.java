package hi;
import java.util.Scanner;
public class ipe {

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        
        // Prompt the user to enter price
        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();
        
        // Calculate the total price
        double total = quantity * price;
        
        // Display the total price
        System.out.println("Total price: " + total);
        
        // Close the scanner
        scanner.close();
    }
}
