import java.util.Date;

public class Passageiro {
    private String nome;
    private Float quantidadeBagagem;
    private Date dataNascimento;

    public Passageiro(String nome, Float quantidadeBagagem, Date dataNascimento) {
        this.nome = nome;
        this.quantidadeBagagem = quantidadeBagagem;
        this.dataNascimento = dataNascimento;
    }

    public Float getQuantidadeBagagem() {
        return quantidadeBagagem;
    }

    public void setQuantidadeBagagem(Float quantidadeBagagem) {
        this.quantidadeBagagem = quantidadeBagagem;
    }

    public int calcularIdade(Date dataNascimento) {


        return 0;
    }

}
