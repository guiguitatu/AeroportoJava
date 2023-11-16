import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class FileManager2 extends Exception {
    private String caminhoArquivo;
    private String caminhoviao = "./database/csv.csv";
    public FileManager2(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void CadastroPassageiro(){
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
        String data = null;
        data = JOptionPane.showInputDialog(null, "Digite sua data de nascimento(dd-mm-aaaa): ");

        String passaporte = null;
        while (true) {
            try {
                passaporte = JOptionPane.showInputDialog(null, "Digite seu passaporte(AA + 6 dígitos)");
                if (passaporte.length() != 8) {
                    throw new StringTooLong("O campo deve conter duas letras e 6 dígitos");
                } else if (passaporte.matches("[A-Z]{2}\\d{6}")){
                        break;
                }else {
                    throw new StringTooLong("O campo não está de acordo com o solicitado.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        String bagagens = null;
        while (true) {
            try {
                bagagens = JOptionPane.showInputDialog(null, "Digite a quantidade de bagagens: ");
                if (bagagens.matches("\\d{1}")) {
                    break;
                } else  if (bagagens == null) {
                    throw new StringTooLong("Coloque um número de bagagems");
                }else {
                    throw new StringTooLong("Você não está autorizado a levar tantas malas");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
            String cadastro_usuario = "DETALHES PASSAGEIRO" + "\nNome: " + nome + "\nData de Nascimento: " + data + "\nPassaporte: " + passaporte + "\nBagagens: " + bagagens;
            JOptionPane.showMessageDialog(null, cadastro_usuario);
    }


    public void CriaPassagem(){

        String origem = JOptionPane.showInputDialog(null, "Origem do voo: ");
        String destino = JOptionPane.showInputDialog(null, "Destino do voo: ");
        String numPessoas = JOptionPane.showInputDialog(null, "Quantos passageiros: ");
        String dataIda = JOptionPane.showInputDialog(null, "Data de ida: ");
        String dataVolta = JOptionPane.showInputDialog(null, "Data de retorno: ");
        String empresa = JOptionPane.showInputDialog(null, "Empresa area: ");
        String passagem = "DETALHES DA PASSAGEM " + "\nOrigem: " + origem + "\nDestino: " + destino + "\nQuantos passageiros: " + numPessoas + "\nData ida: " + dataIda + "\nData retorno: " + dataVolta + "\nEmpresa area: " + empresa;
        JOptionPane.showMessageDialog(null , passagem);
    }
}
