package anotacao.modeloExemplo;

// Moto herda de VeiculoBase e implementa comportamento
public class Moto extends VeiculoBase implements Veiculo {

    private int rodas;

    public Moto(String combustivel, int potencia, int pistao, int rodas) {
        super(combustivel, potencia);
        this.rodas = rodas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada!");
    }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Moto de duas rodas");
    }

    @Override
    public String toString() {
        return "Combustivel: " + getCombustivel() +
               " - CV: " + getPotencia() +
               " - Rodas: " + rodas;
    }
}