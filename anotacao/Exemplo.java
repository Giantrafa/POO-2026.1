package anotacao;

public class Exemplo {
     public static void main(String[] args) {        
        Motor m = new Motor("Diesel", 150, 4);
        Carro t = new Carro("toyota","aro", m);
        
        System.out.println(m.getQtdPistao());  
        // Muda a quantidade de Pistao usando o set
        m.setQtdPistao(6);
        System.out.println(m.getQtdPistao());          
        System.out.println(t);
    }
}