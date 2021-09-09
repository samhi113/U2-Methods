import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;


public class LemonadeStand {

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    static double price16 = 0.50;
    static double price20 = 0.99;

    public static void main(String[] args) {
        int num16cups = Integer.parseInt(JOptionPane.showInputDialog("How many 16 oz cups of lemonade?"));
        int num20cups = Integer.parseInt(JOptionPane.showInputDialog("How many 20 oz cups of lemonade?"));

        calcTotal(num16cups, num20cups);
        System.exit(0);
    }

    public static void calcTotal (int num16s, int num20s){
       DecimalFormat money = new DecimalFormat("$#.00");

        double subtotal = num16s*price16 + num20s*price20;
        double taxTotal = subtotal * 0.075;
        double totalCost = subtotal + taxTotal;

        JOptionPane.showMessageDialog(null, num16s + " x 16 oz cups: " + money.format(num16s*price16) + "\n" + num20s + " x 20 oz cups: " + money.format(num20s*price20) + "\n" + "Subtotal: " + money.format(subtotal) + "\n" + "Tax total: " + money.format(taxTotal) + "\n" + "Total Cost" + money.format(totalCost));
    }
}
