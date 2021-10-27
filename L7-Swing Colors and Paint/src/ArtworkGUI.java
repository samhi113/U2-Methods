import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES

    JFrame frame;

    public ArtworkGUI(){
        //CREATE THE GUI
        frame = new JFrame("My Ride (kinda drip ngl)");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(new Color(130, 190, 255));
        }
        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(new Color(140, 140, 140));
            g.fillRect(0, 300, 600, 400);

            g.setColor(new Color(210, 190, 60));
            g.fillRect(25,100,350,175);
            g.fillRect(375,175,90,100);
            g.fillRect(375,185,100,90);
            g.fillOval(455,175,20,20);
            g.fillOval(500, 25, 75, 75);

            g.setColor(new Color(35, 35, 35));
            g.fillOval(50,225,100,100);
            g.fillOval(325,225,100,100);
            g.fillRect(25,185,450,5);
            g.fillRect(25,195,450,5);

            g.setColor(new Color(130, 190, 255));
            g.fillRect(50, 125, 300, 50);
        }
    }
}
