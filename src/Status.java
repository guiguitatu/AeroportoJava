import java.util.Scanner;

public class Status extends Aviao{
    protected int status;
    protected String escala;
    protected String destino;
    protected String origem;
    protected int n_Voo;
    protected int portao;
    protected String horario_Voo;
    protected int qnt_Passageiros;

    

    public Status(String fabricante, String modelo, String porte, String empresa, int limite_Passageiros, String identificador, String destino, String origem,String escala, int n_Voo, int portao, String horario_Voo, int qnt_Passageiros, int status) {
        super(fabricante, modelo, porte, empresa, limite_Passageiros, identificador);
        this.destino = destino;
        this.origem = origem;
        this.escala = escala;
        this.n_Voo = n_Voo;
        this.portao = portao;
        this.horario_Voo = horario_Voo;
        this.qnt_Passageiros = qnt_Passageiros;
        this.status = status;
    }

    public void setEscala(String escala) {this.escala = escala;}

    public void setDestino(String destino) {this.destino = destino;}

    public void setOrigem(String origem) {this.origem = origem;}

    public void setN_Voo(int n_Voo) {this.n_Voo = n_Voo;}


    public void setPortao(int portao) {this.portao = portao;}

    public void setHorario_Voo(String horario_Voo) {this.horario_Voo = horario_Voo;}

    public void setQnt_Passageiros(int qnt_Passageiros) {this.qnt_Passageiros = qnt_Passageiros;}
    public void setStatus(int status) {this.status = status;}

    public int getN_Voo() { return n_Voo; }

    public String getDestino() { return destino; }


    public int getPortao() { return portao; }
    public String getHorario_voo(){ return horario_Voo; }

    public int getPassageiros() { return qnt_Passageiros;}

    public int getStatus() {return status;}

    public String getOrigem(){return origem;}
    public String getEscala(){return escala;}

    protected void partida(){

    }

    protected String plano_de_Voo(String lugar, String lugar2){
        String destino = lugar;
        String escala = lugar2;
        return ("O Avião está indo para " + destino + " com escala em " + escala + ".");
    }
    protected String plano_de_Voo(String lugar){
        String destino = lugar;
        return ("O Avião está indo em um voo direto para: " + destino);
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
        qnt_Passageiros = 0;
    }

    @Override
    protected void docking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o fortão na qual o avião está fazendo o 'Docking'?");
        int portao = scanner.nextInt();
    }

    @Override
    protected void pousar() {
        int status = 1;
    }

    @Override
    protected void decolar() {
        int status = 3;
    }

    protected void hangarear(){
        int status = 4;
    }
}
