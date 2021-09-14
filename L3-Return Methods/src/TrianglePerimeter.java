import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    public static void main(String[] args) {
        DecimalFormat roundTo2 = new DecimalFormat("#,###.00");

        int x1 = Integer.parseInt(JOptionPane.showInputDialog("What is the x coordinate for the first point?"));
        int y1 = Integer.parseInt(JOptionPane.showInputDialog("What is the y coordinate for the first point?"));
        int x2 = Integer.parseInt(JOptionPane.showInputDialog("What is the x coordinate for the second point?"));
        int y2 = Integer.parseInt(JOptionPane.showInputDialog("What is the y coordinate for the second point?"));
        int x3 = Integer.parseInt(JOptionPane.showInputDialog("What is the x coordinate for the third point?"));
        int y3 = Integer.parseInt(JOptionPane.showInputDialog("What is the y coordinate for the third point?"));

        double perimeter = Double.parseDouble(roundTo2.format(calcPer(x1, y1, x2, y2, x3, y3)));

        JOptionPane.showMessageDialog(null, "The perimeter of the triangle is " + perimeter);

        System.exit((int)(perimeter*100));
    }

    public static double calcPer(int x1, int y1, int x2, int y2, int x3, int y3) {
        double side1 = Math.sqrt(x1*x1 + y1*y1);
        double side2 = Math.sqrt(x2*x2 + y2*y2);
        double side3 = Math.sqrt(x3*x3 + y3*y3);

        return side1 + side2 + side3;
    }
}
