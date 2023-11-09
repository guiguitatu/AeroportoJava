import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        InterfaceGrafica.abrir(new Home().mostrar());

/*

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int count = 0;
        ArrayList<Status> chegadas = new ArrayList<>();
        chegadas.add(new Status("Embraer", "ECJ-900", "Pequeno", "Azul", 20, "PP-EAC", "São paulo", "Curitiba", "",  8500, 2, "12:20", 15, 3));
        chegadas.add(new Status("Cesna", "CRJ-180", "Médio", "Gol", 40, "PA-CPJ", "Rio de Janeiro", "Curitiba", "", 2570, 1, "13:20", 15, 4));
        chegadas.add(new Status("Boeing", "B-737-100", "Médio", "Gol", 100, "PZ-GHI", "Curitiba", "Cascavel", "",3510, 3, "12:00", 40, 1));
        chegadas.add(new Status("Airbus", "A-350", "Grande", "Latam", 250, "PP-GZH", "Curitiba", "Fortaleza", "", 3510, 4, "12:20", 40, 6));
        System.out.println("Bem vind@ ao AEROADM.");
        while (escolha != 28) {
            //Nosso Radar
            if (count == 5) {
                0- chegando para pouso
                1- taxiando para o portão
                2- Desembarcando passageiros
                3- Embarque
                4-embarque imediato
                5-última chamada
                6-saiu do portão
                7-taxiando
                8- decolou
                9-
                Random random = new Random();
                int port = 0;
                for (Status radar : chegadas) {

                    if (radar.getStatus() == 5){
                        port = radar.getPortao();
                    }

                    if (radar.getStatus() == 8) {
                        chegadas.remove(radar);
                    }

                    if (radar.getStatus() == 0) {
                        radar.setStatus(1);
                    } else if (radar.getStatus() == 1) {
                        radar.setStatus(2);
                    } else if (radar.getStatus() == 2) {
                        radar.setStatus(3);
                    } else if (radar.getStatus() == 3) {
                        radar.setStatus(4);
                    } else if (radar.getStatus() == 4) {
                        radar.setStatus(5);
                    } else if (radar.getStatus() == 5) {
                        radar.setStatus(6);
                    } else if (radar.getStatus() == 6) {
                        radar.setPortao(0);
                        radar.setStatus(7);
                    } else if (radar.getStatus() == 7) {
                        radar.setStatus(8);
                    }

                    if (radar.getStatus() == 3) {
                        int ran = random.nextInt(5);
                        if (ran == 0) {
                            radar.setDestino("São Paulo");
                        } else if (ran == 1) {
                            radar.setDestino("Salvador");
                        } else if (ran == 2) {
                            radar.setDestino("Porto Alegre");
                        } else if (ran == 3) {
                            radar.setDestino("Rio de Janeiro");
                        } else if (ran == 4) {
                            radar.setDestino("Fortaleza");
                        }
                    }

                }

                int viao = random.nextInt(5);
                int lindonjohnson = random.nextInt(5);
                String robervaldo = "";
                if (lindonjohnson == 0) {
                    robervaldo = "São Paulo";
                } else if (lindonjohnson == 1) {
                    robervaldo = "Salvador";
                } else if (lindonjohnson == 2) {
                    robervaldo = "Porto Alegre";
                } else if (lindonjohnson == 3) {
                    robervaldo = "Rio de Janeiro";
                } else if (lindonjohnson == 4) {
                    robervaldo = "Fortaleza";
                }
                if(viao == 0){
                    chegadas.add(new Status("Embraer", "ENJ-170", "Pequeno", "Azul", 40, "PP-HGZ", "Curitiba",robervaldo, "", 1599, port, "12:00", 40, 0));
                } else if (viao == 1) {
                    chegadas.add(new Status("Boeing", "B-737-200", "Médio", "Gol", 100, "PZ-AGC", "Curitiba",robervaldo, "", 1785, port, "12:10", 74, 0));
                } else if (viao == 2) {
                    chegadas.add(new Status("Cesna", "CNJ-180", "Pequeno", "Emirates", 50, "PG-GBC", "Curitiba", robervaldo, "", 1654, port, "12:20", 30, 0));
                } else if (viao == 3) {
                    chegadas.add(new Status("Boeing", "B-747-400", "Ultra grande", "Delta", 660, "PP-AZG", "Curitiba", "", robervaldo, 1445, port, "11:50", 447, 0));
                } else if (viao == 4) {
                    chegadas.add(new Status("Airbus", "A-320", "Pequeno", "Latam", 80, "PG-ADZ", "Curitiba", robervaldo, "", 2346, port, "16:00", 35, 0));
                }
                count = 0;

            }

            System.out.println("""
                    O que você gostaria de fazer?
                    1- verificar a lista de aviões que estáo de chegadas no aeroporto.
                    2- Verificar a lista de aviões que estão de saídas no aeroporto.
                    3- Cadastrar um passageiro e imprimir sua passagem.
                    28- Sair do sistema.
                    """);
            escolha = scanner.nextInt();
            if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 28) {
                if (escolha == 3) {
                    // Criando um objeto Passageiro e capturando suas informações
                    Passageiro passageiro = new Passageiro();

                    System.out.print("Digite o nome do passageiro: ");
                    String nome = scanner.nextLine();
                    passageiro.setNome(nome);

                    System.out.print("Digite o número do passaporte: ");
                    String numeroPassaporte = scanner.nextLine();
                    passageiro.setNumeroPassaporte(numeroPassaporte);

                    passageiro.capturarDataNascimento(); // Captura informações da data
                    passageiro.capturarInformacoesBagagem(); // Captura informações de bagagem

                    System.out.println("Detalhes do Passageiro:");
                    System.out.println("Nome: " + passageiro.getNome());
                    System.out.println("Quantidade de Bagagens: " + passageiro.getQuantidadeBagagem());
                    System.out.println("Número do Passaporte: " + passageiro.getNumeroPassaporte());
                    System.out.println("Data de Nascimento: " + passageiro.getDataNascimento());

                    int idade = passageiro.calcularIdade();
                    System.out.println("Idade: " + idade + " anos");

                    int idadeReferencia = 18;
                    if (passageiro.verificarIdade(idadeReferencia)) {
                        System.out.println("O passageiro é menor de idade.");
                    } else {
                        System.out.println("O passageiro não é menor de idade.");
                    }

                    System.out.println("Agora, vamos criar uma passagem aérea.");
                    System.out.print("Digite a origem da viagem: ");
                    String origem = scanner.next();
                    System.out.print("Digite o destino da viagem: ");
                    String destino = scanner.next();
                    System.out.print("Digite o número de pessoas: ");
                    int numPessoas;
                    if (scanner.hasNextInt()) {
                        numPessoas = scanner.nextInt();
                    } else {
                        System.out.println("Entrada inválida. Digite um número inteiro para o número de pessoas.");
                        return; // Ou trate o erro de entrada de acordo com sua lógica.
                    }
                    System.out.print("Digite a data de ida: ");
                    String dataIda = scanner.next();
                    System.out.print("Digite a data de volta: ");
                    String dataVolta = scanner.next();
                    System.out.print("Digite a empresa aérea: ");
                    String empresa = scanner.next();

                    // Criando um objeto Passagem e passando o objeto Passageiro
                    Passagem passagem = new Passagem(passageiro, origem, destino, numPessoas, dataIda, dataVolta, empresa);
                    passagem.setEmpresa(empresa); // Defina a empresa aérea

                    System.out.println("========== Passagem Aérea ==========");
                    System.out.println("Nome: " + passageiro.getNome());
                    System.out.println("Origem: " + origem);
                    System.out.println("Destino: " + destino);
                    System.out.println("Número de Pessoas: " + numPessoas);
                    System.out.println("Data de Ida: " + dataIda);
                    System.out.println("Data de Volta: " + dataVolta);
                    System.out.println("Empresa Aérea: " + empresa);
                    System.out.println("Valor por pessoa: " + passagem.calcularPreco());
                    System.out.println("=====================================");
                } else if (escolha == 1) {

                    for (Status chegada:chegadas) {
                        if(chegada.getStatus() == 0){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", chegando de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário do voo: " + chegada.getHorario_voo() + ". Status do voo: Chegando no aeroporto");
                        }else if(chegada.getStatus() == 1){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", chegando de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário do voo: " + chegada.getHorario_voo() + ". Status do voo: Taxiando para o portão");
                        }else if(chegada.getStatus() == 2){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", chegando de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário do voo: " + chegada.getHorario_voo() + ". Status do voo: Desembarcando passageiros");
                        }
                    }
                } else if (escolha == 2) {
                    for (Status chegada:chegadas) {
                        if(chegada.getStatus() == 3){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Embarque");
                        } else if (chegada.getStatus() == 4){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Embarque imediato");
                        }else if (chegada.getStatus() == 5){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Última chamada");
                        }else if (chegada.getStatus() == 6){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Saindo do portão");
                        }else if (chegada.getStatus() == 7){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Taxiando para a pista");
                        }else if (chegada.getStatus() == 7){
                            System.out.println("Voo Nº: " + chegada.getN_Voo() + ", saíndo de: " + chegada.getOrigem() + " para " + chegada.getDestino() + "\n Horário estimado de saida: " + chegada.getHorario_voo() + ". Status do voo: Decolou");
                        }
                    }
                } else if (escolha == 28) {
                    System.out.println("Você está saindo do sistema, até breve.");
                    break;
                }

            } else {
                System.out.println("Por favor insira um número válido!");
            }
            count++;
        } */
    }
}