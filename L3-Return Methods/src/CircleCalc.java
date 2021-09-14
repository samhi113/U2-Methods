import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    public static void main(String[] args) {
        DecimalFormat roundTo2 = new DecimalFormat("#,###.00");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

        JOptionPane.showMessageDialog(null, "The area of the circle is " + roundTo2.format(area(radius)) + "\n" + "The perimeter of the circle is " + roundTo2.format(circumference(radius)));

        System.exit((int) area(radius));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius) {


        return Math.PI * Math.pow(radius, 2);

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius) {

        return 2 * Math.PI * radius;

    }
}
