import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro();

        System.out.print("Digite o nome do passageiro: ");
        Scanner scanner = new Scanner(System.in);
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
    }
}
