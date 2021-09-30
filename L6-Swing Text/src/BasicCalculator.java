import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField input1 = new JTextField(5);
    static JTextField input2 = new JTextField(5);
    static JLabel outputField = new JLabel("Your answer: ");
    static DecimalFormat roundTo4 = new DecimalFormat("#.####");


    public static void main(String[] args) {
        JFrame window = new JFrame("Sam's Calculator");
        JPanel panel = new JPanel();
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("x");
        JButton divButton = new JButton("/");

        window.setSize(500, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addButton.addActionListener(new addListener());
        subButton.addActionListener(new subListener());
        mulButton.addActionListener(new mulListener());
        divButton.addActionListener(new divListener());

        panel.add(input1);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(input2);
        panel.add(outputField);

        window.add(panel);
        window.setVisible(true);
    }

    private static class addListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double sum = num1 + num2;

            outputField.setText("Your answer: " + roundTo4.format(sum));
        }
    }

    private static class subListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double difference = num1 - num2;

            outputField.setText("Your answer: " + roundTo4.format(difference));
        }
    }

    private static class mulListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double product = num1 * num2;

            outputField.setText("Your answer: " + roundTo4.format(product));
        }
    }

    private static class divListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());

            double quotient = num1 / num2;

            outputField.setText("Your answer: " + roundTo4.format(quotient));
        }
    }
}
