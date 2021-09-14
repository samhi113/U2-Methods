import javax.swing.*;

public class ReturnMethod {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length of your rectangle?"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width of your rectangle?"));

        JOptionPane.showMessageDialog(null, "The area is " +  calcArea(length, width) + "\n" + "The perimeter is " + calcPeri(length, width));

        System.exit(69);
    }

    public static double calcArea(double length, double width) {

        return length * width;

    }

    public static double calcPeri(double length, double width) {

        return 2 * (length + width);

    }
}
