import java.util.Scanner;

public class Calculadora {
    public void dividir(Scanner sc) {
        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Erro geral!");
            e.printStackTrace();
        }
    }
}