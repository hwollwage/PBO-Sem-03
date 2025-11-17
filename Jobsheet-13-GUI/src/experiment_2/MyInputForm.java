package experiment_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;

    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;

    private JTextField aField;
    private JTextField bField;

    private JButton button;       // multiplication button
    private JButton addButton;    // NEW: addition button
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        bField = new JTextField(FIELD_WIDTH);
    }

    private void createButton() {
        button = new JButton("Multiply");
        addButton = new JButton("Add");   // NEW BUTTON

        // Multiplication Listener
        class MultiplyListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }
        }

        // Addition Listener (NEW)
        class AddListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil: " + c);
            }
        }

        button.addActionListener(new MultiplyListener());
        addButton.addActionListener(new AddListener()); // ADD LISTENER
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);

        panel.add(bLabel);
        panel.add(bField);

        panel.add(button);
        panel.add(addButton);   // ADD THE NEW BUTTON

        panel.add(cLabel);

        add(panel);
    }
}
