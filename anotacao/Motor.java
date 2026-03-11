package anotacao;

public class Motor {    

    //Defino como Private para quem apenas quem esta dentro do |Motor| pode usar ele
    public String combustivel;
    private int potencia;
    private int qtdPistao;

    //Crio o constructor com o |this.| para poder atribuir os dados de fora com os de dentro
    //O nome q e chamado pode ser outro mas por conveniência ele e o mesmo
    public Motor(String combustivel, int potencia, int qtdPistao) {        
        this.combustivel = combustivel;
        this.potencia = potencia;
        this.qtdPistao = qtdPistao;
    }
    
    //|get| devolve o valor do atributo (somente leitura)
    public int getPotencia(){
        return potencia;
    }

    public int getQtdPistao() {
        return qtdPistao;
    }

    //|set| vai poder modificar e conferir o dado do atributo
    public void setQtdPistao(int qtdPistao) {        
        this.qtdPistao = qtdPistao;
    }

    //O retorno para quem estiver chamando a classe
    public String toString() {
        return " Combustivel:"+ combustivel + " - " + "CV:" + potencia + " - " + "Pistão:" + qtdPistao;
    }
}