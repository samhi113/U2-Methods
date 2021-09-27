import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("My Favorite Quotes");
        JPanel panel = new JPanel();
        JButton hongKongButton = new JButton("Hong Kong Quote");
        JButton ecclesiastesButton = new JButton("Ecclesiastes Quote");
        JButton dripButton = new JButton("Best Quote EVER");

        window.setSize(600,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        hongKongButton.addActionListener(new hongKongButtonListener());
        ecclesiastesButton.addActionListener(new ecclesiastesButtonListener());
        dripButton.addActionListener(new dripButtonListener());

        panel.add(hongKongButton);
        panel.add(ecclesiastesButton);
        panel.add(dripButton);
        window.add(panel);

        window.setVisible(true);
    }

    private static class hongKongButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "I would rather die standing than live kneeling \n" + "       " + " -A Hong Kong protester, 2019");
        }
    }

    private static class ecclesiastesButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "There is a time for everything under the heavens \n" + "       " + " -Ecclesiastes 3:1");
        }
    }

    private static class dripButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "I've got... drip? \n" + "       " + "-Our lord and savior Mr Law");
        }
    }
}
