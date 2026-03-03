package tarefa02;

public class Main2 {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5);          
        Triangulo t2 = new Triangulo(5, 8);       
        Triangulo t3 = new Triangulo(3, 4, 5); 

        // Exibindo informações
        t1.exibe();
        System.out.println();
        t2.exibe();
        System.out.println();
        t3.exibe();
    }   
}