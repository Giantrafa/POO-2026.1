package tarefa06;
import java.util.Scanner;

public class Main06 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String nome, info;
        int idade;
        
        nome = input.next();
        idade = input.nextInt();
        info = input.next();
        
        Pessoa pf = new PessoaFisica(nome, idade, info);
        imprime(pf);

        nome = input.next();
        idade = input.nextInt();
        info = input.next();
        
        Pessoa pj = new PessoaJuridica(nome, idade, info);
        imprime(pj);
    }

    public static void imprime(Pessoa p){
        System.out.println("Pessoa: "+ p.getNome());
        System.out.println("Idade: "+ p.getIdade());

        if(p instanceof PessoaFisica){
            System.out.println("CPF: "+ ((PessoaFisica)p).getCpf());
        }else
            System.out.println("CNPJ: "+ ((PessoaJuridica)p).getCnpj());
    }
}