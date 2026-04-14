package tarefa03;
import java.util.Scanner;
//Main So para o Menu

public class Main3 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        contaBancaria conta = null;
        int opcao;

        do {
            
            System.out.println("---MENU---");
            System.out.println("OPÇÃO 1 - CRIAR CONTA BANCÁRIA");
            System.out.println("OPÇÃO 2 - DEPOSITAR DINHEIRO");
            System.out.println("OPÇÃO 3 - SACAR DINHEIRO");
            System.out.println("OPÇÃO 4 - EXIBIR SALDO");
            System.out.println("OPÇÃO 0 - SAIR");

            System.out.println();
            System.out.println("Digite a opção desejada:");
            opcao = scan.nextInt();
            scan.nextLine();


            switch (opcao) {
                case 1:
                    
                    System.out.println("Nome do titular:");
                    String nome = scan.nextLine();

                    System.out.println("Número da conta:");
                    int numero = scan.nextInt();

                    System.out.println("Saldo inicial:");
                    double saldo = scan.nextDouble();

                    conta = new contaBancaria(nome, numero, saldo);
                    System.out.println("Conta criada com sucesso!");
                break;

                case 2:
                    System.out.println("Valor para depósito:");
                    double valor = scan.nextDouble(); 
                    conta.depositar(valor);                    
                break;

                case 3:
                    System.out.println("Valor para saque:");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                break;

                case 4:
                    conta.exibirSaldo();
                break;
                
                case 0:
                    System.out.println("SAINDO DO MENU...");
                break;

                default:
                    System.out.println("Opção Inválida");
                break;
            }

        } while (opcao != 0);
    }
}