import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;
    static JLabel clicksLabel = new JLabel("Clicker Game by Sam!");
    static JTextField textInput = new JTextField(11);

    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker Game");
        JPanel panel = new JPanel();
        JLabel titleLabel = new JLabel("Product name:");
        JButton submitButton = new JButton("Submit");

        window.setSize(300,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(new ButtonListener());

        panel.add(titleLabel);
        panel.add(textInput);
        panel.add(clicksLabel);
        panel.add(submitButton);

        window.add(panel);
        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String product = textInput.getText();

            clickCount++;

            clicksLabel.setText("Sold " + clickCount + " number of " + product);
        }
    }
}
