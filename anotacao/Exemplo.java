package anotacao;

public class Exemplo {
     public static void main(String[] args) {        
        Motor m = new Motor("Diesel", 150, 4);
        Carro t = new Carro("toyota","aro", m);
        Moto g = new Moto("gasolina",50,2, 2);
        
        System.out.println(); 
        System.out.println("antes: "+ m.getQtdPistao());  

        // Muda a quantidade de Pistao usando o set
        m.setQtdPistao(6);
        System.out.println("Atualizado: " + m.getQtdPistao());  

        System.out.println();  
        System.out.println(t);

        System.out.println();  
        System.out.println(g);
    }
}