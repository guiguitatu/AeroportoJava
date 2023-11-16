abstract public class Aviao {

    protected String fabricante;
    protected String modelo;
    protected String porte;
    protected String empresa;
    protected int limite_Passageiros;
    protected String identificador;

    public Aviao(String fabricante, String modelo, String porte, String empresa, int limite_Passageiros, String identificador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.porte = porte;
        this.empresa = empresa;
        this.limite_Passageiros = limite_Passageiros;
        this.identificador = identificador;
    }

    abstract protected String embarque();
    protected void desembarque(){}
    abstract protected void docking();

    abstract protected void decolar();

    abstract protected void pousar();
}
