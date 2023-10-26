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
                    Passageiro passageiro = new Passageiro();

                    System.out.print("Digite o nome do passageiro: ");
                    String nome = scanner.nextLine();
                    passageiro.setNome(nome);

                    System.out.print("Digite o número do passaporte: ");
                    String numeroPassaporte = scanner.nextLine();
                    passageiro.setNumeroPassaporte(numeroPassaporte);

                    passageiro.capturarDataNascimento(); //captura informações da data
                    passageiro.capturarInformacoesBagagem(); // captura informações de bagagem


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
