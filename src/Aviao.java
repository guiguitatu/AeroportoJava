abstract public class Aviao {

    protected String fabricante;
    protected String modelo;
    protected String porte;
    protected String Empresa;
    protected int limite_Passageiros;
    protected String identificador;

    public Aviao(String fabricante, String modelo, String porte, String empresa, int limite_Passageiros, String identificador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.porte = porte;
        Empresa = empresa;
        this.limite_Passageiros = limite_Passageiros;
        this.identificador = identificador;
    }

    protected String embarque(){
        return("Ainda a implementar");
    }
    protected void desembarque(){

    }
    abstract protected void docking();

    protected void decolar(){

    }

    protected void pousar(){

    }
}
