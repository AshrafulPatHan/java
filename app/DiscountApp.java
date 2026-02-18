import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiscountApp {

    public static void main(String[] args) {

        // ---- JFrame ----
        JFrame frame = new JFrame("Discount Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // ---- Top Label ----
        JLabel titleLabel = new JLabel("Enter your age to check discount:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(titleLabel, BorderLayout.NORTH);

        // ---- Center Panel ----
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JTextField ageInput = new JTextField(10);
        JButton checkButton = new JButton("Check Discount");
        centerPanel.add(new JLabel("Age: "));
        centerPanel.add(ageInput);
        centerPanel.add(checkButton);

        frame.add(centerPanel, BorderLayout.CENTER);

        // ---- Result Label ----
        JLabel resultLabel = new JLabel("Result will appear here");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(resultLabel, BorderLayout.SOUTH);

        // ---- Button Action ----
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = Integer.parseInt(ageInput.getText());

                    String discountMessage;

                    if (age <= 6) {
                        discountMessage = "Free for kids!";
                    } else if (age < 18) {
                        discountMessage = "50% discount!";
                    } else if (age < 60) {
                        discountMessage = "Full payment required!";
                    } else if (age >= 60) {
                        discountMessage = "30% discount!";
                    } else {
                        discountMessage = "Error!";
                    }

                    resultLabel.setText(discountMessage);

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number!");
                }
            }
        });

        frame.setVisible(true);
    }
}
