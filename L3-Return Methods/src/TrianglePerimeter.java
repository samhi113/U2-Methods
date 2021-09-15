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
        int x1 = getInput("What is the x coordinate for the first point?");
        int y1 = getInput("What is the y coordinate for the first point?");
        int x2 = getInput("What is the x coordinate for the second point?");
        int y2 = getInput("What is the y coordinate for the second point?");
        int x3 = getInput("What is the x coordinate for the third point?");
        int y3 = getInput("What is the y coordinate for the third point?");

        double side1 = calcDistance(x1, y1, x2, y2);
        double side2 = calcDistance(x3, y3, x2, y2);
        double side3 = calcDistance(x1, y1, x3, y3);

        double perimeter = calcPer(side1, side2, side3);

        outputResults(perimeter);

        System.exit(69);
    }
    public static int getInput(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public static double calcDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
    }

    public static double calcPer(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void outputResults(double perimeter) {
        DecimalFormat roundTo2 = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "The perimeter of the triangle is " + roundTo2.format(perimeter));
    }
}
