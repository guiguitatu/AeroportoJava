import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home extends InterfaceGrafica {

    @Override
    public JPanel mostrar() {
        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));


        JButton buttonCSV = new JButton("Embarque e desembarque");
        buttonCSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new FilePanel("CSV", "./database/csv.csv").mostrar());
                buttonCSV.setPreferredSize(new Dimension(150, 50));
                FilePanel.add(buttonCSV);
            }
        });

        JButton passagens = new JButton("Passagens");
        passagens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new FilePanel2("CSV", "./database/passageiro.csv").mostrar());
                FilePanel2.add(passagens);
            }
        });

        panel.add(passagens);
        panel.add(buttonCSV);
        return panel;
    }
}

