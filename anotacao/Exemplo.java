package anotacao;

public class Exemplo {
    public static void main(String[] args) {
        
        Motor m1 = new Motor("V8", 450);

        Carro c1 = new Carro("Ford", "Mustang", m1); // construtor completo
        Carro c2 = new Carro("Fiat", "Uno");          // sobrecarga e sem motor

        System.out.println(c1);
        System.out.println("---");
        System.out.println(c2);
    }
}