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

    public static void add(JButton passagens) {
    }

    @Override
    public JPanel mostrar() {

        FileManager fm = new FileManager(caminhoArquivo);
        JPanel panel = new JPanel();

        JButton passageiro = new JButton("Cadastro Passageiro");
        passageiro.addActionListener(event -> {

            changePanel(new JPanel());
            String nome = null;
            try {
                nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
                if (nome.length() < 10)
                    throw new StringTooLong("O campo nome deve conter no minimo 10 caracteres");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            String data = JOptionPane.showInputDialog(null, "Digite sua data de nascimento(dd/mm/aaaa): ");
            String passaporte = JOptionPane.showInputDialog(null, "Digite seu passaporte");
            String bagagens = JOptionPane.showInputDialog(null, "Digite a quantidade de bagagens: ");

            System.out.println("Nome: " + nome);
            System.out.println("Data de nascimento: " + data);
            System.out.println("Numero do passaporte: " + passaporte);
            System.out.println("Quantidade de bagagens: " + bagagens);

        });

        JButton sair = new JButton("Voltar");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanel(new Home().mostrar());
            }
        });
        panel.add(passageiro);
        panel.add(sair);

        return panel;
    }
}


