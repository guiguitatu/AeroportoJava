import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.*;

public class FilePanel2 extends InterfaceGrafica {
    private String tipo;
    private String caminhoArquivo;
    int count = 0;


    public FilePanel2(String tipo, String caminhoArquivo) {
        this.tipo = tipo;
        this.caminhoArquivo = caminhoArquivo;
    }

    static {
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 15));
    }

    public static void add(JButton passagens) {
    }

    @Override
    public JPanel mostrar() {

        FileManager2 fm = new FileManager2(caminhoArquivo);
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBackground(Color.darkGray);


        JButton passageiro = new JButton("Cadastro Passageiro");
        passageiro.addActionListener(event -> {
            fm.CadastroPassageiro();
        });

        passageiro.setBackground(Color.GRAY);
        passageiro.setFont(new Font("Arial", Font.PLAIN, 20));


        JButton criarPassagem = new JButton("Criar Passagem");
        criarPassagem.addActionListener(event -> {
            fm.CriaPassagem();
        });

        criarPassagem.setBackground(Color.GRAY);
        criarPassagem.setFont(new Font("Arial", Font.PLAIN, 20));



        JButton sair = new JButton("Voltar");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new Home().mostrar());
            }
        });

        sair.setBackground(Color.GRAY);
        sair.setFont(new Font("Arial", Font.PLAIN, 20));


        panel.add(passageiro);
        panel.add(criarPassagem);
        panel.add(sair);

        return panel;
    }
}


