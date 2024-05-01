import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceiptProduct extends JFrame {
    private JLabel logoLabel;
    private JLabel productIdLabel;
    private JLabel productNameLabel;
    private JLabel quantityLabel;
    private JLabel priceLabel;
    private JLabel totalLabel;

    private JTextField productIdField;
    private JTextField productNameField;
    private JTextField quantityField;
    private JTextField priceField;
    private JTextField totalField;

    private JButton addButton;
    private JButton sendButton;

    public ReceiptProduct() {
        super("Product Receipt");

        // Setting up components
        logoLabel = new JLabel(new ImageIcon("shopping_logo.png"));
        productIdLabel = new JLabel("Product ID:");
        productNameLabel = new JLabel("Product Name:");
        quantityLabel = new JLabel("Quantity:");
        priceLabel = new JLabel("Price:");
        totalLabel = new JLabel("Total:");

        productIdField = new JTextField(10);
        productNameField = new JTextField(10);
        quantityField = new JTextField(10);
        priceField = new JTextField(10);
        totalField = new JTextField(10);
        totalField.setEditable(false); // Making total field read-only

        addButton = new JButton("Add");
        sendButton = new JButton("Send");

        // Setting up layout
        setLayout(new GridLayout(7, 2));
        add(logoLabel);
        add(new JLabel()); // Placeholder for the logo
        add(productIdLabel);
        add(productIdField);
        add(productNameLabel);
        add(productNameField);
        add(quantityLabel);
        add(quantityField);
        add(priceLabel);
        add(priceField);
        add(totalLabel);
        add(totalField);
        add(addButton);
        add(sendButton);

        // Adding action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to calculate and display total
                int quantity = Integer.parseInt(quantityField.getText());
                double price = Double.parseDouble(priceField.getText());
                double total = quantity * price;
                totalField.setText(String.valueOf(total));
            }
        });

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to send receipt (not implemented in this example)
                JOptionPane.showMessageDialog(null, "Receipt sent!");
            }
        });

        // Setting frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReceiptProduct();
            }
        });
    }
}
