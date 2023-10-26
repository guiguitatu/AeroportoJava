import java.util.Random;

class Passagem extends Passageiro {
    private String origem;
    private String destino;
    private int numPessoas;
    private String dataIda;
    private String dataVolta;
    private String empresa;
    private Passageiro passageiro;

    public Passagem(String nome, String sobrenome, String origem, String destino, int numPessoas, String dataIda, String dataVolta, String empresa, Passageiro passageiro) {
        super(passageiro.getNome(), passageiro.getQuantidadeBagagem(), passageiro.getDataNascimento());
        this.origem = origem;
        this.destino = destino;
        this.numPessoas = numPessoas;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.empresa = empresa;
        this.passageiro = passageiro;
    }

    public Passagem(Passageiro passageiro, String origem, String destino, int numPessoas, String dataIda, String dataVolta, String empresa) {
    }


    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double calcularPreco() {
        double precoBase = 500.0; // Preço base (valor fictício)
        double distancia = gerarDistanciaAleatoria(); // Gera uma distância aleatória
        double precoDistancia = distancia * 0.1; // Preço por 100 km (valor fictício)
        return precoBase + (precoDistancia * numPessoas);
    }

    private double gerarDistanciaAleatoria() {
        // Gere uma distância aleatória, por exemplo, entre 100 e 1000 km
        Random random = new Random();
        double distanciaMinima = 100.0;
        double distanciaMaxima = 1000.0;
        return distanciaMinima + (distanciaMaxima - distanciaMinima) * random.nextDouble();
    }

    public void imprimirPassagem(String empresaAerea) {
        double preco = calcularPreco();
        if (preco >= 0) {
            System.out.println("Preço: R$" + preco);
        } else {
            System.out.println("Não foi possível calcular o preço. Verifique as cidades de origem e destino.");
        }
        System.out.println("====================================");
    }

}