import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the circle's radius?"));

        area(radius);
        circumference(radius);
        System.exit(0);
    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");

        double area = Math.pow(radius, 2) * Math.PI;

        JOptionPane.showMessageDialog(null, "The circle's area is " + round.format(area) + " units squared.");
    }

    //re-write the method to calculate a circle's perimeter using parameters
    public static void circumference(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "The circle's circumference is " + round.format(circumference) + " units.");
    }

}
