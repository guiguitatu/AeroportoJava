import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FilePanel extends InterfaceGrafica {
    private String tipo;
    private String caminhoArquivo;



    public FilePanel(String tipo, String caminhoArquivo) {
        this.tipo = tipo;
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public JPanel mostrar() {
        FileManager fm = new FileManager(caminhoArquivo);
        JPanel panel = new JPanel();
        JButton viao = new JButton("Ver os aviões no aeroporto");

        viao.addActionListener(event -> fm.AviaoAeroporto());

        JButton embarque = new JButton("Embarque");
        embarque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.Embarque();
            }
        });

        JButton desembarque = new JButton("Desembarque");
        desembarque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.Desembarque();
            }
        });

        JButton escreveCSV = new JButton("Radar");
        escreveCSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fm.Radar();
            }
        });

        JButton sair = new JButton("Sair");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new Home().mostrar());
            }
        });
        panel.add(viao);
        panel.add(embarque);
        panel.add(desembarque);
        panel.add(escreveCSV);
        panel.add(sair);

        return panel;
    }
}
