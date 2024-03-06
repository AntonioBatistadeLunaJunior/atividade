
package loucura;
import javax.swing.*;
import java.awt.event.*;

public class mano {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programa Gráfico");
        JButton button = new JButton("Clique aqui");
        JLabel label = new JLabel("Texto");
        JTextField textField = new JTextField(10);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                label.setText(texto);
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        panel.add(textField);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

