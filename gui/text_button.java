import javax.swing.*;

public class text_button {
    public static void main(String[] args) {

        JFrame frame = new JFrame("render text and button");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Use FlowLayout so multiple components can be added
        frame.setLayout(new java.awt.FlowLayout());

        // Paragraph text (HTML)
        JLabel text = new JLabel("<html>This is a paragraph of text.<br>"
                + "You can use HTML to make multiple lines.<br>"
                + "Swing supports basic HTML formatting.<br> </html>");

        frame.add(text);

        // Create a button
        JButton button = new JButton("Click Me!");
        frame.add(button);

        frame.setVisible(true);
    }
}
