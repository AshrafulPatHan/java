import javax.swing.JFrame;

public class first {
    public static void main(String[] args) {

        // Create a window (JFrame)
        JFrame frame = new JFrame("My First Java Window");

        // Set window size (width, height)
        frame.setSize(400, 300);

        // Make sure the program closes when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window (optional)
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
}
