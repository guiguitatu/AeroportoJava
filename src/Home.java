import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Home extends InterfaceGrafica {

    @Override
    public JPanel mostrar() {
        JPanel panel = new JPanel();

        JButton buttonCSV = new JButton("Embarque e desembarque");
        buttonCSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new FilePanel("CSV", "./database/csv.csv").mostrar());
            }
        });

        panel.add(buttonCSV);
        return panel;
    }
}

