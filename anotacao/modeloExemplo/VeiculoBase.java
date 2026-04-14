package anotacao.modeloExemplo;

// Abstração: não pode ser instanciada diretamente
public abstract class VeiculoBase {

    private String combustivel;
    private int potencia;

    public VeiculoBase(String combustivel, int potencia) {
        this.combustivel = combustivel;
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    // método abstrato (obrigatório nas filhas)
    public abstract void exibirTipo();
}