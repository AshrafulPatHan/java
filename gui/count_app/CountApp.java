import javax.swing.*;
import java.awt.*;   // for BorderLayout
import java.awt.event.*; // for ActionListener

public class CountApp {
    private static int count = 0; // the number that increases

    public static void main(String[] args) {

        JFrame frame = new JFrame("Counting App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout()); // top + center layout

        // ---- Top Text ----
        JLabel label = new JLabel("Click the button to start counting: " + count);
        label.setHorizontalAlignment(SwingConstants.CENTER); // center text
        frame.add(label, BorderLayout.NORTH);

        // ---- Button in Center ----
        JButton button = new JButton("Click Me!");
        frame.add(button, BorderLayout.CENTER);

        // ---- Button Click Action ----
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++; // increase number by 1
                label.setText("Click the button to start counting: " + count);
            }
        });

        frame.setVisible(true);
    }
}
