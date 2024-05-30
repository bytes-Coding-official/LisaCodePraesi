import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIawt {
    private int clickCount = 0;
    private Label label;
    private Button button;

    public GUIawt() {
        // Create the frame
        Frame frame = new Frame("Click Counter");
        frame.setLayout(new FlowLayout());

        // Create the label
        label = new Label("Button has been clicked 0 times.");
        label.setForeground(Color.RED); // Red font color for the text

        // Create the button
        button = new Button("Click Me!");
        button.setBackground(Color.BLUE); // Blue background for the button
        button.setForeground(Color.WHITE); // White text for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                label.setText("Button has been clicked " + clickCount + " times.");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Set the frame size and show it
        frame.setSize(300, 100);
        frame.setVisible(true);

        // Close the application when the frame is closed
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Create the GUI on the AWT event dispatching thread
        EventQueue.invokeLater(GUIawt::new);
    }
}