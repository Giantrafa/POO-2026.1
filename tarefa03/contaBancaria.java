package tarefa03;

public class contaBancaria {
    private String nome;
    private int numero;
    private double saldo;


    contaBancaria (String nome, int numero, double saldoinicial){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldoinicial;
    }
        
    void criarConta(){
        System.out.println("Digite o nome do titular:");
    }

    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado!");
        }else{
            System.out.println("Valor inválido!");
        }
    }
    
    void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido! O saque deve ser positivo.");
        }
    
        else if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        }
    
        else{
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    void exibirSaldo(){
        System.out.println("Número da conta: " + numero);
        System.out.println("Nome do titular: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}