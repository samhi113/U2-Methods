import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.

    static JFrame window = new JFrame("Color Switcher");
    static JPanel panel = new JPanel();
    static JButton blueOrangeButton = new JButton("Blue/Orange");
    static JButton redCreamButton = new JButton("Red/Cream");
    static JButton germanyButton = new JButton("Germany");

    static Color myBlue = new Color(8, 32, 50);
    static Color myOrange = new Color(255, 76, 41);
    static Color myRed = new Color(255, 92, 88);
    static Color myCream = new Color(255, 237, 211);
    static Color germanBlack = new Color(54, 47, 45);
    static Color germanRed = new Color(164,93,93);
    static Color germanYellow = new Color(255,192,105);
    public ColorSwitchGUI(){
        //create your GUI
        blueOrangeButton.addActionListener(new blueOrangeChange());
        redCreamButton.addActionListener(new redCreamChange());
        germanyButton.addActionListener(new germanyChange());

        window.setSize(400,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(blueOrangeButton);
        panel.add(redCreamButton);
        panel.add(germanyButton);
        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private static class blueOrangeChange implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.setBackground(myBlue);
            blueOrangeButton.setBackground(myOrange);
            blueOrangeButton.setForeground(myBlue);
            redCreamButton.setBackground(myOrange);
            redCreamButton.setForeground(myBlue);
            germanyButton.setBackground(myOrange);
            germanyButton.setForeground(myBlue);
        }
    }

    private static class redCreamChange implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.setBackground(myRed);
            blueOrangeButton.setBackground(myCream);
            blueOrangeButton.setForeground(myRed);
            redCreamButton.setBackground(myCream);
            redCreamButton.setForeground(myRed);
            germanyButton.setBackground(myCream);
            germanyButton.setForeground(myRed);
        }
    }

    private static class germanyChange implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.setBackground(germanBlack);
            blueOrangeButton.setBackground(germanRed);
            blueOrangeButton.setForeground(germanYellow);
            redCreamButton.setBackground(germanRed);
            redCreamButton.setForeground(germanYellow);
            germanyButton.setBackground(germanRed);
            germanyButton.setForeground(germanYellow);
        }
    }
}
