package app.biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel panel1;
    private JTextField password;
    private JTextField User;
    private JButton boton_ok;
    private JRadioButton remenberRadioButton;

    public Ventana() {
        boton_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = User.getText();
                String pass = password.getText();
                System.out.println("Hello word");
                System.out.println("se ha registrado" + user + "con la contaseña " +pass);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
