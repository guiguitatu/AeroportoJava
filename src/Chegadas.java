public class Chegadas extends Aviao{

    protected String destino;
    protected String n_Voo;
    protected String empresa;
    protected int portao;

    protected String horario_Partida;
    protected int qnt_Passageiros;


    public Chegadas(String fabricante, String modelo, String porte, String empresa, int limite_Passageiros, String identificador) {
        super(fabricante, modelo, porte, empresa, limite_Passageiros, identificador);
    }

    public String getN_Voo() { return n_Voo; }

    public String getDestino() { return destino; }

    public String getEmpresa() { return empresa; }

    public int getPortao() { return portao; }
    public String getHorario_Partida(){ return horario_Partida; }

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
