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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }
}
