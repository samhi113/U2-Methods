import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("Feet to Meter Conversion");
        JPanel panel = new JPanel();
        JButton f2MButton = new JButton("Feet to Meters");
        JButton m2FButton = new JButton("Meters to Feet");

        window.setSize(400,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        f2MButton.addActionListener(new feet2MeterListener());
        m2FButton.addActionListener(new meter2FeetListener());

        panel.add(f2MButton);
        panel.add(m2FButton);
        window.add(panel);

        window.setVisible(true);
    }

    private static class feet2MeterListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat roundTo2 = new DecimalFormat("#,###.00");

            double feet = Double.parseDouble(JOptionPane.showInputDialog("How many feet would you like to convert into meters?"));
            double meters = feet / 3.281;
            JOptionPane.showMessageDialog(null, feet + " feet in meters is " + roundTo2.format(meters));
        }
    }

    private static class meter2FeetListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat roundTo2 = new DecimalFormat("#,###.00");

            double meters = Double.parseDouble(JOptionPane.showInputDialog("How many feet would you like to convert into meters?"));
            double feet = meters * 3.281;
            JOptionPane.showMessageDialog(null, meters + " meters in feet is " + roundTo2.format(feet));
        }
    }
}
