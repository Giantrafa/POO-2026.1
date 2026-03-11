package anotacao;

//classe fliha, pega os atributos de |Motor| e adiciona rodas a ela
public class Moto extends Motor {
    private int rodas = 2;

    public Moto(String combustivel, int potencia, int Pistao, int rodas){
        //super chama os atributos da classe Pai, no caso Motor
        super(combustivel, potencia, Pistao);
        this.rodas = rodas;
    }

    public int getRodas(){
        return rodas;
    }
    
    public void setRodas(int rodas){
        this.rodas = rodas;
    }
}
