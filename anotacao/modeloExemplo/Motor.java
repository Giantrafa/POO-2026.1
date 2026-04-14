package anotacao.modeloExemplo;

// Motor herda da classe abstrata e implementa interface
public class Motor extends VeiculoBase implements Veiculo {

    private int qtdPistao;

    public Motor(String combustivel, int potencia, int qtdPistao) {
        super(combustivel, potencia);
        this.qtdPistao = qtdPistao;
    }

    public int getQtdPistao() {
        return qtdPistao;
    }

    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    @Override
    public void ligar() {
        System.out.println("Motor ligado!");
    }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Motor de combustão");
    }

    @Override
    public String toString() {
        return "Combustivel: " + getCombustivel() +
               " - CV: " + getPotencia() +
               " - Pistão: " + qtdPistao;
    }
}