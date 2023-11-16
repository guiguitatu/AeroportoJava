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

        FileManager fm = new FileManager(caminhoArquivo);
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBackground(Color.darkGray);


        JButton passageiro = new JButton("Cadastro Passageiro");
        passageiro.addActionListener(event -> {

            String nome = null;
            while (true) {
                try {
                    nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
                    if (nome.length() < 10) {
                        throw new StringTooLong("O campo nome deve conter no mínimo 10 caracteres");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            String data = JOptionPane.showInputDialog(null, "Digite sua data de nascimento(dd/mm/aaaa): ");

            String passaporte = null;
            while (true) {
                try {
                    passaporte = JOptionPane.showInputDialog(null, "Digite seu passaporte(AA + 6 dígitos)");
                    if (passaporte.length() != 8) {
                        throw new StringTooLong("O campo deve conter duas letras e 6 dígitos");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            String bagagens = JOptionPane.showInputDialog(null, "Digite a quantidade de bagagens: ");
            String cadastro_usuario = "DETALHES PASSAGEIRO" + "\nNome: " + nome + "\nData de Nascimento: " + data + "\nPassaporte: " + passaporte + "\nBagagens: " + bagagens;
            JOptionPane.showMessageDialog(null, cadastro_usuario);
        });

        passageiro.setBackground(Color.GRAY);
        passageiro.setFont(new Font("Arial", Font.PLAIN, 20));


        JButton criarPassagem = new JButton("Criar Passagem");
        criarPassagem.addActionListener(event -> {

            String origem = JOptionPane.showInputDialog(null, "Origem do voo: ");
            String destino = JOptionPane.showInputDialog(null, "Destino do voo: ");
            String numPessoas = JOptionPane.showInputDialog(null, "Quantos passageiros: ");
            String dataIda = JOptionPane.showInputDialog(null, "Data de ida: ");
            String dataVolta = JOptionPane.showInputDialog(null, "Data de retorno: ");
            String empresa = JOptionPane.showInputDialog(null, "Empresa area: ");

            String passagem = "DETALHES DA PASSAGEM " + "\nOrigem: " + origem + "\nDestino: " + destino + "\nQuantos passageiros: " + numPessoas + "\nData ida: " + dataIda + "\nData retorno: " + dataVolta + "\nEmpresa area: " + empresa;
            JOptionPane.showMessageDialog(null , passagem);
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


