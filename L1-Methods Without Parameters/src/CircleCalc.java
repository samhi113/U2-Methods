import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    public static void main(String[] args) {
        //call the area method
        area();

        //call the circumference method
        circumference();
        System.exit(0);
    }

    //write a method to calculate a circle's area
public static void area() {
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the circle's radius?"));

        double area = Math.pow(radius, 2) * Math.PI;

        JOptionPane.showMessageDialog(null, "The circle's area is " + round.format(area) + " units squared.");
}

    //write a method to calculate a circle's circumference
    public static void circumference() {
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the circle's radius?"));

        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "The circle's circumference is " + round.format(circumference) + " units.");
}

}
