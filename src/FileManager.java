import java.io.*;
import java.util.*;

public class FileManager extends Exception{

    private boolean lindonjohnson = false;
    private String caminhoArquivo;
    private Random random = new Random();
    ArrayList<Status> chegadas = new ArrayList<>();

    private void ColocaItensArray(){
        chegadas.add(new Status("Embraer", "ECJ-900", "Pequeno", "Azul", 20, "PP-EAC", "São paulo", "Curitiba", "", 8500, 2, "12:20", 15, 3));
        chegadas.add(new Status("Cesna","CRJ-180","Médio","Gol",40,"PA-CPJ","Curitiba","Rio de Janeiro", "",2570,1,"13:30",15,4));
        chegadas.add(new Status("Boeing","B-737-100","Médio","Gol",100,"PZ-GHI","Curitiba","Cascavel", "",3510,3,"12:00",40,0));
        chegadas.add(new Status("Airbus","A-350","Grande","Latam",250,"PP-GZH","Curitiba","Fortaleza", "",3510,4,"12:20",40,6));
        chegadas.add(new Status("Boeing","B-787","Grande","Gol",230,"PP-GZA","Curitiba", "Novo Hamburgo", "",5,5142,"12:25",120,1));
        chegadas.add(new Status("Embraer","E-195","Pequeno","Azul",130,"PG-ZGO","Curitiba","Rio Branco", "",7,8451,"13:10",130,8));
        chegadas.add(new Status("ATR", "ATR-72","Pequeno","Azul",60,"PP-GMA","Curitiba","Foz do Iguaçu", "",9,9824,"12:40",45,2));
        chegadas.add(new Status("Boeing","B-747-300","Ultra grande","Air France",400,"PG-AZR","Curitiba","Paris", "",6,3574,"12:10",380,5));
        chegadas.add(new Status("Airbus","A-320","Médio","Latam",120,"PP-GFA","Curitiba","Florianópolis", "",8456,8,"13:00",120,7));
    }


    public FileManager(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void AviaoAeroporto() {
        if(!lindonjohnson) {
            ColocaItensArray();
            lindonjohnson = true;
        }
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
                    case "2" -> situacao = "Desembarcando passageiros";
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

    public void Desembarque() {
        if(!lindonjohnson) {
            ColocaItensArray();
            lindonjohnson = true;
        }
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
                    case "2" -> situacao = "Desembarcando passageiros";
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

    public void teste(){
        if (!lindonjohnson){
            ColocaItensArray();
            lindonjohnson = true;
        }
        ImprimiArraylist();
        mudarnumero();
        Escrever();
        ImprimiArraylist();
    }

    public void Embarque() {

        if(!lindonjohnson) {
            ColocaItensArray();
            lindonjohnson = true;
        }

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

    private void ImprimiArraylist(){
        for (Status item:chegadas) {
            System.out.println(item);
        }
    }

    private void mudarnumero(){
        int bacias = 0;
        for (Status a: chegadas) {
            try {
                Status indice = chegadas.get(bacias);
                if (chegadas.get(bacias).status <= 8){
                    indice.setStatus(a.status + 1);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            bacias++;
        }
    }

    private void Escrever(){

        /*
Arquivo CSV para reserva
         */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            File arquivoCSV = new File(caminhoArquivo);

            if (arquivoCSV.exists()) {
                try {
                    arquivoCSV.delete();  // Exclui o arquivo CSV existente
                    arquivoCSV.createNewFile();  // Cria um novo arquivo vazio com o mesmo nome

                    System.out.println("Arquivo CSV limpo com sucesso.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("Erro ao limpar o arquivo CSV.");
                }
            } else {
                System.err.println("O arquivo CSV especificado não foi encontrado.");
            }
            String cabecalho = "fabricante,modelo,porte,empresa,limite_Passageiros,identificador,destino,origem,n_Voo,portao,horario_Voo,qnt_Passageiros,status";
            writer.write(cabecalho);
            writer.newLine();
            for (Status status : chegadas) {
                String linha = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%d,%d,%s,%d,%d",
                        status.getFabricante(),
                        status.getModelo(),
                        status.getPorte(),
                        status.getEmpresa(),
                        status.getLimite_Passageiros(),
                        status.getIdentificador(),
                        status.getDestino(),
                        status.getOrigem(),
                        status.getN_Voo(),
                        status.getPortao(),
                        status.getHorario_voo(),
                        status.getPassageiros(),
                        status.getStatus());

                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Novo arquivo CSV foi criado com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Radar() {
        int nport = 0;
        int count = 0;
        int num = random.nextInt(4);
        int voo = random.nextInt(10000);

        mudarnumero();

        chegadas.removeIf(item -> item.getStatus() == 9);

        switch (num) {
            case 0 -> {
                chegadas.add(new Status("Embraer", "E-190", "Pequeno", "Azul", 20, "PP-EAC", "Curitiba", "São Paulo", "", 8500, 2, "12:20", 15, 0));
                Escrever();
            }
            case 1 -> {
                chegadas.add(new Status("Cesna", "CRJ-180", "Médio", "Gol", 40, "PA-CPJ", "Curitiba", "Rio de Janeiro", "", 2570, 1, "13:20", 15, 0));
                Escrever();
            }
            case 2 -> {
                chegadas.add(new Status("Boeing", "B-737-200", "Médio", "Gol", 140, "PZ-GHI", "Curitiba", "Cascavel", "", 510, 3, "12:00", 6, 0));
                Escrever();
            }
            case 3 -> {
                chegadas.add(new Status("Airbus", "A-350", "Grande", "Latam", 250, "PP-GZH", "Curitiba", "Fortaleza", "", 3510, 4, "12:20", 40, 0));
                Escrever();
            }
        }
    }
}
