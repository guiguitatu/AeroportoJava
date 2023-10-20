public class Status extends Aviao{

    protected String destino;
    protected String origem;
    protected String n_Voo;
    protected String empresa;
    protected int portao;
    protected String horario_Voo;
    protected int qnt_Passageiros;

    

    public Status(String fabricante, String modelo, String porte, String empresa, int limite_Passageiros, String identificador, String destino, String origem, String n_Voo, String empresa1, int portao, String horario_Voo, int qnt_Passageiros) {
        super(fabricante, modelo, porte, empresa, limite_Passageiros, identificador);
        this.destino = destino;
        this.origem = origem;
        this.n_Voo = n_Voo;
        this.empresa = empresa1;
        this.portao = portao;
        this.horario_Voo = horario_Voo;
        this.qnt_Passageiros = qnt_Passageiros;
    }

    public String getN_Voo() { return n_Voo; }

    public String getDestino() { return destino; }

    public String getEmpresa() { return empresa; }

    public int getPortao() { return portao; }
    public String getHorario_Partida(){ return horario_Voo; }

    public int getPassageiros() { return qnt_Passageiros;}

    protected void partida(){

    }

    protected String embarque(){
        if(limite_Passageiros > qnt_Passageiros) {
            return ("Não foi possível embarcar, houve um overbooking.");
        } else {
            return ("Passageiro embarcado com sucesso");
        }
    }

    @Override
    protected void desembarque() {

    }

    @Override
    protected void docking() {

    }

}
