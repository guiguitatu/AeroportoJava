import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//classe passageiro
public class Passageiro {
    private String nome;
    private Float quantidadeBagagem;
    private Date dataNascimento;
    private String numeroPassaporte;

    //construtor da classe passageiro
    public Passageiro(String nome, Float quantidadeBagagem, Date dataNascimento) {
        this.nome = nome;
        this.quantidadeBagagem = quantidadeBagagem;
        this.dataNascimento = dataNascimento;
    }

    public Passageiro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getQuantidadeBagagem() {
        return quantidadeBagagem;
    }

    public void setQuantidadeBagagem(Float quantidadeBagagem) {
        this.quantidadeBagagem = quantidadeBagagem;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public void capturarInformacoesBagagem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de bagagens: ");
        int quantidadeBagagens = scanner.nextInt();
        scanner.nextLine();

        float pesoTotal = 0.0f;
        for (int i = 1; i <= quantidadeBagagens; i++) {
            System.out.print("Digite o peso da bagagem " + i + " (em kg): ");
            float peso = scanner.nextFloat();
            pesoTotal += peso;
        }

        if (pesoTotal > 20.0f) {
            System.out.println("Peso total excede o limite permitido de 20 kg.");
            float taxaExtra = pesoTotal - 20.0f;
            System.out.println("Taxa extra de R$" + (taxaExtra * 5) + " a ser paga.");
        } else {
            System.out.println("Peso total dentro do limite permitido.");
        }

        this.quantidadeBagagem = (float) quantidadeBagagens;
    }

    //metodo para pegar a data de nascimento do usuario
    public void capturarDataNascimento() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        boolean dataValida = false;
        while (!dataValida) {
            try {
                System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
                String dataNascimentoStr = scanner.nextLine();
                this.dataNascimento = dateFormat.parse(dataNascimentoStr);
                dataValida = true;
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
            }
        }
    }


    //metodo para calcular a idade
    public int calcularIdade() {
        Date dataAtual = new Date();
        long diferencaEmMillis = dataAtual.getTime() - dataNascimento.getTime();
        long idadeEmMillis = diferencaEmMillis / (1000L * 60 * 60 * 24 * 365);

        return (int) idadeEmMillis;
    }

    //metodo para vereficar se é menor de idade ou não
    public boolean verificarIdade(int idadeReferencia) {
        int idade = calcularIdade();
        return idade < idadeReferencia;
    }
}







