package anotacao.modeloExemplo;

public class Exemplo {

    public static void main(String[] args) {

        // POLIMORFISMO (UPCASTING)
        VeiculoBase motor = new Motor("Diesel", 150, 4);
        VeiculoBase motoBase = new Moto("Gasolina", 50, 2, 2);

        Carro carro = new Carro("Toyota", "Aro", motor);

        System.out.println("=== TESTE POO ===\n");

        // Interface em ação
        carro.ligar();

        System.out.println();

        // Abstração + polimorfismo
        motor.exibirTipo();
        motoBase.exibirTipo();

        System.out.println("\n=== OBJETOS ===\n");

        System.out.println(carro);
        System.out.println();
        System.out.println(motoBase);

        System.out.println("\n=== MODIFICAÇÃO ===\n");

        Motor m = (Motor) motor;
        m.setQtdPistao(6);

        System.out.println("Pistões atualizados: " + m.getQtdPistao());
        System.out.println("\n=== TRY/CATCH ===\n");
        
        //cria um erro de proposito par mostra a saida
        try {
            int erro = 10 / 0;
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e);
        }
    }
}