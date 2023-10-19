import java.util.Date;

public class Passagem extends Passageiro{

    private String empresa;
    private String numeroVoo;
    private String classe;
    private Date dataHorario;

    public Passagem(String nome, Float quantidadeBagagem, Date dataNascimento, String empresa, String numeroVoo, String classe, Date dataHorario) {
        super(nome, quantidadeBagagem, dataNascimento);
        this.empresa = empresa;
        this.numeroVoo = numeroVoo;
        this.classe = classe;
        this.dataHorario = dataHorario;
    }

    public Passagem(String nome, Float quantidadeBagagem, Date dataNascimento) {
        super(nome, quantidadeBagagem, dataNascimento);
    }
}
