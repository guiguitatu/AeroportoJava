import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        ArrayList<String> chegadas = new ArrayList<>();
        Aviao um = new Status("Embraer", "ECJ-900", "Pequeno", "Azul", 20, "PP_EAC", "São paulo", "Curitiba", "8500", 2, "12:20", 15, 1);
        Aviao dois = new Status("Cesna", "CRJ-180", "Médio", "Gol", 40, "PA_CPJ", "Rio de Janeiro", "Curitiba", "2570", 1, "13:20", 15, 0);
        while (escolha != 28) {
            System.out.println("""
                    Bem vindo ao AEROADM, o que você gostaria de fazer?
                    1- verificar a lista de aviões que estáo de chegada no aeroporto.
                    2- Verificar a lista de aviões que estão de saída no aeroporto.
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

                } else if (escolha == 28) {
                    System.out.println("Você está saindo do sistema, até breve.");
                    escolha = 28;
                }

            } else {
                System.out.println("Por favor insira um número válido!");
            }
        }
    }
}
