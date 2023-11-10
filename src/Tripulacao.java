import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Tripulacao {
    private static final List<String> NOMES_PILOTOS = List.of("Capitão Rodrigo Silva", "Comandante Ana Torres", "Capitão Carlos Mendes", "Comandante Laura Oliveira");
    private static final List<String> NOMES_COPILOTOS = List.of("Primeiro Oficial Rafael Santos", "Segunda Oficial Júlia Almeida", "Primeiro Oficial Eduardo Lima", "Segunda Oficial Camila Martins");
    private static final List<String> NOMES_AEROMOCAS = List.of("Isabela Pereira", "Lucas Souza", "Carolina Lima", "Diogo Santos");
    private static final List<String> NOMES_ENGENHEIROS = List.of("Engenheiro Gabriel Torres", "Engenheira Renata Silvan", "Engenheiro Felipe Costa", "Engenheira Beatriz Mendes");


    public List<String> gerarTripulacaoAleatoria() {
        List<String> tripulacao = new ArrayList<>();
        tripulacao.add("Piloto: " + getRandomElement(NOMES_PILOTOS));
        tripulacao.add("CoPiloto: " + getRandomElement(NOMES_COPILOTOS));
        tripulacao.add("Aeromoça: " + getRandomElement(NOMES_AEROMOCAS));
        tripulacao.add("Engenheiro de Voo: " + getRandomElement(NOMES_ENGENHEIROS));
        return tripulacao;
    }

    public String getRandomElement(List<String> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public void exibirResultado(String mensagem, List<String> tripulacao) {
        System.out.println(mensagem + tripulacao);
    }
}





