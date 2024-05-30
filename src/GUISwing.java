import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISwing {

    private int clickCount = 0;
    private JLabel label;
    private JButton button;

    public GUISwing() {
        // Create the frame
        JFrame frame = new JFrame("Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create the label
        label = new JLabel("Button has been clicked 0 times.");
        label.setForeground(Color.RED); // Red font color for the text

        // Create the button
        button = new JButton("Click Me!");
        button.setBackground(Color.BLUE); // Blue background for the button
        button.setForeground(Color.WHITE); // White text for the button
        button.setFocusPainted(false); // Remove the focus border around the text
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                label.setText("Button has been clicked " + clickCount + " times.");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Set the frame size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUISwing::new);
    }
}