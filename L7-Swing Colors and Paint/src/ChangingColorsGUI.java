import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    static Color night_blue = new Color(8, 32, 50);
    static Color dark_green_blue = new Color(51, 71, 86);
    static Color accent_orange = new Color(255, 76, 41);

    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        colorClicker.addActionListener(new colorChanger());

        //Set the colors of our buttons and panel
        panel.setBackground(night_blue);
        colorClicker.setBackground(dark_green_blue);
        colorClicker.setForeground(accent_orange);

        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked
    private class colorChanger implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.setBackground(dark_green_blue);
            colorClicker.setBackground(accent_orange);
            colorClicker.setForeground(night_blue);
        }
    }



}
