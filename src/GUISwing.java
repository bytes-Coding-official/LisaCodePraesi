import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISwing {
    public static void main(String[] args) {
        // Erstellen des Hauptfensters
        JFrame frame = new JFrame("Burger Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Layout für die Inhalte
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout);

        // Titel
        JLabel label = new JLabel("Burger");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(label);

        // Checkboxes für die Zutaten
        JCheckBox cheeseCheckBox = new JCheckBox("Cheese");
        JCheckBox lettuceCheckBox = new JCheckBox("Lettuce");
        JCheckBox tomatoCheckBox = new JCheckBox("Tomato");
        JCheckBox onionCheckBox = new JCheckBox("Onion");
        JCheckBox picklesCheckBox = new JCheckBox("Pickles");
        JCheckBox ketchupCheckBox = new JCheckBox("Ketchup");

        // Zutaten zum Frame hinzufügen
        frame.add(cheeseCheckBox);
        frame.add(lettuceCheckBox);
        frame.add(tomatoCheckBox);
        frame.add(onionCheckBox);
        frame.add(picklesCheckBox);
        frame.add(ketchupCheckBox);

        // "FERTIG" Button
        JButton finishButton = new JButton("FERTIG");
        finishButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder ingredients = new StringBuilder("Deine Zutaten sind:");
                if (cheeseCheckBox.isSelected()) ingredients.append("\nCheese");
                if (lettuceCheckBox.isSelected()) ingredients.append("\nLettuce");
                if (tomatoCheckBox.isSelected()) ingredients.append("\nTomato");
                if (onionCheckBox.isSelected()) ingredients.append("\nOnion");
                if (picklesCheckBox.isSelected()) ingredients.append("\nPickles");
                if (ketchupCheckBox.isSelected()) ingredients.append("\nKetchup");

                JOptionPane.showMessageDialog(frame, ingredients.toString());
            }
        });

        // Button zum Frame hinzufügen
        frame.add(finishButton);

        // Anzeigen des Frames
        frame.setVisible(true);
    }

}