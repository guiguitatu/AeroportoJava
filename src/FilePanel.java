import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FilePanel extends InterfaceGrafica {
    private String tipo;
    private String caminhoArquivo;
    int count = 0;
    private JButton radar;

    public FilePanel(String tipo, String caminhoArquivo) {
        this.tipo = tipo;
        this.caminhoArquivo = caminhoArquivo;
        radar = new JButton("Radar");
        radar.setBackground(Color.GRAY);
        radar.setFont(new Font("Arial", Font.PLAIN, 20));
        radar.setEnabled(false);
    }

    public static void add(JButton buttonCSV) {
    }

    @Override
    public JPanel mostrar() {

        FileManager fm = new FileManager(caminhoArquivo);
        JPanel panel = new JPanel(new GridLayout(6, 1, 10, 10));
        panel.setBackground(Color.DARK_GRAY);
        radar.setEnabled(false);

        radar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.Radar();
                radar.setEnabled(false);
            }
        });

        JButton viao = new JButton("Aviões no aeroporto");
        viao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 5) {
                    count++;
                }
                checkAndUpdateRadarButton();
                fm.AviaoAeroporto();
            }
        });
        viao.setBackground(Color.GRAY);
        viao.setFont(new Font("Arial", Font.PLAIN, 20));


        JButton embarque = new JButton("Embarque");
        embarque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 5) {
                    count++;
                }
                checkAndUpdateRadarButton();
                fm.Embarque();
            }
        });
        embarque.setBackground(Color.GRAY);
        embarque.setFont(new Font("Arial", Font.PLAIN, 20));


        JButton desembarque = new JButton("Desembarque");
        desembarque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 5) {
                    count++;
                }
                checkAndUpdateRadarButton();
                fm.Desembarque();
            }
        });
        desembarque.setBackground(Color.GRAY);
        desembarque.setFont(new Font("Arial", Font.PLAIN, 20));


        JButton sair = new JButton("Voltar");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new Home().mostrar());
            }
        });

        sair.setBackground(Color.GRAY);
        sair.setFont(new Font("Arial", Font.PLAIN, 20));

        panel.add(viao);
        panel.add(embarque);
        panel.add(desembarque);
        panel.add(radar);
        panel.add(sair);

        return panel;
    }

    private void checkAndUpdateRadarButton() {
        if (count >= 5) {
            radar.setEnabled(true);
            count = 0;
        }
    }
}
