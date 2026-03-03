package tarefa04;

public class Enderesso {
    String rua;
    int numeroLugar;
    String bairro;
    String cidade;
    String estado;

    public Enderesso(String rua, int numeroLugar, String bairro, String cidade, String estado){
        this.rua = rua;
        this.numeroLugar = numeroLugar;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return rua +", " + numeroLugar +", " + bairro + ", " + cidade + "/" + estado;
    }
}