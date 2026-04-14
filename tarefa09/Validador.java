import java.util.Scanner;

public class Validador {

    public void verificarIdade(Scanner sc) throws IllegalArgumentException {
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }

        System.out.println("Idade válida: " + idade);
    }
}