package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class APP {
    private JButton button;
    private JPanel panel1;
    private JTabbedPane tabbedPane1;

    public APP() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"If you can dream it you can do it ! ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new APP().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
