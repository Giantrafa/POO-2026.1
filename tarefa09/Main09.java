import java.util.Scanner;

public class Main09 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {        
        int opcao = -1;

        Calculadora calc = new Calculadora();
        Validador val = new Validador();

        while (opcao != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Dividir");
            System.out.println("2 - Verificar idade");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        calc.dividir(sc);
                        break;
                    case 2:
                        val.verificarIdade(sc);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } 
            catch (Exception e) {
                System.out.println("Erro no menu!");
                e.printStackTrace();
                sc.nextLine(); // limpar buffer
            }
        }
        sc.close();
    }
}