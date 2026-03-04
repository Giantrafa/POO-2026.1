package anotacao.teste;
import java.util.Scanner;

public class jogoSenha {
    public static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        // create a Senha instance with default values
        Senha jogo = new Senha("12345", 10);

        int opcao;
        do {
            System.out.println("\nAdivinhe a Senha");
            System.out.println("1 - Adivinhar senha");
            System.out.println("2 - Mostrar chances");
            System.out.println("3 - Dica");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    jogo.tentar();
                    break;
                case 2:
                    jogo.validar();
                    break;
                case 3:
                    System.out.println("Dica: apenas números");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Tente novamente");
            }
        } while (opcao != 0);
    }
}