import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class FileManager extends Exception{
    private String caminhoArquivo;
    private Random random = new Random();
    String[][] lista = {
            {"Embraer", "ECJ-900", "Pequeno", "Azul", "20", "PP-EAC", "São paulo", "Curitiba", "8500", "2", "12:20", "15", "0"}
    };


    public FileManager(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void AviaoAeroporto() {
        File file = new File(caminhoArquivo);
        String situacao = "";
        System.out.println(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        try {
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader br = new BufferedReader(arquivo);
            String cabecalho = br.readLine();
            System.out.println(cabecalho);
            while (br.ready()) {
                String dado = br.readLine();
                String[] dadoSeparado = dado.split(",");
                List<String> dadoTratado = Arrays.asList(dadoSeparado);
                switch (dadoTratado.get(12)) {
                    case "0" -> situacao = "Chegando no aeroporto";
                    case "1" -> situacao = "Taxiando para o portão";
                    case "2" -> situacao = "Desenbarcando passageiros";
                    case "3" -> situacao = "Embarque";
                    case "4" -> situacao = "Embarque imediato";
                    case "5" -> situacao = "Última chamada";
                    case "6" -> situacao = "Saiu do portão";
                    case "7" -> situacao = "Taxiando para a pista";
                    case "8" -> situacao = "Saiu do aeroporto";
                }
                System.out.println("Fabricante: " + dadoTratado.get(0) + "/ Modelo: " + dadoTratado.get(1) + "/ Porte:" + dadoTratado.get(2) + "/ Empresa:" + dadoTratado.get(3) + "/ Limite de Passageiros: " + dadoTratado.get(4) + "/ Identificador: " + dadoTratado.get(5) + "/ Destino: " + dadoTratado.get(6) + "/ Origem: " + dadoTratado.get(7) + "/ Número do Voo: " + dadoTratado.get(8) + "/ Portão:" + dadoTratado.get(9) + "/ Horário do voo: " + dadoTratado.get(10) + "/ Passageiros embarcados: " + dadoTratado.get(11) + "/ Situação: " + situacao);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Embarque() {
        try {
            System.out.println(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader br = new BufferedReader(arquivo);
            String cabecalho = br.readLine();
            String situacao = "";
            System.out.println(cabecalho);
            while (br.ready()) {
                String dado = br.readLine();
                String[] dadoSeparado = dado.split(",");
                List<String> dadoTratado = Arrays.asList(dadoSeparado);
                switch (dadoTratado.get(12)) {
                    case "0" -> situacao = "Chegando no aeroporto";
                    case "1" -> situacao = "Taxiando para o portão";
                    case "2" -> situacao = "Desenbarcando passageiros";
                    case "3" -> situacao = "Embarque";
                    case "4" -> situacao = "Embarque imediato";
                    case "5" -> situacao = "Última chamada";
                    case "6" -> situacao = "Saiu do portão";
                    case "7" -> situacao = "Taxiando para a pista";
                    case "8" -> situacao = "Saiu do aeroporto";
                }
                switch (dadoTratado.get(12)) {
                    case "0", "1", "2" -> System.out.println("Empresa: " + dadoTratado.get(3) + "/ Destino: " + dadoTratado.get(7) + "/ Número do Voo: " + dadoTratado.get(8) + "/ Portão: " + dadoTratado.get(9) + "/ Horário do Voo: " + dadoTratado.get(10) + "/Situação: " + situacao);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Desembarque() {
        try {
            System.out.println(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader br = new BufferedReader(arquivo);
            String cabecalho = br.readLine();
            String situacao = "";
            System.out.println(cabecalho);
            while (br.ready()) {
                String dado = br.readLine();
                String[] dadoSeparado = dado.split(",");
                List<String> dadoTratado = Arrays.asList(dadoSeparado);
                switch (dadoTratado.get(12)) {
                    case "0" -> situacao = "Chegando no aeroporto";
                    case "1" -> situacao = "Taxiando para o portão";
                    case "2" -> situacao = "Desenbarcando passageiros";
                    case "3" -> situacao = "Embarque";
                    case "4" -> situacao = "Embarque imediato";
                    case "5" -> situacao = "Última chamada";
                    case "6" -> situacao = "Saiu do portão";
                    case "7" -> situacao = "Taxiando para a pista";
                    case "8" -> situacao = "Saiu do aeroporto";
                }
                switch (dadoTratado.get(12)) {
                    case "3", "4", "5", "6", "7", "8" -> System.out.println("Empresa: " + dadoTratado.get(3) + "/ Destino: " + dadoTratado.get(7) + "/ Número do Voo: " + dadoTratado.get(8) + "/ Portão: " + dadoTratado.get(9) + "/ Horário do Voo: " + dadoTratado.get(10) + "/Situação: " + situacao);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Escrever(){
        File csvFile = new File(caminhoArquivo);
        try {
            FileWriter fileWriter = new FileWriter(csvFile, true);
            for (String[] data : lista) {
                StringBuilder line = new StringBuilder();
                line.append("\n");
                for (int i = 0; i < data.length; i++) {
                    line.append(data[i]);
                    if (i != data.length - 1) {
                        line.append(',');
                    }
                }
                fileWriter.append(line.toString());
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Radar() {
        int num = random.nextInt(5);
        switch (num){

            case 0 : {
                lista = new String[][]{
                        {"Embraer", "ECJ-900", "Pequeno", "Azul", "20", "PP-EAC", "São paulo", "Curitiba", "8500", "2", "12:20", "15", "0"}
                };
                Escrever();
            }
            case 1: {
                lista = new String[][]{
                        {"Cesna", "CRJ-180", "Médio", "Gol", "40", "PA-CPJ", "Rio de Janeiro", "Curitiba", "2570", "1", "13:20", "15", "0"}
                };
            }
        }
    }
}
