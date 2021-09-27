import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame window = new JFrame("This is a pretty simple window.");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for a cookie");

        window.setSize(1366, 768);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(button);
        window.add(panel);

        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "lmao no cookie 4 u \n get trolled noob");
        }
    }

}


