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
        radar.setEnabled(false);
    }

    public static void add(JButton buttonCSV) {
    }

    @Override
    public JPanel mostrar() {

        FileManager fm = new FileManager(caminhoArquivo);
        JPanel panel = new JPanel();
        radar.setEnabled(false);

        radar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.Radar();
                radar.setEnabled(false);
            }
        });

        JButton viao = new JButton("Ver os aviões no aeroporto");
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

        JButton sair = new JButton("Voltar");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new Home().mostrar());
            }
        });
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
